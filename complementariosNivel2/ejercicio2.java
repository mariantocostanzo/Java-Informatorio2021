//2.	Crear un ArrayList, agregar 5 números enteros. 
//Luego, agregar un número entero al principio de la lista y otro al final. 
//Por último, iterar e imprimir los elementos de la lista 
//y el tamaño de la misma (antes y después de agregar a en la primera y última posición).


package complementariosNivel2;
import java.util.*;

public class ejercicio2 {
     
     public static void main(String[] args){
        
            ArrayList<Integer> lista = new ArrayList<Integer>();
            Scanner scan = new Scanner(System.in);
            lista = cargarLista(lista, scan);
            imprimirElemento(lista);
            lista = agregar(lista,scan);
            imprimirElemento(lista);
    
      }
    
        public static ArrayList<Integer> cargarLista(ArrayList<Integer> numeros, Scanner scan) {
            
            System.out.println("Ingrese los numeros enteros: ");
            for (int i = 1; i <= 5; i++) {
                numeros.add(Integer.valueOf(scan.nextLine()));
            }
            return numeros;
        }
    
        public static void imprimirElemento(ArrayList<Integer> imprimir) {
            System.out.println("el ArrayList tiene " + imprimir.size() + " números y son : ");
            for (Integer numero: imprimir) {  
                System.out.print("  "+ numero +"  ");

            }
            System.out.println("");
        }
    
        public static ArrayList<Integer> agregar(ArrayList<Integer> agregar,Scanner scan){
            
            System.out.println("Ingrese el elemento que quiere agregar al inicio:");
            agregar.add(0, Integer.valueOf(scan.nextLine()));
            System.out.println("Ingrese el elemento que quiere agregar al final: ");
            agregar.add(Integer.valueOf(scan.nextLine()));
            return agregar;
        }
    
}
    

