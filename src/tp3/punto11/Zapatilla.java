/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto11;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Alumno
 */
public class Zapatilla {
    private String marca;
    private String original;

   
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the original
     */
    public String getOriginal() {
        return original;
    }

    /**
     * @param original the original to set
     */
    public void setOriginal(String original) {
        this.original = original;
    }
    
    
    
    public void RegistrarZapatillas(int op){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese marca de zapatilla:");
        setMarca(sc.next());
        System.out.println("¿Es original?");
        setOriginal(sc.next());
        
    }
    
    public void visualizarZapatillas(ArrayList<Zapatilla> zapatillas){
        for(int i=0; i<zapatillas.size(); i++){
            System.out.println("Marca : "+ zapatillas.get(i).getMarca());
            System.out.println("Original : "+zapatillas.get(i).getOriginal());
            
    }
    }
    
    
   public  int MenuRegistro (int a){
        int op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Elija una opcion: ");
        System.out.println("1-Agregar zapatilla:");
        System.out.println("2-Mostrar zapatillas:");
        System.out.println("3-Salir");
        op=sc.nextInt();
        return op;
   }
    }

