/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto9;

import java.util.ArrayList;

/**
 *
 * @author E. Misael Ortiz
 */
public class Libro {
    
    private long isbn;
    private String titulo;
    private String autor;
    private double precio;
    private String editorial;

    /**
     * @return the isbn
     */
    public long getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void visualizarLibros(ArrayList<Libro> libros){
        for(int i=0; i<libros.size(); i++){
            System.out.println("Titulo : "+ libros.get(i).getTitulo());
            System.out.println("Isbn: "+libros.get(i).getIsbn());
            System.out.println("Autor: "+libros.get(i).getAutor());
            System.out.println("Precio: "+libros.get(i).getPrecio());
            System.out.println("Editorial: "+libros.get(i).getEditorial());
            
    }}
}
