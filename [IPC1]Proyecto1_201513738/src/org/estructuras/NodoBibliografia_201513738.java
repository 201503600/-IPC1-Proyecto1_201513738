/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.estructuras;

public class NodoBibliografia_201513738 {

        public enum TIPO{
            LIBRO,
            REVISTA,
            TESIS,
            LIBRO_DIGITAL
        }
        
        private Integer ID;
        private String autor;
        private Integer anioPublicacion;
        private Integer ISBN;
        private String titulo;
        private Integer edicion;
        private String[] palabraClave;
        private String descripcion;
        private String[] temas;
        private Integer copias;
        private Integer disponibles;
        private String categoria;
        private Integer ejemplar;
        private String area;
        private Integer tamanio;
        private TIPO tipoBibliografia;
        private NodoBibliografia_201513738 anterior;
        private NodoBibliografia_201513738 siguiente;

    public NodoBibliografia_201513738(Integer ID, String autor, Integer anioPublicacion, Integer ISBN, String titulo, Integer edicion, String[] palabraClave, String descripcion, String[] temas, Integer copias, Integer disponibles) {
        this.ID = ID;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.edicion = edicion;
        this.palabraClave = palabraClave;
        this.descripcion = descripcion;
        this.temas = temas;
        this.copias = copias;
        this.disponibles = disponibles;
        this.tipoBibliografia = TIPO.LIBRO;
        this.anterior = null;
        this.siguiente = null;
    }

    public NodoBibliografia_201513738(Integer ID, String autor, Integer anioPublicacion, String titulo, Integer edicion, String[] palabraClave, String descripcion, String[] temas, Integer copias, Integer disponibles, String categoria, Integer ejemplar) {
        this.ID = ID;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.titulo = titulo;
        this.edicion = edicion;
        this.palabraClave = palabraClave;
        this.descripcion = descripcion;
        this.temas = temas;
        this.copias = copias;
        this.disponibles = disponibles;
        this.categoria = categoria;
        this.ejemplar = ejemplar;
        this.tipoBibliografia = TIPO.REVISTA;
        this.anterior = null;
        this.siguiente = null;
    }

    public NodoBibliografia_201513738(Integer ID, String autor, Integer anioPublicacion, String titulo, Integer edicion, String[] palabraClave, String descripcion, String[] temas, Integer copias, Integer disponibles, String area) {
        this.ID = ID;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.titulo = titulo;
        this.edicion = edicion;
        this.palabraClave = palabraClave;
        this.descripcion = descripcion;
        this.temas = temas;
        this.copias = copias;
        this.disponibles = disponibles;
        this.area = area;
        this.tipoBibliografia = TIPO.TESIS;
        this.anterior = null;
        this.siguiente = null;
    }

    public NodoBibliografia_201513738(Integer ID, String autor, Integer anioPublicacion, String titulo, Integer edicion, String[] palabraClave, String descripcion, String[] temas, Integer tamanio) {
        this.ID = ID;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.titulo = titulo;
        this.edicion = edicion;
        this.palabraClave = palabraClave;
        this.descripcion = descripcion;
        this.temas = temas;
        this.tamanio = tamanio;
        this.tipoBibliografia = TIPO.LIBRO_DIGITAL;
        this.anterior = null;
        this.siguiente = null;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getEdicion() {
        return edicion;
    }

    public void setEdicion(Integer edicion) {
        this.edicion = edicion;
    }

    public String[] getPalabraClave() {
        return palabraClave;
    }

    public void setPalabraClave(String[] palabraClave) {
        this.palabraClave = palabraClave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getTemas() {
        return temas;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public Integer getCopias() {
        return copias;
    }

    public void setCopias(Integer copias) {
        this.copias = copias;
    }

    public Integer getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(Integer disponibles) {
        this.disponibles = disponibles;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Integer ejemplar) {
        this.ejemplar = ejemplar;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public TIPO getTipoBibliografia() {
        return tipoBibliografia;
    }

    public NodoBibliografia_201513738 getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoBibliografia_201513738 anterior) {
        this.anterior = anterior;
    }

    public NodoBibliografia_201513738 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoBibliografia_201513738 siguiente) {
        this.siguiente = siguiente;
    }
        
}
