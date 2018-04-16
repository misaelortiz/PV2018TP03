/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto5.test;

import tp3.punto5.modelo.Circulo;
import tp3.punto5.utils.GestorCirculos;

/**
 *
 * @author candeluchi
 */
public class TestPunto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo c1 = new Circulo(3.4, "Azul");
        Circulo c2 = new Circulo(5.4, "Rojo");
        
        GestorCirculos gc = new GestorCirculos();
        gc.agregarCirculo(c1);
        gc.agregarCirculo(c2);
        
        for(Circulo circulo: gc.getCirculos()){
            System.out.println("Radio:" + circulo.getRadio());
            System.out.println("Color:" + circulo.getColor());
        }
        
    }
    
}
