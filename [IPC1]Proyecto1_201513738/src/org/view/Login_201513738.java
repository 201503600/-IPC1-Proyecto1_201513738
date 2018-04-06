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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.estructuras.NodoUsuario_201513738;

public class Login_201513738 extends JFrame implements ActionListener{

    private VentanaPrincipal_201513738 instanciaPrincipal;
    private InicioAdmin_201513738 admin;
    private InicioUsuario_201513738 user;
    
    private JTextField txtNickname, txtPass;
    private JLabel lblNickname, lblPass;
    private JButton btnLogin, btnCancelar;
    
    public Login_201513738(VentanaPrincipal_201513738 instancia){
        configurarVentana();
        inicializarComponentes();
        
        this.instanciaPrincipal = instancia;        
    }
    
    private void configurarVentana() {
        this.setTitle("Iniciar Sesion");                   // colocamos titulo a la ventana
        this.setSize(800, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    private void inicializarComponentes() {
        lblNickname = new JLabel("Usuario");
        lblPass = new JLabel("Contrasena");
        
        txtNickname = new JTextField();
        txtPass = new JTextField();
        
        btnLogin = new JButton("Iniciar Sesion");
        btnCancelar = new JButton("Cancelar");
        
        btnLogin.addActionListener(this);
        btnCancelar.addActionListener(this);
        
        JPanel pnlContenedor = new JPanel();
        pnlContenedor.setBounds(0, 0, 800, 600);
        pnlContenedor.setLayout(new GridLayout(3, 2));
        
        pnlContenedor.add(lblNickname);
        pnlContenedor.add(txtNickname);
        pnlContenedor.add(lblPass);
        pnlContenedor.add(txtPass);
        pnlContenedor.add(btnLogin);
        pnlContenedor.add(btnCancelar);
        
        this.add(pnlContenedor);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin){
            String nickname = txtNickname.getText();
            String pass = txtPass.getText();
            NodoUsuario_201513738 usuario = instanciaPrincipal.listUsuarios.login(nickname, pass);
            if (usuario == null){
                JOptionPane.showMessageDialog(this, "Usuario y/o contrasena incorrectos, revise sus datos");
            }else{
                if (usuario.getRol() == NodoUsuario_201513738.ROL.ADMIN){
                    admin = new InicioAdmin_201513738(instanciaPrincipal);
                    admin.setVisible(true);
                    this.dispose();
                }else{
                    user = new InicioUsuario_201513738(instanciaPrincipal);
                    user.setVisible(true);
                    this.dispose();
                }
            }
        }
        else if (e.getSource() == btnCancelar){
            instanciaPrincipal.setVisible(true);
            this.dispose();            
        }
    }
    
}
