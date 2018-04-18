/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto10;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Principal {
    
    public static void main(String[] args) {
        
        ArrayList <Producto> listaProductos=new ArrayList<>();
        Producto prod1 = new Producto();
        Producto prod2 = new Producto();
        Producto prod3 = new Producto();
        Producto prod4 = new Producto();
        double cuota;
        prod1.setCodigo(1234);
        prod1.setNombre("Computadora");
        prod1.setPrecioUnit(12354.45);
        listaProductos.add(prod1);
        prod2.setCodigo(0523);
        prod2.setNombre("Microhondas");
        prod2.setPrecioUnit(4315.99);
        listaProductos.add(prod2);
        prod3.setCodigo(5014);
        prod3.setNombre("Celular");
        prod3.setPrecioUnit(8415.13);
        listaProductos.add(prod3);
        prod4.setCodigo(0027);
        prod4.setNombre("Tablet");
        prod4.setPrecioUnit(2015.75);
        listaProductos.add(prod4);
        Scanner sc=new Scanner(System.in);
        System.out.println("Elija una opcion: ");
        for(int i=0;i<listaProductos.size();i++){
        System.out.println(i+"- "+listaProductos.get(i).getCodigo()+" "+listaProductos.get(i).getNombre()+" ");}
        int op=sc.nextInt();
        System.out.println("Ingrese cantidad de cuotas");
        System.out.println("1- 1 cuota: $"+listaProductos.get(op).getPrecioUnit());
        cuota=prod1.calculoCuota(listaProductos.get(op).getPrecioUnit());
        double cuota2=cuota;
        System.out.println("2- 3 cuotas: $"+cuota/3);
        cuota=prod1.calculoCuota(cuota);
        double cuota3=cuota;
        System.out.println("3- 6 cuotas: $"+cuota/6);
        cuota=prod1.calculoCuota(cuota);
        double cuota4=cuota;
        System.out.println("4- 12 cuotas: $"+cuota/12);
        cuota=prod1.calculoCuota(cuota);
        double cuota5=cuota;
        System.out.println("5- 24 cuotas: $"+cuota/24);
        int opc=sc.nextInt();
        System.out.println("Total a pagar: ");
        switch (opc){
                case 1:
                    System.out.println("$"+cuota);
                    break;
                case 2:
                    System.out.println("$"+cuota2);
                    break;
                case 3:
                    System.out.println("$"+cuota3);
                    break;
                case 4:
                    System.out.println("$"+cuota4);
                    break;
                case 5:
                    System.out.println("$"+cuota5);
                    break;
                default:
                    System.out.println("Error");
                    break;
        }
        
    }
    
}
