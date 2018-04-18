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
        Zapatilla zapa=new Zapatilla();
        Zapatilla marca=new Zapatilla();
        Zapatilla ori = new Zapatilla();
        int resp;
        do{ 
            int op=0;
            resp=zapa.MenuRegistro(op);
            
            switch(resp){
                case 1: {System.out.println("Ingrese marca de zapatilla:");                
                marca.setMarca(sc.next());
                zapatilla.add(marca);         
                System.out.println("¿Es original?");
                ori.setOriginal(sc.next());
                zapatilla.add(ori); 
                }break;
                case 2:  {
                    
                zapa.visualizarZapatillas(zapatilla);
                
                }break;
                
                case 3: System.out.println("Fin del registro");
                 
            }
        }while(resp!=3);
        
       
    }
    
    
}
