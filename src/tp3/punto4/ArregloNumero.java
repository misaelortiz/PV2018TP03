/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto4;

/**
 *
 * @author Alumno
 */
public class ArregloNumero {
    private int[] numeros;
    
    public ArregloNumero(){
        numeros = new int[10];
    }
    

public ArregloNumero(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    public void mostrarElementosDelArreglo(){
        for(int i=0; i < numeros.length;i++){
            System.out.println("Valor del elemento: " + numeros[i]);
        }
    }
    public void mostrarMayorNum(){
        int numMayor = 0;
        for (int i=0; i<numeros.length;i++){
            if(numeros[i]>numMayor){
                numMayor = numeros[i];
            }
        }
        System.out.println("El mayor numero es: " + numMayor);
    }
    
    public void mostrarMenorNum(){
        int numMenor = numeros[0];
        for (int i=0; i<numeros.length;i++){
            if(numeros[i]<numMenor){
                numMenor = numeros[i];
            }
        }
        System.out.println("El menor numero es: " + numMenor);
    }
    
    public void calcularPromedio(){
        double suma = 0;
        int promedio = 0;
        for(int i=0;i<numeros.length;i++){
            suma=suma+numeros[i];
        }
        System.out.println("El promedio del arreglo es: " + (promedio/suma));
    }

}
    

