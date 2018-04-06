/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InicioUsuario_201513738  extends JFrame  implements ActionListener{
    
    public VentanaPrincipal_201513738 instanciaPrincipal;
    
    private JButton btnLogout,btnPrestamo ,btnBiblio;
    private JLabel logo , lblLogo,lblUsuario;
    
    
    public InicioUsuario_201513738(VentanaPrincipal_201513738 instancia){
        configurarVentana();
        inicializarComponentes();
        
        this.instanciaPrincipal = instancia;
    }
    
    public VentanaPrincipal_201513738 getPrincipal(){
        return instanciaPrincipal;
    }
    
     private void configurarVentana() {
        this.setTitle("Inicio Admin");                   // colocamos titulo a la ventana
        this.setSize(600, 500);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
    
     private void inicializarComponentes(){
         lblUsuario = new JLabel();
         btnLogout = new JButton("Cerrar Sesion");
         btnBiblio = new JButton("Biblioteca virtual");
         btnPrestamo = new JButton("Prestamo de libro");
         
         lblUsuario.setBounds(300,20,150,20);
         btnLogout.setBounds(50, 50, 150, 20);
         btnBiblio.setBounds(50,220,150,20);
         btnPrestamo.setBounds(50,390,150,20);
         
         
         
         btnLogout.addActionListener(this);
         btnBiblio.addActionListener(this);
         btnPrestamo.addActionListener(this);
         
         //this.setLayout(new FlowLayout());
         this.add(lblUsuario);
         this.add(btnLogout);
         this.add(btnBiblio);
         this.add(btnPrestamo);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogout){
            instanciaPrincipal.setVisible(true);
            this.dispose();
        }
    }
}
