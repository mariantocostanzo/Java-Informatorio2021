//Realizar un Programa que dado un String de entrada en minúsculas 
//lo convierta por completo a mayúsculas

package complementariosNivel1;
import java.util.*;

public class ejercicio7 {
    static int i;

    static void changecase(String s)
    {
        for(i=0;i<s.length();i++)
        {
            int ch=s.charAt(i);
            if(ch>64&&ch<91)
            {
                ch=ch+32;
                System.out.print( (char) ch);
            }
            else if(ch>96&&ch<123)
            {
                ch=ch-32;
                System.out.print( (char) ch);
            }
            if(ch==32)
            System.out.print(" ");
        }
    }

    public static void main (String args[])
    {
        String USUARIO;
        Scanner scan = new Scanner(System.in); 
        System.out.println("introduzca un String:");
        USUARIO=scan.nextLine();
        
        scan.close();

        System.out.println("el string de salida es : ");
        
        ejercicio7.changecase(USUARIO);

    }


}
    