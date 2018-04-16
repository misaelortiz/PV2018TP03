/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto2;

/**
 *
 * @author E. Misael Ortiz
 */
public class Rectangulo {
    private double puntox1;
    private double puntoy1;
    private double base;
    private double altura;

    public Rectangulo() {
      
    }
    /**
     * @return the puntox
     */
    public double getPuntox1() {
        return puntox1;
    }

    /**
     * @param puntox1 the puntox to set
     */
    public void setPuntox1(double puntox1) {
        this.puntox1 = puntox1;
    }

    /**
     * @return the puntoy
     */
    public double getPuntoy1() {
        return puntoy1;
    }

    /**
     * @param puntoy1 the puntoy to set
     */
    public void setPuntoy1(double puntoy1) {
        this.puntoy1 = puntoy1;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public double ObtenerDiagonal(double base,double altura){
            
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
       
    
    }
    
    public void ObtenerVertice2 (Rectangulo puntox,Rectangulo puntoy, Rectangulo altura){
     double x2;
     double y2;
     x2= puntox.getPuntox1();
     y2= altura.getAltura() - puntoy.getPuntoy1();
    
        System.out.println("Vertice2= x: " + x2 + " y: " + y2 );
    }
    public void ObtenerVertice3 (Rectangulo puntox, Rectangulo puntoy, Rectangulo base, Rectangulo altura){
        double puntox3;
        double puntoy3;
        puntox3 = puntox.getPuntox1() + (base.getBase()-1);
        puntoy3 = altura.getAltura() - puntoy.getPuntoy1();
        
        System.out.println("Vertice3= x: " + puntox3 + " y: " + puntoy3);
        
    }
    
    public void ObtenerVertice4 (Rectangulo puntoy,Rectangulo puntox, Rectangulo base){
       double x4;
     double y4;
     x4= puntox.getPuntox1()+(base.getBase()-1);
     y4= puntoy.getPuntoy1();
    
        System.out.println("Vertice4= x: " + x4 + " y: " + y4 );
    
    }
    
    public double ObtenerSuperficie(Rectangulo b, Rectangulo h){
        return b.getBase()*h.getAltura();
    
    }
    
    public double ObtenerPerimetro(Rectangulo b, Rectangulo h){
     
        return (2*(b.getBase())+2*(h.getAltura()));
    
    }

        
}
