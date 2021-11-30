//3.	Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números 
//(incrementos de 1)

package complementariosNivel1;
import java.util.*;
public class ejercicio3{  
  public static void main(String[] ARGUMENTOS){
    int num;
    Scanner leer=new Scanner(System.in);

    System.out.println("introduzca un numero:");
    num=leer.nextInt();
    leer.close();
    
    for(int i = 1; i <= num; i++) {

        for(int j = 1; j <= i; j++) {


            System.out.print(j + "  ");

        }
        System.out.println();
        

    }
   
  }
}
