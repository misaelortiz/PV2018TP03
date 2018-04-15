
package tp3.punto1;

import java.util.Scanner;



public class TestPunto {
    public static void main(String[] args) {
        Punto punto1 = new Punto();
        Punto punto2 = new Punto();
        Scanner scanner = new Scanner (System.in);
        double x1;
        System.out.println("Ingrese X1: ");
        x1 = scanner.nextDouble();
        punto1.setObjeto1(x1);
        double y1;
        System.out.println("Ingrese Y1: ");
        y1 = scanner.nextDouble();
        punto1.setObjeto2(y1);
        double x2;
        System.out.println("Ingrese X2: ");
        x2 = scanner.nextDouble();
        punto2.setObjeto1(x2);
        double y2;
        System.out.println("Ingrese Y2: ");
        y2 = scanner.nextDouble();
        punto2.setObjeto1(y2);        
        //unPunto.ObtenerDistancia(2.3, 3.1);
        System.out.println("La distancia entre los puntos P1(1,3) y P2(2,4) es: "+ punto1.calcularDistanciaEntrePuntos(punto2));
     
        
    }
    
    
    
}
