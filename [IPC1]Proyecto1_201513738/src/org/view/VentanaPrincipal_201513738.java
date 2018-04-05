/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal_201513738 extends JFrame implements ActionListener{
    
    private JButton btnLogin, btnAbout;
    
   
        
    private JLabel texto;           // etiqueta o texto no editable
    private JTextField caja;        // caja de texto, para insertar datos
    private JButton boton;          // boton con una determinada accion
    private JPanel panelSuperior;
    private JPanel panelCentral;
    private JPanel panelImagen;
    private JPanel panelTxt;
    private JLabel lblimg;
    

    public VentanaPrincipal_201513738() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("Biblioteca");                   // colocamos titulo a la ventana
        this.setSize(800, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    private void inicializarComponentes() {
        // creamos los componentes
        texto = new JLabel();
        caja = new JTextField();
        boton = new JButton();
        btnLogin = new JButton();
        btnAbout = new JButton();
        panelCentral = new JPanel();
        panelSuperior = new JPanel();
        panelTxt = new JPanel();
        panelImagen = new JPanel();
        // configuramos los componentes
        texto.setText("Inserte Nombre");    // colocamos un texto a la etiqueta
        texto.setBounds(50, 50, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        caja.setBounds(150, 50, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        boton.setText("Mostrar Mensaje");   // colocamos un texto al boton
        boton.setBounds(50, 100, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        btnLogin.setText("Login");
        btnLogin.setBounds(50,100,100,30);
        btnLogin.addActionListener(this);
       
        btnAbout.setText("About");
        btnAbout.setBounds(100,400,100,30);
        btnAbout.addActionListener(this);
        //
        panelSuperior.setBounds(100,10,600,50);
        panelSuperior.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.DARK_GRAY));
        panelImagen.setBounds(100,100,300,250);
        panelImagen.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.BLUE));
        panelTxt.setBounds(400,100,300,250);
        panelTxt.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.BLUE));
        
        
        
        panelSuperior.add(btnLogin);
        
        
       
        // adicionamos los componentes a la ventana
       
        this.add(panelSuperior);
        this.add(panelImagen);
        this.add(panelTxt);
        this.add(btnAbout);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = caja.getText();                                 // obtenemos el contenido de la caja de texto
        JOptionPane.showMessageDialog(this, "Hola " + nombre + ".");    // mostramos un mensaje (frame, mensaje)
    }

   
    
}
