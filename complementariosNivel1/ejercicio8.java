//Crear una aplicación que solicite de entrada los datos de una persona en este orden:
//Nombre y Apellido
//Edad
//Dirección
//Ciudad
//Luego imprimirá el siguiente mensaje:
//{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}

package complementariosNivel1;
import java.util.*;
public class ejercicio8 {
    public static void main(String[] args){
        String nombre;
        String edad;
        String direccion;
        String ciudad;
        Scanner scan=new Scanner(System.in);
        System.out.println("introduzca su nombre y apellido:");
        nombre=scan.nextLine();
        System.out.println("introduzca su edad:");
        edad=scan.nextLine();
        System.out.println("introduzca su dirección:");
        direccion=scan.nextLine();
        System.out.println("introduzca su ciudad:");
        ciudad=scan.nextLine();

        System.out.println( ciudad +"-" + direccion +"-"+ edad +"-" + nombre );

        scan.close();

    }    

}
