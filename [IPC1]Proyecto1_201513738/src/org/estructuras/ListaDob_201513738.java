/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.estructuras;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ListaDob_201513738 {

     public class Nodo {
        String DPI;
        String nombre;
        String apellido;
        String rol;
        String pass;
        Nodo ant,sig;
        
        public Nodo(String DPI , String nombre , String apellido , String rol , String pass ){
            this.DPI  = DPI;
            this.nombre = nombre ;
            this.apellido = apellido ;
            this.rol = rol;
            this.pass = pass;
        }
        
    }
         
         Nodo cabeza;
         Nodo temporal;
         
         
           public ListaDob_201513738(){
                this.cabeza = null;
            }
           public void add(String DPI , String nombre ,String nick, String apellido , String rol , String pass){
               Nodo nuevoNodo = new Nodo(DPI,nombre ,apellido , rol , pass);
               
               if(this.cabeza==null){
                   nuevoNodo.sig = nuevoNodo;
                   nuevoNodo.ant = nuevoNodo;
                   this.cabeza = nuevoNodo;
                   
               }else{
                   temporal = this.cabeza.ant;
                   
                   this.cabeza.ant = temporal;
                   nuevoNodo.ant = temporal;
                   nuevoNodo.sig = this.cabeza;
                   temporal.sig = nuevoNodo;
               }
           }
           public void recorrer(){
               temporal = this.cabeza.ant;
               System.out.println(cabeza.nombre +"   "+cabeza.pass);
               while(temporal!=this.cabeza){
                   System.out.println(temporal.nombre +"   "+temporal.pass);
                   temporal = temporal.ant;
               }
           }
           public static void main(String args[]){
           ListaDob_201513738 li = new ListaDob_201513738();
           li.add("2666912340101", "Jose","josecbm", "Bautista", "ingeniero papi", "123");
           li.add("26669234340101", "daniel","dani", "cil", "ingeniero papi", "123");
           li.add("26669543240101", "lorena","lo", "mazariegos", "dfasi", "123");
           li.recorrer();
           
           
       }
         
           
     
       
     
    
    
    
    
}
