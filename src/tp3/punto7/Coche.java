/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto7;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Coche {
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String combustible;
    private Object scanner;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    
    
    
   public void mostrarAutos(Coche[] autos){
        for (int i=0; i<autos.length;i++){
        System.out.println("Marca: " + autos[i].getMarca());
        System.out.println("Modelo: " + autos[i].getModelo());
        System.out.println("Color: " + autos[i].getColor());
        System.out.println("Combustible: " + autos[i].getCombustible());
        System.out.println("Patente: " + autos[i].getPatente());
    }}
   public void modificarValoresAuto(Coche[] coches, int i){
        
            Scanner scanner = new Scanner (System.in);
            System.out.println("Ingrese Marca: ");
            coches[i-1].setMarca(scanner.next());
            System.out.println("Ingrese Modelo: ");
            coches[i-1].setModelo(scanner.next());
            System.out.println("Ingrese Color: ");
            coches[i-1].setColor(scanner.next());
            System.out.println("Ingrese Combustible: ");
            coches[i-1].setCombustible(scanner.next());
            System.out.println("Ingrese Patente: ");
            coches[i-1].setPatente(scanner.next());}
            
        }
    

