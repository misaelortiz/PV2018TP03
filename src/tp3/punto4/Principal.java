/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto4;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArregloNumero arreglo = new ArregloNumero();
        int contador =0;
        while (contador<10){
            System.out.println("Ingrese un numero: ");
            arreglo.getNumeros()[contador] = scanner.nextInt();
            contador=contador+1;
        }
                
        arreglo.mostrarElementosDelArreglo();
        arreglo.mostrarMayorNum();
        arreglo.mostrarMenorNum();
        arreglo.calcularPromedio();
    }
    
}
