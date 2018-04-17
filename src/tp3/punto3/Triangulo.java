/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto3;

/**
 *
 * @author E. Misael Ortiz
 */
public class Triangulo {
    private double lado1;

    public Triangulo() {
    }
    private double lado2;
    private double lado3;

    /**
     * @return the lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    /* Este metodo nos dice si los 3 lados ingresados forman o no un triangulo
     * Si se logra formar un triangulo, se realiza el perimetro del mismo.
     * Si no , muestra un mensaje.    
    */    
    public void ResolverTriangulo(Triangulo a,Triangulo b, Triangulo c){
        double p;
        if (a.getLado1() + b.getLado2() > c.getLado3() )
            if (a.getLado1() + c.getLado3() > b.getLado2())
                if(b.getLado2()+c.getLado3() > a.getLado1())
                {   p=a.getLado1()+b.getLado2()+c.getLado3();
                    System.out.println("Si se forma un triangulo y su perimetro es: " + p);
                }
            else
                 System.out.println("No es posible formar un triangulo");
        else
                System.out.println("No es posible formar un triangulo");
        
        
    }
}
