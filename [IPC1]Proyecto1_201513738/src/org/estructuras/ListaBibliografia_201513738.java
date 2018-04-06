/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.estructuras;

public class ListaBibliografia_201513738 {
        
    private NodoBibliografia_201513738 cabeza;
    private int size;
    public Integer CORRELATIVO;
    
    public ListaBibliografia_201513738(){
        this.cabeza = null;
        this.size = 0;
        this.CORRELATIVO = 0;
    }
    
    public int getSize(){
        return this.size;
    }
    public NodoBibliografia_201513738 getRaiz(){
        return this.cabeza;
    }
    
    public boolean esVacia(){
        if (size > 0)
            return true;
        return false;
    }
    
    public void agregarBibliografia(NodoBibliografia_201513738 nuevoNodo){
        if (cabeza == null){
            cabeza = nuevoNodo;
            size++;
         }else{
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
            cabeza = nuevoNodo;
            size++;
        }
    }
    
    public boolean modificarBibliografia(Integer ID, NodoBibliografia_201513738 nuevoNodo){
        if (esVacia()){
            NodoBibliografia_201513738 anteriorNodo = cabeza;
            while (anteriorNodo != null){
                if (anteriorNodo.getID() == ID){
                    nuevoNodo.setAnterior(anteriorNodo.getAnterior());
                    nuevoNodo.setSiguiente(anteriorNodo.getSiguiente());
                    try{
                        anteriorNodo.getAnterior().setSiguiente(nuevoNodo);
                    }catch(Exception ex){}
                    try{
                        anteriorNodo.getSiguiente().setAnterior(nuevoNodo);
                    }catch(Exception ex){}
                    return true;
                }
                anteriorNodo = anteriorNodo.getSiguiente();
            }
        }
        return false;
    }
    
    public boolean eliminarBibliografia(Integer ID){
        if (esVacia()){
            NodoBibliografia_201513738 aux = cabeza;
            if (size > 1){
                while(aux != null){
                    if (aux.getID() == ID){
                         try{
                                aux.getAnterior().setSiguiente(aux.getSiguiente());
                            }catch(Exception e){}
                            try{
                                aux.getSiguiente().setAnterior(aux.getAnterior());
                            }catch(Exception e){}
                            aux.setSiguiente(null);
                            aux.setAnterior(null);
                            size--;
                            return true;
                    }
                    aux = aux.getSiguiente();
                }
            }else if (cabeza.getID() ==ID){
                cabeza = null;
                size--;
                return true;
            }
        }
        return false;
    }
    
    public NodoBibliografia_201513738 get(Integer index){
        if (index >= 0 && index < size){
            NodoBibliografia_201513738 aux = cabeza;
            for (int pos = 1; pos <= index; pos++)
                aux = aux.getSiguiente();
            return aux;
        }
        return null;
    }
    
    public ListaBibliografia_201513738 filtrar(NodoBibliografia_201513738.TIPO tipo){
        if (esVacia()){
            ListaBibliografia_201513738 sublista = new ListaBibliografia_201513738();
            NodoBibliografia_201513738 aux = cabeza;
            while(aux != null){
                if (aux.getTipoBibliografia() == tipo)
                    sublista.agregarBibliografia(aux);
                aux = aux.getSiguiente();
            }
            return sublista;
        }
        return null;
    }
    
}
