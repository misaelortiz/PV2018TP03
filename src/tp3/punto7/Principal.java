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
    
        Coche[] coches = new Coche[4];
        Coche unCoche = new Coche();
        unCoche.setMarca("Renault");
        unCoche.setModelo("Megane");
        unCoche.setColor("Azul");
        unCoche.setCombustible("Nafta");
        unCoche.setPatente("JHD290");
        coches[0] = unCoche;
        unCoche.setMarca("Audi");
        unCoche.setModelo("A3");
        unCoche.setColor("Rojo");
        unCoche.setCombustible("Nafta");
        unCoche.setPatente("WKD189");
        coches[1] = unCoche;
        unCoche.setMarca("Citroen");
        unCoche.setModelo("C5");
        unCoche.setColor("Gris");
        unCoche.setCombustible("Nafta");
        unCoche.setPatente("DFJ930");
        coches[2] = unCoche;
        unCoche.setMarca("Fiat");
        unCoche.setModelo("Fiesta");
        unCoche.setColor("Negro");
        unCoche.setCombustible("Nafta");
        unCoche.setPatente("FCZ074");
        coches[3] = unCoche;
        for (int i=0;i<coches.length;i++){
            System.out.println("Auto N° " + (i +1));
            unCoche.mostrarAutos(coches[i]);
        }
        
    }
    
}
