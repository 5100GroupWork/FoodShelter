/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DB4OUtil;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;
import model.FoodShelterSystem.FoodShelterConfig;
import model.FoodShelterSystem.FoodShelterSystem;


/**
 *
 * @author 59386
 * this file is basically from eco-system and I am going to do some changes to fit our program
 * 
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(FoodShelterSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(FoodShelterSystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public FoodShelterSystem retrieveSystem(){
        ObjectContainer conn = null;
        FoodShelterSystem system = null;

        try {
            conn = createConnection();
            if (conn == null) {
                System.out.println("Failed to create database connection. Creating new system configuration.");
                system = FoodShelterConfig.configure();
                return system;
            }

            ObjectSet<FoodShelterSystem> systems = conn.query(FoodShelterSystem.class);
            if (systems.size() == 0) {
                system = FoodShelterConfig.configure();
            } else {
                system = systems.get(systems.size() - 1);
            }
        } catch (Exception e) {
            System.out.println("Error retrieving system from database: " + e.getMessage());
            e.printStackTrace();

            
            system = FoodShelterConfig.configure();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        return system;
                    
    }
}
        
        
        
//        ObjectContainer conn = createConnection();
//        ObjectSet<FoodShelterSystem> systems = conn.query(FoodShelterSystem.class); // Change to the object you want to save
//        FoodShelterSystem system;
//        if (systems.size() == 0){
//            system = FoodShelterConfig.configure();  // If there's no System in the record, create a new one
//        }
//        else{
//            system = systems.get(systems.size() - 1);
//        }
//        conn.close();
//        return system;
