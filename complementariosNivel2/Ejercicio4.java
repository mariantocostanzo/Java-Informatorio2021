//Cargar un arrayList con 12 nombres de estudiantes (String), 
//luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.

package complementariosNivel2;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
    
                Scanner scan = new Scanner(System.in);
                List<String> alumno = new ArrayList<>();
                alumno = ingresarAlumnos((ArrayList<String>) alumno, scan);
                ArrayList<String> curso1 = new ArrayList<String>(alumno.subList(0, 4)); 
                System.out.println("curso 1:" + curso1);
                ArrayList<String> curso2 =  new ArrayList<String> (alumno.subList(4, 8));
                System.out.println("curso 2:" + curso2);
                ArrayList<String> curso3 =  new ArrayList<String> (alumno.subList(8, 12));
                System.out.println("curso 3:" + curso3);
        
                scan.close();
    }

    public static ArrayList<String> ingresarAlumnos(ArrayList<String> listaAlumnos, Scanner scan){
        listaAlumnos.add("Maria");
        listaAlumnos.add("Iara");
        listaAlumnos.add("Ismael");
        listaAlumnos.add("valeria");
        listaAlumnos.add("Vanesa");
        listaAlumnos.add("Mercedes");
        listaAlumnos.add("Sheila");
        listaAlumnos.add("Oscar");
        listaAlumnos.add("Rafaela");
        listaAlumnos.add("Isidro");
        listaAlumnos.add("Daniel");
        listaAlumnos.add("Carmen");

        return listaAlumnos;
    }
}




