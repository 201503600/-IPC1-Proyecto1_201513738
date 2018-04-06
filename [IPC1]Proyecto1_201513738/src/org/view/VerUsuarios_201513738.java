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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import org.estructuras.NodoUsuario_201513738;

public class VerUsuarios_201513738  extends JFrame implements ActionListener{
    
    private InicioAdmin_201513738 instanciaPrincipal;
    private String[] columnNames = {"ID","Nombre","Apellido","Nickname","Password","Rol"};
    
    private JButton btnRegresar;
     
     public VerUsuarios_201513738(InicioAdmin_201513738 instancia){
        this.instanciaPrincipal = instancia;
        
        configurarVentana();
        inicializarComponentes();
        
     }
    
     private void configurarVentana() {
        this.setTitle("Ver Usuarios");                   // colocamos titulo a la ventana
        this.setSize(500, 400);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
     
      private void inicializarComponentes() {
       JTable tablaUsr = new JTable(obtieneMatriz(), columnNames);
       tablaUsr.setEnabled(false);
       JScrollPane scroll = new JScrollPane();
       scroll.setViewportView(tablaUsr);
       JPanel panelPrincipal = new JPanel();
       JLabel labelUSr = new JLabel("Listado de Usuarios registrados");
       panelPrincipal.setBounds(0, 0, 500, 400);
       scroll.setBounds(50, 200, 325, 200);
       labelUSr.setBounds(100,20,100,20);
       tablaUsr.setBounds(50,200,325,200);
       
       btnRegresar = new JButton("Regresar");
       btnRegresar.setBounds(10, 20, 100, 20);
       btnRegresar.addActionListener(this);
       
       panelPrincipal.add(labelUSr);
       panelPrincipal.add(scroll);
       panelPrincipal.add(btnRegresar);
       this.add(panelPrincipal);
        
      
    }
     
     private String[][] obtieneMatriz(){
         String informacion[][] = new String[this.instanciaPrincipal.getPrincipal().listUsuarios.getSize() - 1 ][columnNames.length];
         
         NodoUsuario_201513738 aux = this.instanciaPrincipal.getPrincipal().listUsuarios.getRaiz();
         for (int pos = 0; pos < this.instanciaPrincipal.getPrincipal().listUsuarios.getSize(); pos++){
             if (aux.getRol() != NodoUsuario_201513738.ROL.ADMIN){
                 informacion[pos][0] = aux.getDPI();
                informacion[pos][1] = aux.getNombre();
                informacion[pos][2] = aux.getApellido();
                informacion[pos][3] = aux.getNickname();
                if (aux.getRol() == NodoUsuario_201513738.ROL.CATEDRATICO)
                   informacion[pos][4] = "Catedratico";
                else if (aux.getRol() == NodoUsuario_201513738.ROL.ESTUDIANTE)
                   informacion[pos][4] = "Estudiante";
                informacion[pos][5] = aux.getPass();
             }
             aux = aux.getSiguiente();
         }
         
         return informacion;
     }
     
    @Override
    public void actionPerformed(ActionEvent e) {
       instanciaPrincipal.setVisible(true);
       this.dispose();
    }
    
}
