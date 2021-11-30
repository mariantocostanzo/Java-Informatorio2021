//5.	Se desea una aplicación que solicite 2 números enteros 
//y realice la operación de multiplicación por sumas sucesivas

package complementariosNivel1;
import java.util.*;
public class ejercicio5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int suma=0;
        System.out.println("ingrese el primer numero:");
        int a=sc.nextInt();
        System.out.println("ingrese el segundo numero:");
        int b=sc.nextInt();
        sc.close();
        for (int i=1; i<=b; i++){
            suma=suma + a;
        }
       System.out.println("el producto es:" + suma);
    }
}
