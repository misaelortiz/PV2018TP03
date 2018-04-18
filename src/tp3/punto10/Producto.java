/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto10;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double precioUnit;  

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precioUnit
     */
    public double getPrecioUnit() {
        return precioUnit;
    }

    /**
     * @param precioUnit the precioUnit to set
     */
    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }
    
    public double calculoCuota(double cuota){
        double porc= cuota*1.5/100;
        return cuota+porc;
    }
}
