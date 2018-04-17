/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto7;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        Coche[] coches = new Coche[4];
        Coche coche0 = new Coche();
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        coche0.setMarca("Renault");
        coche0.setModelo("Megane");
        coche0.setColor("Azul");
        coche0.setCombustible("Nafta");
        coche0.setPatente("JHD290");
        coches[0]=coche0;
        coche1.setMarca("Audi");
        coche1.setModelo("A3");
        coche1.setColor("Rojo");
        coche1.setCombustible("Nafta");
        coche1.setPatente("WKD189");
        coches[1]=coche1;
        coche2.setMarca("Citroen");
        coche2.setModelo("C5");
        coche2.setColor("Gris");
        coche2.setCombustible("Nafta");
        coche2.setPatente("DFJ930");
        coches[2]=coche2;
        coche3.setMarca("Fiat");
        coche3.setModelo("Fiesta");
        coche3.setColor("Negro");
        coche3.setCombustible("Nafta");
        coche3.setPatente("FCZ074");     
        coches[3]=coche3;
        coche1.mostrarAutos(coches);
        System.out.println("Ingrese una opcion para modificar:");
        System.out.println("1-"+coches[0].getMarca()+ " "+coches[0].getModelo());
        System.out.println("2-"+coches[1].getMarca()+ " "+coches[1].getModelo());
        System.out.println("3-"+coches[2].getMarca()+ " "+coches[2].getModelo());
        System.out.println("4-"+coches[3].getMarca()+ " "+coches[3].getModelo());
        int op = scanner.nextInt();
        //switch (op){
          //  case '1':
        if(op==1){
                coche0.modificarValoresAuto(coches, op);}
          //      break;
        else{
            if (op==2){
            //case '2':
                coche1.modificarValoresAuto(coches, op);}
              //  break;
            else{
                if(op==3){
            //case '3':
                coche2.modificarValoresAuto(coches, op);}
                //break;
            //case '4':
                else{
                coche3.modificarValoresAuto(coches, op);
                //break;
        }}
            
        
        
        
    
}           coche0.mostrarAutos(coches);
}}