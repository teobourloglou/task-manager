/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taaasks;

import javax.swing.SwingUtilities;

/**
 *
 * @author teobourloglou
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SwingUtilities.invokeLater(() -> {
            Welcome welcome = new Welcome();
            welcome.setVisible(true);
        });
    }
    
}
