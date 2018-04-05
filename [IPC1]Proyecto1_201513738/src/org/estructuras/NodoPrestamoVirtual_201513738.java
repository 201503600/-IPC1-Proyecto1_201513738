/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.estructuras;

public class NodoPrestamoVirtual_201513738 {
    
    private NodoBibliografia_201513738 libroDigital;
    private NodoPrestamoVirtual_201513738 anterior;
    private NodoPrestamoVirtual_201513738 siguiente;
    
    public NodoPrestamoVirtual_201513738(NodoBibliografia_201513738 digital){
        this.libroDigital = digital;
        this.anterior = null;
        this.siguiente = null;
    }

    public NodoBibliografia_201513738 getLibroDigital() {
        return libroDigital;
    }

    public void setLibroDigital(NodoBibliografia_201513738 libroDigital) {
        this.libroDigital = libroDigital;
    }

    public NodoPrestamoVirtual_201513738 getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoPrestamoVirtual_201513738 anterior) {
        this.anterior = anterior;
    }

    public NodoPrestamoVirtual_201513738 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPrestamoVirtual_201513738 siguiente) {
        this.siguiente = siguiente;
    }
    
}
