/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto7;

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
        System.out.println("Marca: " + autos[i].marca);
        System.out.println("Modelo: " + autos[i].modelo);
        System.out.println("Color: " + autos[i].color);
        System.out.println("Combustible: " + autos[i].combustible);
        System.out.println("Patente: " + autos[i].patente);
    }}
}
