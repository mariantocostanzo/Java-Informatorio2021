//Se posee una Lista con objetos de clase Alumno 
//con los atributos: apellido, nombre y fechaDeNacimiento
//(con tipos: String, String y LocalDate). 
//Se desea generar un Map<String, Integer> 
//donde la clave de Map será el apellido concatenado con el nombre 
//(con separador de espacio en blanco) y el value la edad del alumno.

package EjerciciosComplemetariosNivel3;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                                       new Alumno("Maria", "Costanzo", LocalDate.parse("1980-09-18"))
                                      ,new Alumno("Iara", "Lescano", LocalDate.parse("2008-06-03"))
                                      ,new Alumno("Vanesa","Costanzo", LocalDate.parse("1985-11-25"))
                                      ,new Alumno("Oscar","Costanzo", LocalDate.parse("1958-09-02")) 
                                      ,new Alumno("Ismael","Lescano", LocalDate.parse("1963-08-26")));                               
        System.out.println(resultado(alumnos));                              
    }
    public static Map<String, Integer>resultado(List<Alumno>alumnos) {
               Map<String,Integer> resultado=alumnos.stream().collect(Collectors.toMap(Alumno::getNombreCompuesto, Alumno::getEdad));
               return resultado;
    }
}
