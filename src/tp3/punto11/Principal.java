/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto11;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Principal {
    
    public static void main(String[] args) {
        ArrayList<Zapatilla> zapatilla = new ArrayList<Zapatilla>();
        Scanner sc = new Scanner(System.in);
        String opc = new String();
        Zapatilla unaZapatilla = new Zapatilla();
        System.out.println("Elija una opcion: ");
        System.out.println("1-Agregar zapatilla:");
        System.out.println("2-Mostrar zapatillas:");
        int op=sc.nextInt();
        if(op==1){
            boolean bandera=true;
            while(bandera==true){
        //unaZapatilla.setMarca(unaZapatilla.registrarZapatillas());
        zapatilla.add(unaZapatilla.registrarZapatillas(unaZapatilla));
        for (int i=0; i<zapatilla.size();i++){
            System.out.println("El elemento de la lista es: "+ zapatilla.get(i).getMarca());
            if(zapatilla.get(i).isEsOriginal()==true){
            System.out.println("Es original");
        }
            else{
                System.out.println("No es original");
            }}
                System.out.println("¿Seguir ingresando zapatillas?");
                opc=sc.next();
                if(opc=="no"){
                    bandera=false;
                }
        }
        }
    }
    
    
}
