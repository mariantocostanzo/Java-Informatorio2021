package complementariosNivel1;

//1.	Solicitar por consola el nombre del usuario e 
//imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”


import java.util.*;
public class ejercicio1 {
        public static void main(String[] args){
            //creamos un objeto scanner que toma los valores de entrada por consola
            String USUARIO;
            Scanner scan = new Scanner(System.in); 
            USUARIO=scan.nextLine();
            System.out.println("hola " +  USUARIO  + "!!!");
           
            scan.close();
        
        
        
        

    }
}
