/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.estructuras.NodoBibliografia_201513738;

/**
 *
 * @author ed_ci
 */
public class CrearBibliografia_201513738 extends JFrame implements ActionListener{
    
    private InicioAdmin_201513738 instanciaPrincipal;
    
    private JPanel panelCarga;
    private JPanel panelCargaMasiva;
    private JTabbedPane tabbedPane;
    private JLabel lblAutor, lblAnio, lblTitulo, lblDescripcion, lblPalabras, lblEdicion, lblTemas, lblCopias, lblArea, lblCategoria, lblIsbn, lblTipo, lblEjemplar, lblTamanio;
    private JTextField txtAutor, txtAnio, txtTitulo, txtDescripcion, txtPalabras, txtEdicion, txtTemas, txtCopias, txtArea, txtCategoria, txtIsbn, txtEjemplar, txtTamanio;
    private JComboBox cmbTipo;
    private JTextArea txtCarga;
    private ScrollPane scroll;
    private JButton btnCarga , btnCancelar , btcargar , btcancelar;
    
    public CrearBibliografia_201513738(InicioAdmin_201513738 instancia) {
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes  
        
        this.instanciaPrincipal = instancia;
    }
    
    private void inicializarComponentes() {
        // creamos los componentes
        tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(0,0,1000,400);
        
        panelCarga = new JPanel();
        panelCargaMasiva = new JPanel();
        
        txtCarga = new JTextArea(15,75);
        btnCarga = new JButton("Cargar");
        btnCancelar = new JButton("Cancelar");
        
        btcargar = new JButton("Cargar");
        btcancelar = new JButton("Cancelar");
        
        btnCarga.addActionListener(this);
        btnCancelar.addActionListener(this);
        btcargar.addActionListener(this);
        btcancelar.addActionListener(this);
        
        lblAutor  = new JLabel("Autor");
        lblAnio = new JLabel("Año");
        lblTitulo = new JLabel("Titulo");
        lblDescripcion = new JLabel("Descripcion");
        lblPalabras = new JLabel("Palabras");
        lblEdicion = new JLabel("Edicion");
        lblTemas = new JLabel("Temas");
        lblCopias = new JLabel("Copias");
        lblArea = new JLabel("Area");
        lblCategoria = new JLabel("Categoria");
        lblIsbn = new JLabel("Isbn");
        lblTipo = new JLabel("Tipo");
        lblEjemplar = new JLabel("Ejemplar");
        lblTamanio = new JLabel("Tamanio");
        
        txtAutor = new JTextField();
        txtAnio = new JTextField();
        txtTitulo = new JTextField();
        txtDescripcion = new JTextField();
        txtPalabras = new JTextField();
        txtEdicion = new JTextField();
        txtTemas = new JTextField();
        txtCopias = new JTextField();
        txtArea = new JTextField();
        txtCategoria = new JTextField();
        txtIsbn = new JTextField();
        txtEjemplar =new JTextField();        
        txtTamanio = new JTextField();
        cmbTipo = new JComboBox();
        cmbTipo.addItem("Libro");
        cmbTipo.addItem("Revista");
        cmbTipo.addItem("Tesis");
        cmbTipo.addItem("Libro Digital");
        cmbTipo.addActionListener(this);
        cmbTipo.setSelectedIndex(0);
        
        panelCargaMasiva.setBounds(0, 0, 950, 500);
        panelCarga.setBounds(0, 0, 950, 700);
        panelCarga.setLayout(new GridLayout(15,2));
        
        txtCarga.setBounds(75,25,800,500);
        btnCarga.setBounds(325,650,100,50);
        btnCancelar.setBounds(525,650,100,50);
        
        panelCarga.add(lblAutor);
        panelCarga.add(txtAutor);
        panelCarga.add(lblAnio);
        panelCarga.add(txtAnio);
        panelCarga.add(lblIsbn);
        panelCarga.add(txtIsbn);
        panelCarga.add(lblTitulo);
        panelCarga.add(txtTitulo);
        panelCarga.add(lblEdicion);
        panelCarga.add(txtEdicion);
        panelCarga.add(lblPalabras);
        panelCarga.add(txtPalabras);
        panelCarga.add(lblDescripcion);
        panelCarga.add(txtDescripcion);
        panelCarga.add(lblTemas);
        panelCarga.add(txtTemas);
        panelCarga.add(lblCopias);
        panelCarga.add(txtCopias);
        panelCarga.add(lblCategoria);
        panelCarga.add(txtCategoria);
        panelCarga.add(lblEjemplar);
        panelCarga.add(txtEjemplar);
        panelCarga.add(lblArea);
        panelCarga.add(txtArea);
        panelCarga.add(lblTamanio);
        panelCarga.add(txtTamanio);
        panelCarga.add(lblTipo);
        panelCarga.add(cmbTipo);
        panelCarga.add(btcargar);
        panelCarga.add(btcancelar);       
        JScrollPane scroll = new JScrollPane(panelCarga, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setViewportView(panelCarga);
        panelCarga.setPreferredSize(new Dimension(500, 500));
        
        panelCargaMasiva.add(txtCarga);
        panelCargaMasiva.add(btnCarga);
        panelCargaMasiva.add(btnCancelar);
        
        tabbedPane.addTab("Carga Individual", scroll);
        tabbedPane.addTab("Carga masiva", panelCargaMasiva);
        
        this.add(tabbedPane);

    }
    
     private void configurarVentana() {
        this.setTitle("Carga masiva/individual");                   // colocamos titulo a la ventana
        this.setSize(1000, 450);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btcargar){ // Carga individual
             switch(cmbTipo.getSelectedItem().toString()){
                 case "Libro":
                     if (!txtAutor.getText().equals("") && !txtAnio.getText().equals("") && !txtTitulo.getText().equals("") 
                             && !txtDescripcion.getText().equals("") && !txtPalabras.getText().equals("") && !txtEdicion.getText().equals("") 
                             && !txtTemas.getText().equals("") && !txtCopias.getText().equals("") && !txtIsbn.getText().equals("")){
                         Integer anio, isbn, edicion, copias;
                         try{
                                 anio = Integer.parseInt(txtAnio.getText());
                                 isbn = Integer.parseInt(txtIsbn.getText());
                                 edicion = Integer.parseInt(txtEdicion.getText());
                                 copias = Integer.parseInt(txtCopias.getText());
                                this.instanciaPrincipal.getPrincipal().listBibliografia.agregarBibliografia(new NodoBibliografia_201513738(this.instanciaPrincipal.getPrincipal().listBibliografia.CORRELATIVO++, 
                                                                                                                                                                                                                                            txtAutor.getText(), anio, isbn, txtTitulo.getText(), edicion, 
                                                                                                                                                                                                                                            txtPalabras.getText().split(","), txtDescripcion.getText(), 
                                                                                                                                                                                                                                            txtTemas.getText().split(","), copias, copias));
                                JOptionPane.showMessageDialog(this, "Libro creado correctamente!");
                             }catch(NumberFormatException ex){
                                 JOptionPane.showMessageDialog(this, "Ocurrio un error, revise sus datos");
                             }
                     }else 
                         JOptionPane.showMessageDialog(this, "Los campos disponibles deben llenarse");
                    break;
                case "Revista":
                    if (!txtAutor.getText().equals("") && !txtAnio.getText().equals("") && !txtTitulo.getText().equals("") 
                            && !txtDescripcion.getText().equals("") && !txtPalabras.getText().equals("") 
                            && !txtEdicion.getText().equals("") && !txtTemas.getText().equals("") && !txtCopias.getText().equals("")
                            && !txtCategoria.getText().equals("") && !txtEjemplar.getText().equals("")){
                        Integer anio, edicion, ejemplar, copias;
                         try{
                                 anio = Integer.parseInt(txtAnio.getText());
                                 edicion = Integer.parseInt(txtEdicion.getText());
                                 ejemplar = Integer.parseInt(txtEjemplar.getText());
                                 copias = Integer.parseInt(txtCopias.getText());
                                this.instanciaPrincipal.getPrincipal().listBibliografia.agregarBibliografia(new NodoBibliografia_201513738(this.instanciaPrincipal.getPrincipal().listBibliografia.CORRELATIVO++, 
                                                                                                                                                                                                                                            txtAutor.getText(), anio, txtTitulo.getText(), edicion, txtDescripcion.getText(),
                                                                                                                                                                                                                                            txtCategoria.getText(), ejemplar, txtTemas.getText().split(","),
                                                                                                                                                                                                                                            txtPalabras.getText().split(","), copias, copias));
                                JOptionPane.showMessageDialog(this, "Revista creada correctamente!");
                             }catch(NumberFormatException ex){
                                 JOptionPane.showMessageDialog(this, "Ocurrio un error, revise sus datos");
                             }
                    }else 
                         JOptionPane.showMessageDialog(this, "Los campos disponibles deben llenarse");
                    break;
                case "Tesis":
                    if (!txtAutor.getText().equals("") && !txtAnio.getText().equals("") && !txtTitulo.getText().equals("") 
                            && !txtDescripcion.getText().equals("") && !txtPalabras.getText().equals("") 
                            && !txtEdicion.getText().equals("") && !txtTemas.getText().equals("") && !txtCopias.getText().equals("")
                            && !txtArea.getText().equals("")){
                        Integer anio, edicion, copias;
                         try{
                                 anio = Integer.parseInt(txtAnio.getText());
                                 edicion = Integer.parseInt(txtEdicion.getText());
                                 copias = Integer.parseInt(txtCopias.getText());
                                this.instanciaPrincipal.getPrincipal().listBibliografia.agregarBibliografia(new NodoBibliografia_201513738(this.instanciaPrincipal.getPrincipal().listBibliografia.CORRELATIVO++, 
                                                                                                                                                                                                                                            txtAutor.getText(), anio, txtTitulo.getText(), txtPalabras.getText().split(","), 
                                                                                                                                                                                                                                            txtArea.getText(),  txtTemas.getText().split(","),
                                                                                                                                                                                                                                            txtDescripcion.getText(), edicion, copias, copias));
                                JOptionPane.showMessageDialog(this, "Tesis creada correctamente!");
                             }catch(NumberFormatException ex){
                                 JOptionPane.showMessageDialog(this, "Ocurrio un error, revise sus datos");
                             }
                    }else 
                         JOptionPane.showMessageDialog(this, "Los campos disponibles deben llenarse");
                    break;
                case "Libro Digital":
                    if (!txtAutor.getText().equals("") && !txtAnio.getText().equals("") && !txtTitulo.getText().equals("") 
                            && !txtDescripcion.getText().equals("") && !txtPalabras.getText().equals("") 
                            && !txtEdicion.getText().equals("") && !txtTemas.getText().equals("") && !txtTamanio.getText().equals("")){
                        Integer anio, edicion, tamanio;
                         try{
                                 anio = Integer.parseInt(txtAnio.getText());
                                 edicion = Integer.parseInt(txtEdicion.getText());
                                 tamanio = Integer.parseInt(txtTamanio.getText());
                                this.instanciaPrincipal.getPrincipal().listBibliografia.agregarBibliografia(new NodoBibliografia_201513738(this.instanciaPrincipal.getPrincipal().listBibliografia.CORRELATIVO++, 
                                                                                                                                                                                                                                            txtAutor.getText(), anio, txtTitulo.getText(), edicion, 
                                                                                                                                                                                                                                            txtPalabras.getText().split(","), txtDescripcion.getText(), 
                                                                                                                                                                                                                                            txtTemas.getText().split(","), tamanio));
                                JOptionPane.showMessageDialog(this, "Libro digital creado correctamente!");
                             }catch(NumberFormatException ex){
                                 JOptionPane.showMessageDialog(this, "Ocurrio un error, revise sus datos");
                             }
                    }else 
                         JOptionPane.showMessageDialog(this, "Los campos disponibles deben llenarse");
                    break;
             }
        }
        else if (e.getSource() == btnCarga){ // Carga masiva
            String [] bibliografias = txtCarga.getText().split("\n");
            for (int i = 0; i < bibliografias.length; i++){
                
            }
        }
        else if (e.getSource() == btcancelar || e.getSource() == btnCancelar){
            this.instanciaPrincipal.setVisible(true);
            this.dispose();
        }
        else if (e.getSource() == cmbTipo){
            limpiarCampos();
            switch(cmbTipo.getSelectedItem().toString()){
                case "Libro":
                    txtAutor.setEnabled(true);
                    txtAnio.setEnabled(true);
                    txtTitulo.setEnabled(true);
                    txtDescripcion.setEnabled(true);
                    txtPalabras.setEnabled(true);
                    txtEdicion.setEnabled(true);
                    txtTemas.setEnabled(true);
                    txtCopias.setEnabled(true);
                    txtArea.setEnabled(false);
                    txtCategoria.setEnabled(false);
                    txtIsbn.setEnabled(true);
                    txtEjemplar.setEnabled(false);
                    txtTamanio.setEnabled(false);
                    break;
                case "Revista":
                    txtAutor.setEnabled(true);
                    txtAnio.setEnabled(true);
                    txtTitulo.setEnabled(true);
                    txtDescripcion.setEnabled(true);
                    txtPalabras.setEnabled(true);
                    txtEdicion.setEnabled(true);
                    txtTemas.setEnabled(true);
                    txtCopias.setEnabled(true);
                    txtArea.setEnabled(false);
                    txtCategoria.setEnabled(true);
                    txtIsbn.setEnabled(false);
                    txtEjemplar.setEnabled(true);
                    txtTamanio.setEnabled(false);
                    break;
                case "Tesis":
                    txtAutor.setEnabled(true);
                    txtAnio.setEnabled(true);
                    txtTitulo.setEnabled(true);
                    txtDescripcion.setEnabled(true);
                    txtPalabras.setEnabled(true);
                    txtEdicion.setEnabled(true);
                    txtTemas.setEnabled(true);
                    txtCopias.setEnabled(true);
                    txtArea.setEnabled(true);
                    txtCategoria.setEnabled(false);
                    txtIsbn.setEnabled(false);
                    txtEjemplar.setEnabled(false);
                    txtTamanio.setEnabled(false);
                    break;
                case "Libro Digital":
                    txtAutor.setEnabled(true);
                    txtAnio.setEnabled(true);
                    txtTitulo.setEnabled(true);
                    txtDescripcion.setEnabled(true);
                    txtPalabras.setEnabled(true);
                    txtEdicion.setEnabled(true);
                    txtTemas.setEnabled(true);
                    txtCopias.setEnabled(false);
                    txtArea.setEnabled(false);
                    txtCategoria.setEnabled(false);
                    txtIsbn.setEnabled(false);
                    txtEjemplar.setEnabled(false);
                    txtTamanio.setEnabled(true);
                    break;
            }
        }
    }
        
        private void limpiarCampos(){
            txtAutor.setText("");
            txtAnio.setText("");
            txtTitulo.setText("");
            txtDescripcion.setText("");
            txtPalabras.setText("");
            txtEdicion.setText("");
            txtTemas.setText("");
            txtCopias.setText("");
            txtArea.setText("");
            txtCategoria.setText("");
            txtIsbn.setText("");
            txtEjemplar.setText("");
            txtTamanio.setText("");
        }
}
