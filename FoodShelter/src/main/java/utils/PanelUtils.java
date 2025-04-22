/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author 59386
 */
// this class is used to solve multi-card issue
public class PanelUtils {
    public static void addOrReplacePanel(JPanel container, String name, JPanel panel) {
        Component toRemove = null;

        // search for same JPanel
        for (Component comp : container.getComponents()) {
            if (name.equals(comp.getName())) {
                toRemove = comp;
                break;
            }
        }

        if (toRemove != null) {
            container.remove(toRemove);
        }

        panel.setName(name);
        container.add(panel, name);

        // 刷新 UI
        container.revalidate();
        container.repaint();
    }
}
