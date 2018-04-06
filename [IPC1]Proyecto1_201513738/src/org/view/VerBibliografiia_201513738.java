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
import org.estructuras.NodoBibliografia_201513738;
import org.estructuras.NodoUsuario_201513738;

/**
 *
 * @author ed_ci
 */
public class VerBibliografiia_201513738 extends JFrame implements ActionListener{
       private InicioAdmin_201513738 instanciaPrincipal;
    private String[] columnNames = {"ID", "Tipo","Autor","Año publicacion","isbn","Titulo","Edicion","Palabra clave" , "descripcion"
            ,"Temas","Copias", "disponibles" ,"Categoria","Ejemplar","Area" , "Tamaño" };
    
    private JButton btnRegresar;
     
     public VerBibliografiia_201513738(InicioAdmin_201513738 instancia){
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
       JLabel labelUSr = new JLabel("Listado de Bibliografias registrados");
       panelPrincipal.setBounds(0, 0, 500, 400);
       scroll.setBounds(50, 200, 325, 200);
       labelUSr.setBounds(200,20,100,20);
       tablaUsr.setBounds(50,200,325,200);
       
       btnRegresar = new JButton("Regresar");
       btnRegresar.setBounds(0, 20, 50, 20);
       btnRegresar.addActionListener(this);
        panelPrincipal.add(btnRegresar);
       panelPrincipal.add(labelUSr);
       panelPrincipal.add(scroll);
      
       this.add(panelPrincipal);
        
      
    }
     
     private String[][] obtieneMatriz(){
         String informacion[][] = new String[this.instanciaPrincipal.getPrincipal().listBibliografia.getSize()  ][columnNames.length];
         
         NodoBibliografia_201513738 aux = this.instanciaPrincipal.getPrincipal().listBibliografia.getRaiz();
         for (int pos = 0; pos < this.instanciaPrincipal.getPrincipal().listBibliografia.getSize(); pos++){
             
                 //informacion[pos][0] = aux.getDPI();
                   informacion[pos][0] = aux.getID().toString();
                   if (aux.getTipoBibliografia() == NodoBibliografia_201513738.TIPO.LIBRO)
                       informacion[pos][1] = "Libro";
                   else if (aux.getTipoBibliografia() == NodoBibliografia_201513738.TIPO.REVISTA)
                       informacion[pos][1] = "Revista";
                   else if (aux.getTipoBibliografia() == NodoBibliografia_201513738.TIPO.TESIS)
                       informacion[pos][1] = "Tesis";
                   else if (aux.getTipoBibliografia() == NodoBibliografia_201513738.TIPO.LIBRO_DIGITAL)
                       informacion[pos][1] = "Libro Digital";
                   informacion[pos][2] = aux.getAutor();
                   informacion[pos][3] = aux.getAnioPublicacion().toString();
                   informacion[pos][4] = aux.getTitulo();
                   informacion[pos][5] = aux.getEdicion().toString();
                   
                   for(String a:aux.getPalabraClave()){
                   informacion[pos][6] += a;
                   }
                   informacion[pos][7] = aux.getDescripcion();
                   informacion[pos][8] = "";
                   for(String b:aux.getTemas()){
                   informacion[pos][8] +=b;
                   }
                   informacion[pos][9]= aux.getCopias().toString();
                   informacion[pos][10]= aux.getDisponibles().toString();
                   informacion[pos][11]= aux.getCategoria();
                   informacion[pos][12]= aux.getEjemplar().toString();
                   informacion[pos][13]= aux.getArea();
                   informacion[pos][14] = String.valueOf(aux.getTamanio());
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
