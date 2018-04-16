package tp3.punto5.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author candeluchi
 */
public class Circulo {
    
    private double radio;
    private String color;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

   
    
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    
    
    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    public double calcularSup(){
        double sup = 0;
        
        //codigo para calc sup
        return sup;
    }
    
}
