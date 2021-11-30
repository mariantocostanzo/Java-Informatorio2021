//Se dispone de una lista de Strings, 
//de la cual  se saber la cantidad de valores que comiencen con la letra B 
//(tanto mayúscula como minúscula, en ese caso decimos que será ignoreCase).

package EjerciciosComplemetariosNivel3;
import java.util.List;
public class Ejercicio3{

public static void main(String[] args) {
    List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

    long totalLetra=palabras.stream()
    .filter((letras) ->letras.startsWith("B") || letras.startsWith("b"))
    .count();
     System.out.println(totalLetra);
}
}