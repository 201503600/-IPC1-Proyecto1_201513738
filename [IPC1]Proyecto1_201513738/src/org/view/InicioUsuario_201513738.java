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

public class InicioUsuario_201513738  extends JFrame  implements ActionListener{
    
    public VentanaPrincipal_201513738 instanciaPrincipal;
    
    private JButton btnLogout,btnPrestamo ,btnBiblio;
    
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
        this.setSize(500, 400);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
    
     private void inicializarComponentes(){
         btnLogout = new JButton("Cerrar Sesion");
         btnLogout.setBounds(50, 50, 150, 20);
         btnLogout.addActionListener(this);
         
         this.add(btnLogout);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogout){
            instanciaPrincipal.setVisible(true);
            this.dispose();
        }
    }
}
