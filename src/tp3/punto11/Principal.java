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
        Zapatilla zapa=new Zapatilla();
        //Zapatilla marca=new Zapatilla();
        //Zapatilla ori = new Zapatilla();
        int resp;
        do{ 
            int op=0;
            resp=zapa.MenuRegistro(op);
            
            switch(resp){
                case 1: {System.out.println("Ingrese marca de zapatilla:");                
                zapa.setMarca(sc.next());
                zapatilla.add(zapa);         
                System.out.println("¿Es original?");
                zapa.setOriginal(sc.next());
                zapatilla.add(zapa); 
                }break;
                case 2:  {
                       // for(int i = 0 ; i < zapatilla.size(); i++) {           
                       //System.out.println("Marca: " + zapatilla.get(i).getMarca());
                       //System.out.println("Original: " +zapatilla.get(i).getOriginal());
              
                        
                //} 
                  
                zapa.visualizarZapatillas(zapatilla);
                
                }break;
                
                case 3: System.out.println("Fin del registro");
                 
            }
        }while(resp!=3);
        
       
    }
    
    
}
