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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InicioAdmin_201513738 extends JFrame implements ActionListener{

    JLabel lblUsuario , bibliografos , reportes ;
    JButton btnCrear , btnModificar,btnEliminar , btnMostrar ,btnCrear_ ,btnModificar_ , btnEliminar_,btnMostrar_;
    JButton btnReporteUsr , btnReporteLibros;
    
    public InicioAdmin_201513738() {
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
       lblUsuario = new JLabel("Usuarios");
       bibliografos = new JLabel("Bibliografias");
       reportes = new JLabel("Reportes");
       btnCrear = new JButton("Crear");
      btnModificar = new JButton("Modificar");
      btnEliminar = new JButton("Eliminar");
      btnMostrar = new JButton("Mostrar");
             btnCrear_ = new JButton("Crear");
      btnModificar_ = new JButton("Modificar");
      btnEliminar_ = new JButton("Eliminar");
      btnMostrar_ = new JButton("Mostrar");
      btnReporteUsr = new JButton("Reporte usuario");
      btnReporteLibros = new JButton("Reporte libro");
      
      
      
       
       
       btnCrear.setBounds(25,30,100,25);
       btnModificar.setBounds(125,30,100,25);
       btnEliminar.setBounds(225,30,100,25);
        btnMostrar.setBounds(325,30,100,25);
        
        btnCrear_.setBounds(25,150,100,25);
       btnModificar_.setBounds(125,150,100,25);
       btnEliminar_.setBounds(225,150,100,25);
        btnMostrar_.setBounds(325,150,100,25);
       
       btnReporteUsr.setBounds(125,220,120,25);
        btnReporteLibros.setBounds(250,220,100,25);
        
       lblUsuario.setBounds(20,10,100,20);
       bibliografos.setBounds(20,100,50,20);
       reportes.setBounds(20,200,100,20);
       
       
       this.add(lblUsuario);
       this.add(btnCrear);
       this.add(btnModificar);
       this.add(btnEliminar);
       this.add(btnMostrar);
       this.add(bibliografos);
       this.add(btnCrear_);
       this.add(btnEliminar_);
       this.add(btnModificar_);
       this.add(btnMostrar_);
       this.add(reportes);
       this.add(btnReporteUsr);
       this.add(btnReporteLibros);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
