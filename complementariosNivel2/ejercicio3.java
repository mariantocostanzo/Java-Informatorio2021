//Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa 
//(solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), 
//imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.


package complementariosNivel2;

import java.util.*;

public class ejercicio3 {

    public static void main(String[] args) {

        ArrayList<Carta> cartas;
        
        
            int[] numeros = { 1, 2,3,4,5,6,7,8,9 };
            String[] palo = {"Picas","Corazones","Diamantes","Tréboles"};
           
            cartas = new ArrayList<Carta>();
                   
            for (int j=0;j < 4;j++)
            {
                for (int i=0;i < 9;i++)
                {
                    cartas.add(new Carta(numeros[i] , palo[j]));
    
                }
            }
            

           System.out.println("BARAJA EN ORDEN : " + cartas);
           System.out.println("  ");
       
           Collections.reverse(cartas);
       
           System.out.println("BARAJA EN ORDEN INVERSO : " + cartas);

           System.out.println("  ");

           Collections.shuffle(cartas);

          System.out.println("BARAJA MEZCLADA: " + cartas);
        }   
        
        

       
    
   

    
}
