/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author E. Misael Ortiz
 */
public class Principal {
    public static void main(String[] args) {
       ArrayList<Libro>libro=new ArrayList<>();
       ArrayList<Categoria>categoria=new ArrayList<>();
       Scanner sc = new Scanner (System.in);
      
       int resp;
        do{ 
            int op=0; 
            Autor unAutor= new Autor();
            Libro unLibro=new Libro();
            Categoria unaCategoria=new Categoria();
            resp=unLibro.MenuRegistro(op);
            switch(resp){
                case 1:{
                
                System.out.println("Ingrese su categoria:");
                unaCategoria.setTipo(sc.next());
                categoria.add(unaCategoria);
                
                        }break;
                case 2: {
                    System.out.println("Categorias:");
                    for(int i = 0 ; i < categoria.size(); i++) {    
                     System.out.println(categoria.get(i).getTipo());
                     
                }
                }break;
                case 3: {
                System.out.println("Ingrese titulo del libro: ");
                unLibro.setTitulo(sc.next());
                System.out.println("Ingrese categoria: ");
                unLibro.setCategoria(sc.next());
                System.out.println("Ingrese autor:");
                unLibro.setAutor(sc.next());
                System.out.println("Ingrese editorial: ");
                unLibro.setEditorial(sc.next());
                System.out.println("Ingrese isbn:");
                unLibro.setIsbn(sc.nextLong());
                libro.add(unLibro);
                }break;
                case 4:{
                for(int i = 0 ; i < libro.size(); i++) {           
                       System.out.println("Titulo: " + libro.get(i).getTitulo());
                       System.out.println("Categoria: " + libro.get(i).getCategoria());
                       System.out.println("Autor: " + libro.get(i).getAutor());
                       System.out.println("Editorial: " + libro.get(i).getEditorial());
                       System.out.println("Isbn: " + libro.get(i).getIsbn());
                      
                        } 
                
                }break;
                
                
        }
       }while(resp!=6);

    }
   
}
