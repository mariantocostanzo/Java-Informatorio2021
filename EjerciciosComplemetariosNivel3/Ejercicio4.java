//Se dispone de una lista de Integer, 
//de la cual queremos obtener otra lista aplicando la operación de factorial 
//pero no se desean valores repetidos.

package EjerciciosComplemetariosNivel3;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        Set<Integer> fac = numeros.stream().map(numero -> factorial(numero)).collect(Collectors.toSet());
        System.out.println(fac);
    }

    public static int factorial(int num){
        if (num == 1) {
            return num;
        } else { 
            return (num * factorial(num -1));
        }
    }
}


