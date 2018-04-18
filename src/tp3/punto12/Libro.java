/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto12;

import java.util.Scanner;

/**
 *
 * @author E. Misael Ortiz
 */
public class Libro {
    private String titulo;
    private String editorial;
    private long isbn;
    private String autor;
    private String categoria;

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
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }
 /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public  int MenuRegistro (int a){
        int op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Elija una opcion: ");
        System.out.println("1-Agregar Categoria:");
        System.out.println("2-Mostrar Categorias");
        System.out.println("3-Agregar Libro:");
        System.out.println("4-Mostrar Libros");
        System.out.println("5-Buscar Libro");
        System.out.println("6- Salir");
        op=sc.nextInt();
        return op;
   }

  }
