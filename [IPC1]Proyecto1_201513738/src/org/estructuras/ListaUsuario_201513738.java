/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.estructuras;

import org.estructuras.NodoUsuario_201513738.ROL;

public class ListaUsuario_201513738 {
    private NodoUsuario_201513738 cabeza;
    private int size;

    public ListaUsuario_201513738() {
        this.cabeza = null;
        this.size = 0;
    }
    
    public NodoUsuario_201513738 getRaiz(){
        return cabeza;
    }
    
    public boolean esVacia(){
        if (size > 0)
            return true;
        return false;
    }

    public void agregarUsuario(NodoUsuario_201513738 nuevoNodo) {
        
        if (this.cabeza == null) {
          this.cabeza = nuevoNodo;
            size++;
        } else {
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
            cabeza = nuevoNodo;
            size++;
        }
    }
    
    public NodoUsuario_201513738  login(String nick , String pass){
        if (esVacia()){
            NodoUsuario_201513738 aux = this.cabeza;
            while (aux!=null){
                if( aux.getNickname() .equals(nick) && aux.getPass().equals(pass))
                    return aux;
                aux = aux.getSiguiente();
            }
        }
        return null;
        
    }
    public boolean modificarUsuario(String DPI, NodoUsuario_201513738 nuevo){
        if (esVacia()){
            NodoUsuario_201513738 aux = this.cabeza;
            while(aux != null){
                if (aux.getDPI().equals(DPI)){
                    aux.setDPI(nuevo.getDPI());
                    aux.setApellido(nuevo.getApellido());
                    aux.setNickname(nuevo.getNickname());
                    aux.setNombre(nuevo.getNombre());
                    aux.setPass(nuevo.getPass());
                    aux.setRol(nuevo.getRol());
                    return true;
                }
                aux = aux.getSiguiente();
            }
        }
        return false;
    }
    
    public boolean eliminarUsuario(String DPI){
        if (esVacia()){
            NodoUsuario_201513738 aux = this.cabeza;
            if (this.size > 1){
                while (aux != null){
                    if (aux.getDPI().equals(DPI)){
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
            }else if (cabeza.getDPI().equals(DPI)){
                cabeza = null;
                size--;
                return true;
            }
        }
        return false;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public boolean verificarUsuario(String DPI){
        NodoUsuario_201513738 aux = cabeza;
        while (aux != null){
            if (aux.getDPI().equals(DPI))
                return true;
            aux = aux.getSiguiente();
        }
        return false;
    }
    
    public NodoUsuario_201513738 buscarUsuario(String DPI){
        NodoUsuario_201513738 aux = cabeza;
        while (aux != null){
            if (aux.getDPI().equals(DPI))
                return aux;
            aux = aux.getSiguiente();
        }
        return null;
    }
    
    public void recorrer() {
       NodoUsuario_201513738 aux = this.cabeza;
       
       while(aux != null){
           System.out.println(aux.getDPI() + " - " + aux.getNickname());
           aux = aux.getSiguiente();
       }
    }
    public static void main(String args[]){
        ListaUsuario_201513738 li = new ListaUsuario_201513738();
          li.agregarUsuario(new NodoUsuario_201513738("201603600", "daniel", "daniel","daniel", ROL.ESTUDIANTE, "asdf"));
            li.recorrer();
            li.modificarUsuario("201603600", new NodoUsuario_201513738("3600", "jorge", "jorge","perez", ROL.ESTUDIANTE, "123"));
            NodoUsuario_201513738 u = li.buscarUsuario("201603600");
            if (u == null)
                System.out.println("No existe");
            else
                System.out.println("usuario " + u.getNombre());
            
            u = li.buscarUsuario("3600");
            if (u == null)
                System.out.println("No existe");
            else
                System.out.println("usuario " + u.getNombre());
            li.recorrer();
    }
}
