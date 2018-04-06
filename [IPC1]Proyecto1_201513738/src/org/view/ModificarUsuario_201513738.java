/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.estructuras.NodoUsuario_201513738;

public class ModificarUsuario_201513738 extends JFrame implements ActionListener{

    private InicioAdmin_201513738 instanciaPrincipal;
    
    private JLabel lblId, lblNombre, lblApellido, lblNickname, lblPass, lblRol;
    private JTextField txtId, txtNombre, txtApellido, txtNickname, txtPass;
    private JComboBox cmbRol;
    private JButton btnBuscar, btnAceptar, btnCancelar;
    
    public ModificarUsuario_201513738(InicioAdmin_201513738 instancia){
        configurarVentana();
        inicializarComponentes();
        
        this.instanciaPrincipal = instancia;
    }
    private void configurarVentana() {
        this.setTitle("Crear Usuario");                   // colocamos titulo a la ventana
        this.setSize(500, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
    private void inicializarComponentes() {
        // creamos los componentes
     lblId = new JLabel("DPI");
     lblNombre = new JLabel("Nombre");
     lblApellido = new JLabel("Apellido");
     lblNickname = new JLabel("Nickname");
     lblPass = new JLabel("Contrasena");
     lblRol = new JLabel("Rol");     
     
     txtId = new JTextField();
     txtNombre = new JTextField();
     txtApellido = new JTextField();
     txtNickname = new JTextField();
     txtPass = new JTextField();
     
     cmbRol = new JComboBox();
     cmbRol.addItem("Catedratico");
     cmbRol.addItem("Estudiante");
     
     btnAceptar = new JButton("Crear Usuario");
     btnCancelar = new JButton("Cancelar");
     btnBuscar = new JButton("Buscar");
     
     btnAceptar.addActionListener(this);
     btnCancelar.addActionListener(this);
     btnBuscar.addActionListener(this);
     
     JPanel pnlContenedor = new JPanel();
     pnlContenedor.setBounds(0, 30, 500, 570);
     btnBuscar.setBounds(200, 5, 100, 20);
     pnlContenedor.setLayout(new GridLayout(7, 2));
     
     pnlContenedor.add(lblId);
     pnlContenedor.add(txtId);
     pnlContenedor.add(lblNombre);
     pnlContenedor.add(txtNombre);
     pnlContenedor.add(lblApellido);
     pnlContenedor.add(txtApellido);
     pnlContenedor.add(lblNickname);
     pnlContenedor.add(txtNickname);
     pnlContenedor.add(lblPass);
     pnlContenedor.add(txtPass);
     pnlContenedor.add(lblRol);
     pnlContenedor.add(cmbRol);
     pnlContenedor.add(btnAceptar);
     pnlContenedor.add(btnCancelar);
     
     this.setLayout(new GridLayout(2,1));
     this.add(btnBuscar);
     this.add(pnlContenedor);
       
    }

    private String DPI = "";
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar){
             if (!txtId.getText().equals("") && !txtNombre.getText().equals("") && !txtApellido.getText().equals("") && !txtNickname.getText().equals("") && !txtPass.getText().equals("")){
                    if (!this.instanciaPrincipal.getPrincipal().listUsuarios.verificarUsuario(txtId.getText())){
                        if (cmbRol.getSelectedItem().toString().equals("Catedratico"))
                            if (this.instanciaPrincipal.getPrincipal().listUsuarios.modificarUsuario(DPI, new NodoUsuario_201513738(txtId.getText(), txtNombre.getText(), txtNickname.getText(), txtApellido.getText(), NodoUsuario_201513738.ROL.CATEDRATICO, txtPass.getText())))
                                    JOptionPane.showMessageDialog(this, "Usuario modificado correctamente");
                            else
                                JOptionPane.showMessageDialog(this, "Ocurrio un error al modificar el usuario");
                        else
                            if (this.instanciaPrincipal.getPrincipal().listUsuarios.modificarUsuario(DPI, new NodoUsuario_201513738(txtId.getText(), txtNombre.getText(), txtNickname.getText(), txtApellido.getText(), NodoUsuario_201513738.ROL.ESTUDIANTE, txtPass.getText())))
                                    JOptionPane.showMessageDialog(this, "Usuario modificado correctamente");
                            else
                                JOptionPane.showMessageDialog(this, "Ocurrio un error al modificar el usuario");
                        DPI = "";
                    }else
                        JOptionPane.showMessageDialog(this, "El usuario con DPI " + txtId.getText() + " ya existe.");
            }else
                JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        }
        else if (e.getSource() == btnCancelar){
            instanciaPrincipal.setVisible(true);
            this.dispose();
        }
        else if (e.getSource() == btnBuscar){
            if (!txtId.getText().equals("")){
                NodoUsuario_201513738 usuario = this.instanciaPrincipal.getPrincipal().listUsuarios.buscarUsuario(txtId.getText());
                if (usuario != null){
                    DPI = usuario.getDPI();
                    txtNombre.setText(usuario.getNombre());
                    txtApellido.setText(usuario.getApellido());
                    txtNickname.setText(usuario.getNickname());
                    txtPass.setText(usuario.getPass());
                    if (usuario.getRol() == NodoUsuario_201513738.ROL.CATEDRATICO)
                        cmbRol.setSelectedItem("Catedratico");
                    else
                        cmbRol.setSelectedItem("Estudiante");
                }else
                    JOptionPane.showMessageDialog(this, "El usuario con DPI " + txtId.getText() + " no existe.");
            }else
                JOptionPane.showMessageDialog(this, "Ingrese un DPI de usuario");
        }
    }
}
