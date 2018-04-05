/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.estructuras;

public class NodoPrestamo_201513738 {
    
    private NodoUsuario_201513738 usuario;
    private NodoBibliografia_201513738 IDBibliografia;
    private NodoPrestamo_201513738 anterior;
    private NodoPrestamo_201513738 siguiente;
    
    public NodoPrestamo_201513738(NodoUsuario_201513738 usuario, NodoBibliografia_201513738 IDBibliografia){
        this.usuario = usuario;
        this.IDBibliografia = IDBibliografia;
        this.anterior = null;
        this.siguiente = null;
    }

    public NodoUsuario_201513738 getusuario() {
        return usuario;
    }

    public void setusuario(NodoUsuario_201513738 usuario) {
        this.usuario = usuario;
    }

    public NodoBibliografia_201513738 getIDBibliografia() {
        return IDBibliografia;
    }

    public void setIDBibliografia(NodoBibliografia_201513738 IDBibliografia) {
        this.IDBibliografia = IDBibliografia;
    }

    public NodoPrestamo_201513738 getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoPrestamo_201513738 anterior) {
        this.anterior = anterior;
    }

    public NodoPrestamo_201513738 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPrestamo_201513738 siguiente) {
        this.siguiente = siguiente;
    }
    
}
