/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.main;

import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.UIManager;
import org.view.InicioAdmin_201513738;
import org.view.VentanaPrincipal_201513738;

public class main_201513738 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{  
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
          }
          catch (Exception e)
           {
            e.printStackTrace();
           }
        
        VentanaPrincipal_201513738 v = new VentanaPrincipal_201513738();
        v.setVisible(true);
        InicioAdmin_201513738 i = new InicioAdmin_201513738();
        i.setVisible(true);
    }
    
}
