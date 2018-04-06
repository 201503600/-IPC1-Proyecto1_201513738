/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ed_ci
 */
public class VerUsuarios_2015013738  extends JFrame implements ActionListener{
    
    JLabel labelUSr;
    JTable tablaUsr;
    DefaultTableModel modelo ;
    JPanel panelPrincipal;
    Object[][] data = {{1,1,1},{2,2,2},{3,3,3},{4,4,4}};
    String[] columnNames = {"Column 1","Column 2","Column 3"};
    
     private void configurarVentana() {
        this.setTitle("Ver Usuarios");                   // colocamos titulo a la ventana
        this.setSize(500, 300);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
      private void inicializarComponentes() {
       modelo = new DefaultTableModel(data,columnNames);
       tablaUsr = new JTable(modelo);
       panelPrincipal = new JPanel();
       labelUSr = new JLabel("Listado de Usuarios registrados");
       panelPrincipal.setBounds(0, 0, 500, 300);
       labelUSr.setBounds(100,20,100,20);
       tablaUsr.setBounds(50,200,325,200);
       
       panelPrincipal.add(labelUSr);
       panelPrincipal.add(tablaUsr);
       this.add(panelPrincipal);
        
      
    }
     
     public VerUsuarios_2015013738(){
        configurarVentana();
        inicializarComponentes();
     }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
