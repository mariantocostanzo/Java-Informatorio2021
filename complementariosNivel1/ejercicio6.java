//Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia

package complementariosNivel1;
import java.util.*;
public class ejercicio6 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ingrese el primer numero:");
        int a=sc.nextInt();
        System.out.println("ingrese el segundo numero:");
        int b=sc.nextInt();
        sc.close();
        int result = CalculatePower(a,b);
        System.out.println(a+" elevado a "+b+" es "+result);
       
    }
    static int CalculatePower (int num, int pow){
        if (pow == 0)
            return 1;
        else
            return num * CalculatePower(num, pow - 1);
    }


}
