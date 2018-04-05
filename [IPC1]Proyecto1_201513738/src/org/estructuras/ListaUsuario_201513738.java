/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.estructuras;

public class ListaUsuario_201513738 {

    private NodoUsuario_201513738 cabeza;
    private int size;

    public ListaUsuario_201513738() {
        this.cabeza = null;
        this.size = 0;
    }

    public void agregarUsuario(String DPI, String nombre, String nick, String apellido, String rol, String pass) {
        NodoUsuario_201513738 nuevoNodo = new NodoUsuario_201513738(DPI, nombre, nick, apellido, rol, pass);

        if (this.cabeza == null) {
            nuevoNodo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(nuevoNodo);
            this.cabeza = nuevoNodo;

        } else {
            nuevoNodo.setSiguiente(cabeza);
            nuevoNodo.setAnterior(cabeza.getAnterior());
            cabeza.setAnterior(nuevoNodo);
            cabeza.setSiguiente(cabeza);
            size++;
        }
    }

    public void recorrer() {
        NodoUsuario_201513738 aux = cabeza;
        int i = 0;
        while (i < size) {
            System.out.println(aux.getDPI() + "   " + aux.getNickname());
            aux = aux.getSiguiente();
        }
    }
    
}
