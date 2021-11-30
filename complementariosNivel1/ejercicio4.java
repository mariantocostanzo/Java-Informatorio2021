//Realizar un programa que calcule el factorial de un número


package complementariosNivel1;

import java.util.*;
public class ejercicio4{
    public static void main(String[] ARGUMENTOS){ 
       int factorial = 1;
       int a;
       int numero;
       Scanner leer=new Scanner(System.in);

       System.out.println("introduzca un numero:");
       numero=leer.nextInt();
       a=numero;
       leer.close();
       
       while ( numero!=0) {
        factorial=factorial*numero;
        numero--;
      }
      System.out.println("el factorial del numero: "  + a + "  es: "+ factorial);
    }   

}       

        
