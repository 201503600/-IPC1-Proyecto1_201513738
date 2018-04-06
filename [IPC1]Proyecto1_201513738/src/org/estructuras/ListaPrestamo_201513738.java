/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.estructuras;

public class ListaPrestamo_201513738 {

    private NodoPrestamo_201513738 cabeza;
    private int size;
    
    public ListaPrestamo_201513738(){
        cabeza = null;
        size = 0;
    }
    
    public boolean esVacia(){
        if (size > 0)
            return true;
        return false;
    }
    
    public void agregarPrestamo(NodoPrestamo_201513738 nuevoNodo){
        if (cabeza == null){
            cabeza = nuevoNodo;
            size ++;
        }else{
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
            cabeza = nuevoNodo;
            size ++;
        }
    }
    
    public ListaPrestamo_201513738 getbyUser(String DPI){
        if (esVacia()){
            ListaPrestamo_201513738 sublista = new ListaPrestamo_201513738();
            NodoPrestamo_201513738 aux = cabeza;
            while (aux != null){
                if (aux.getusuario().getDPI().equals(DPI))
                    sublista.agregarPrestamo(aux);
                aux = aux.getSiguiente();
            }
            return sublista;
        }
        return null;
    }
    
    public boolean eliminarPrestamo(NodoPrestamo_201513738 nodo){
        if (esVacia()){
            NodoPrestamo_201513738 anteriorNodo = cabeza;
            while (anteriorNodo != null){
                if (anteriorNodo == nodo){
                    try{
                        anteriorNodo.getAnterior().setSiguiente(anteriorNodo.getSiguiente());
                    }catch(Exception ex){}
                    try{
                        anteriorNodo.getSiguiente().setAnterior(anteriorNodo.getAnterior());
                    }catch(Exception ex){}
                    anteriorNodo.setSiguiente(null);
                    anteriorNodo.setAnterior(null);
                    size--;
                    return true;
                }
                anteriorNodo = anteriorNodo.getSiguiente();
            }
        }
        return false;
    }
    
}
