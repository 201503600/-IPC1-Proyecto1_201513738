/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ed_ci
 */
public class CrearBibliografia_201513738 extends JFrame implements ActionListener{
    
    
    private JPanel panelCarga;
    private JPanel panelCargaMasiva;
    private JTabbedPane tabbedPane;
    private JLabel cargaMasiva;
    private JTextArea txtArea;
    private ScrollPane scroll;
    private JButton btnCarga , btnCancelar;
    
    public CrearBibliografia_201513738() {
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes  
        
    }
    
    private void inicializarComponentes() {
        // creamos los componentes
        tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(0,0,1000,700);
        
        panelCarga = new JPanel();
        panelCargaMasiva = new JPanel();
        
        txtArea = new JTextArea();
        btnCarga = new JButton("Cargar");
        btnCancelar = new JButton("Cancelar");
        
        panelCargaMasiva.setBounds(0, 0, 950, 700);
        txtArea.setBounds(75,25,800,500);
        btnCarga.setBounds(325,550,100,50);
        btnCancelar.setBounds(525,550,100,50);
        
        panelCargaMasiva.add(txtArea);
        panelCargaMasiva.add(btnCarga);
        panelCargaMasiva.add(btnCancelar);
        
        tabbedPane.addTab("Carga Individual", panelCarga);
        tabbedPane.addTab("Carga masiva", panelCargaMasiva);
        
        
        this.add(tabbedPane);

       
        
       
    }
     private void configurarVentana() {
        this.setTitle("Carga masiva/individual");                   // colocamos titulo a la ventana
        this.setSize(1000, 700);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
