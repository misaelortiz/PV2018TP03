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
    private boolean esOriginal;

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
     * @return the esOriginal
    */ 
    public boolean isEsOriginal() {
        return esOriginal;
    }

    /**
     * @param esOriginal the esOriginal to set
    */
    public void setEsOriginal(boolean esOriginal) {
        this.esOriginal = esOriginal;
    }
    
    
    public Zapatilla registrarZapatillas(Zapatilla zap){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese marca de zapatilla:");
        setMarca(sc.next());
        System.out.println("¿Es original?");
        String op = new String();
        op=sc.next();
        if(op=="si"){
        zap.setEsOriginal(true);}
        else{
        if(op=="no"){
        zap.setEsOriginal(false);}        
        }
                
        zap.setMarca(getMarca());
        return zap;
        //return marca;
    }
}
