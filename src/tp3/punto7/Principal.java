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
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        Coche[] coches = new Coche[4];
        Coche unCoche = new Coche();
        coches[0].setMarca("Renault");
        coches[0].setModelo("Megane");
        coches[0].setColor("Azul");
        coches[0].setCombustible("Nafta");
        coches[0].setPatente("JHD290");
        coches[1].setMarca("Audi");
        coches[1].setModelo("A3");
        coches[1].setColor("Rojo");
        coches[1].setCombustible("Nafta");
        coches[1].setPatente("WKD189");
        coches[2].setMarca("Citroen");
        coches[2].setModelo("C5");
        coches[2].setColor("Gris");
        coches[2].setCombustible("Nafta");
        coches[2].setPatente("DFJ930");
        coches[3].setMarca("Fiat");
        coches[3].setModelo("Fiesta");
        coches[3].setColor("Negro");
        coches[3].setCombustible("Nafta");
        coches[3].setPatente("FCZ074");     
        //unCoche.mostrarAutos(coches);
        //for (int i=0; i<coches.length;i++){
        System.out.println("Marca: " + coches[0].getMarca());
        System.out.println("Modelo: " + coches[0].getModelo());
        System.out.println("Color: " + coches[0].getColor());
        System.out.println("Combustible: " + coches[0].getCombustible());
        System.out.println("Patente: " + coches[0].getPatente());
    }
       
    
}}
