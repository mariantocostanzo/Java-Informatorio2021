//Dados 2 ArrayList que contienen horas-trabajadas (array1) 
//y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. 
//Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.

package complementariosNivel2;

import java.util.*;

public class ejercicio5 {
    public static void main(String[] args){

    ArrayList<Integer> horas = new ArrayList<Integer>();
    ArrayList<Integer> valor = new ArrayList<Integer>();
    ArrayList <Integer> total = new ArrayList<Integer>();
    

    horas.add(6);
    horas.add(7);
    horas.add(8);
    horas.add(4);
    horas.add(5);
    
    valor.add(350);
    valor.add(345);
    valor.add(550);
    valor.add(600);
    valor.add(320);
    int totales =0;
    int cobro=0;
    for(int i=0; i<horas.size(); i++) {
           
           int  num1 = horas.get(i);
           int num2 = valor.get(i);
           int totalPorDia =num1*num2;
           totales=totalPorDia;
           cobro=cobro+totales;
           total.add(totales);
    }
    System.out.println("las horas trabajadas son:");
    System.out.println(horas);
    System.out.println("el valor por hora es:");
     System.out.println(valor);
    System.out.println("los totales son:");
    System.out.println(total);
    System.out.println("el total a cobrar es:");
    System.out.println( "$" + cobro);
    } 
    
    
}