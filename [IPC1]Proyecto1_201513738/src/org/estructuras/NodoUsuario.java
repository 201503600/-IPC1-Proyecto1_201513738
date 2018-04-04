/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.estructuras;

public class NodoUsuario {
    private String DPI;
    private String nombre;
    private String nickname;
    private String apellido;
    private String rol;
    private String pass;
    private NodoUsuario anterior;
    private NodoUsuario siguiente;
      
    public NodoUsuario(String DPI, String nombre, String nickname, String apellido, String rol, String pass) {
        this.DPI = DPI;
        this.nombre = nombre;
        this.nickname = nickname;
        this.apellido = apellido;
        this.rol = rol;
        this.pass = pass;
        this.anterior = null;
        this.siguiente = null;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public NodoUsuario getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoUsuario anterior) {
        this.anterior = anterior;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
