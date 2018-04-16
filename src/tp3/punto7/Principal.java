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
        unCoche.mostrarAutos(coches);
        
        System.out.println("Ingrese una opcion para modificar:");
        System.out.println(coches[0].getMarca()+ " "+coches[0].getModelo());
        System.out.println(coches[1].getMarca()+ " "+coches[1].getModelo());
        System.out.println(coches[2].getMarca()+ " "+coches[2].getModelo());
        System.out.println(coches[3].getMarca()+ " "+coches[3].getModelo());
        int op = scanner.nextInt();
        switch (op){
            case '1':
                System.out.println("Ingrese datos: ");
                coches[0].setMarca(scanner.next());
                coches[0].setModelo(scanner.next());
                coches[0].setColor(scanner.next());
                coches[0].setCombustible(scanner.next());
                coches[0].setPatente(scanner.next());
                break;
            case '2':
                System.out.println("Ingrese datos: ");
                coches[1].setMarca(scanner.next());
                coches[1].setModelo(scanner.next());
                coches[1].setColor(scanner.next());
                coches[1].setCombustible(scanner.next());
                coches[1].setPatente(scanner.next());
                break;
            case '3':
                System.out.println("Ingrese datos: ");
                coches[2].setMarca(scanner.next());
                coches[2].setModelo(scanner.next());
                coches[2].setColor(scanner.next());
                coches[2].setCombustible(scanner.next());
                coches[2].setPatente(scanner.next());
                break;
            case '4':
                System.out.println("Ingrese datos: ");
                coches[3].setMarca(scanner.next());
                coches[3].setModelo(scanner.next());
                coches[3].setColor(scanner.next());
                coches[3].setCombustible(scanner.next());
                coches[3].setPatente(scanner.next());
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    
}
