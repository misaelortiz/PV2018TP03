/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto5.utils;

import java.util.ArrayList;
import tp3.punto5.modelo.Circulo;

/**
 *
 * @author candeluchi
 */
public class GestorCirculos {
    private ArrayList<Circulo> circulos = new ArrayList();

    /**
     * @return the circulos
     */
    public ArrayList<Circulo> getCirculos() {
        return circulos;
    }

    /**
     * @param circulos the circulos to set
     */
    public void setCirculos(ArrayList<Circulo> circulos) {
        this.circulos = circulos;
    }
    
    public void agregarCirculo(Circulo circulo){
        
        this.circulos.add(circulo);
    }
    
}
