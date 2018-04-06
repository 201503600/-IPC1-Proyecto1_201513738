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
    private JLabel cargaMasiva,autor, anio , titulo , des , palabras , edicion ,temas , copias , area,categoria,isbn,tipo;
    private JTextField cMasiva ,aut , txtanio , txtTitulo , txtDes , txtPalabras , txtEdicion , txtTemas , txtCopias , txtAr , txtCat ,txtIsbn,txtTipo;
    private JTextArea txtArea;
    private ScrollPane scroll;
    private JButton btnCarga , btnCancelar , btcargar , btcancelar;
    
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
        
        txtArea = new JTextArea(15,75);
        btnCarga = new JButton("Cargar");
        btnCancelar = new JButton("Cancelar");
        btcargar = new JButton("Cargar");
        btcancelar = new JButton("Cancelar");
        cargaMasiva = new JLabel("Autor");
        autor = new JLabel("Autor");
        anio = new JLabel("año");
        titulo = new JLabel("titulo");
        des = new JLabel("Descripcion");
        palabras = new JLabel("Palabras");
        edicion = new JLabel("Edicion");
        temas = new JLabel("Temas");
        copias = new JLabel("Area");
        area = new JLabel("area");
        categoria = new JLabel("Categoria");
        isbn = new JLabel("Isbn");
        tipo = new JLabel("tipo");
        cMasiva = new JTextField();
        aut = new JTextField();
        txtanio = new JTextField();
        txtTitulo = new JTextField();
        txtDes = new JTextField();
        txtPalabras = new JTextField();
        txtEdicion = new JTextField();
        txtTemas = new JTextField();
        txtCopias = new JTextField();
        txtAr = new JTextField();
        txtCat = new JTextField();
        txtIsbn = new JTextField();
        txtTipo =new JTextField();
        
        
        
        
        panelCargaMasiva.setBounds(0, 0, 950, 700);
        panelCarga.setBounds(0, 0, 950, 700);
        panelCarga.setLayout(new GridLayout(13,2));
        
        txtArea.setBounds(75,25,800,500);
        btnCarga.setBounds(325,650,100,50);
        btnCancelar.setBounds(525,650,100,50);
       // btcargar.setBounds(325,650,100,50);
        //btcancelar.setBounds(525,650,100,50);
        panelCarga.add(autor);
        panelCarga.add(aut);
        panelCarga.add(titulo);
        panelCarga.add(txtTitulo);
        panelCarga.add(des);
        panelCarga.add(txtDes);
        panelCarga.add(palabras);
        panelCarga.add(txtPalabras);
        panelCarga.add(anio);
        panelCarga.add(txtanio);
        panelCarga.add(edicion);
        panelCarga.add(txtEdicion);
        panelCarga.add(temas);
        panelCarga.add(txtTemas);
        panelCarga.add(copias);
        panelCarga.add(txtCopias);
        panelCarga.add(area);
        panelCarga.add(txtAr);
        panelCarga.add(categoria);
        panelCarga.add(txtCat);
        panelCarga.add(isbn);
        panelCarga.add(txtIsbn);
        panelCarga.add(tipo);
        panelCarga.add(txtTipo);
        panelCarga.add(btcargar);
        panelCarga.add(btcancelar);
        
        
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
