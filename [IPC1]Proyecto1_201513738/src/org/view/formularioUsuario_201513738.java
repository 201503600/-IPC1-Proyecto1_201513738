/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class formularioUsuario_201513738 extends JFrame implements ActionListener{
    JLabel lblid , lblnombre , lblapellido , lblnick , lblrol , lblpass, lblconfirmar ;
    JButton crear , cancel;
    JTextField txtid , txtnombre , txtapellido , txtusr, txtRol,txtcon,txtrecon ,txtpass, txtrepass;
    public formularioUsuario_201513738() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }
    private void configurarVentana() {
        this.setTitle("Inicio Admin");                   // colocamos titulo a la ventana
        this.setSize(500, 400);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
    private void inicializarComponentes() {
        // creamos los componentes
     lblid = new JLabel("DPI");
     lblnombre = new JLabel("Nombre");
     lblapellido = new JLabel("Apellido");
     lblnick = new JLabel("nickname");
     lblpass = new JLabel("contrasena");
     lblconfirmar= new JLabel("Confirmar");
     txtid = new JTextField();
     txtnombre = new JTextField();
     txtapellido = new JTextField();
     txtusr = new JTextField();
     txtRol = new JTextField();
     txtpass = new JTextField();
     txtrepass = new JTextField();
     
     
     
             
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
