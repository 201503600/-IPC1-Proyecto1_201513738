/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.estructuras;

public class ListaPrestamoVirtual_201513738 {

    private NodoPrestamoVirtual_201513738 cabeza;
    private int size = 0;
    
    public ListaPrestamoVirtual_201513738(){
        this.cabeza = null;
        this.size = 0;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public boolean esVacia(){
        if (size > 0)
            return true;
        return false;
    }
    
    public void agregarPrestamo(NodoPrestamoVirtual_201513738 nuevoNodo){
        if (cabeza == null){
            cabeza = nuevoNodo;
            size ++;
        }else{
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
            cabeza = nuevoNodo;
            size++;
        }
    }
    
    public boolean eliminarPrestamo(){
        
        return false;
    }
    
}
