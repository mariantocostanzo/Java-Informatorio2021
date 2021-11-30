//Dado un String de entrada (frase, texto, etc) 
//calcular la cantidad de veces que aparece una letra dada.

package complementariosNivel1;

import java.util.Scanner;
import java.io.IOException;

public class ejercicio9 {
    public static void main(String[] args) throws IOException {
          
        Scanner scan = new Scanner(System.in);
        String cad;
        char caracter;
        int numeroDeVeces = 0;
        do {
            System.out.println("Introduzca texto y/o palabra: ");
            cad = scan.nextLine();
        } while (cad.isEmpty());
        System.out.print("Introduzca un carácter: ");
        caracter = (char) System.in.read();
        numeroDeVeces = contarCaracteres(cad, caracter);
        System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");   
        scan.close();                
    }

    //calcular el número de veces que se repite un carácter en un String
    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
   }
}