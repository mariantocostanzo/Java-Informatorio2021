//Se dispone de una lista de Empleados, de cada empleado se conoce:
//○	Nombre y Apellido
//○	DNI
//○	horasTrabajadas
//○	valorPorHora
//Todos los empleados están cargados en un Set (HashSet), 
//se desea calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa lista 
//para luego almacenar en un Map (o Diccionario) donde la clave (key) 
//es el dni y el valor (value) es el sueldo calculado. 


package complementariosNivel2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class ejercicio6 {

    String NombreApellido;
    int dni;
    int horasTrabajadas;
    int valorPorHora;

    ejercicio6(String NombreApellido, int dni, int horasTrabajadas, int valorPorHora){
        this.NombreApellido = NombreApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;

    }


    public static void main (String[] args){

            ejercicio6 trabajador1 = new ejercicio6("Maria Costanzo", 28006857, 8, 500);
            ejercicio6 trabajador2 = new ejercicio6("Iara Lescano", 30256478, 7, 400);
            ejercicio6 trabajador3 = new ejercicio6("Veronica Mayer", 2574122, 4, 200);

            HashSet<ejercicio6> trabajador = new HashSet<>();
            trabajador.add(trabajador1);
            trabajador.add(trabajador2);
            trabajador.add(trabajador3);


            Map<Integer,Integer> sueldo = new  HashMap<Integer, Integer>();

            sueldo.put(trabajador1.dni, (trabajador1.horasTrabajadas *trabajador1.valorPorHora));
            sueldo.put(trabajador2.dni, (trabajador2.horasTrabajadas *trabajador2.valorPorHora));
            sueldo.put(trabajador3.dni, (trabajador3.horasTrabajadas *trabajador3.valorPorHora));

            Iterator<Integer> it = sueldo.keySet().iterator();

            while(it.hasNext()){
                Integer key = it.next();
                System.out.println("Clave dni: " + key + " -> Valor sueldo mes: " + sueldo.get(key));
              }

              
    }

} 

