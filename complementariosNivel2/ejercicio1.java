//Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
//luego imprimir por pantalla el ranking
package complementariosNivel2;

import java.util.*;
 public class ejercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        List<ciudades> ciudad = new ArrayList<ciudades>();
        ciudades rankingCiudad = null;
        String nombreCiudad;
        
        System.out.println("Ingrese numero de ciudades: ");
        int numeroCiudades = input.nextInt();
        int counter = 0;
        

        while (counter < numeroCiudades) {

            //Crea nuevo objeto.
            rankingCiudad = new ciudades();
            System.out.println("Ingrese nombre de la ciudad: ");
            nombreCiudad = input.next();
            rankingCiudad.setCiudad(nombreCiudad); 
            

            //Agrega objeto ciudad a ArrayList
            ciudad.add(rankingCiudad);
            //Incrementa contador.
            counter++;
        }
       // metodo para ordenar
       Collections.sort(ciudad, new Comparator<ciudades>() {
        @Override
        public int compare(ciudades o1, ciudades o2){
            return  o1.getCiudad().compareTo(o2.getCiudad());
        }  
       });


       //Imprime valores ordenados
       for(int i = 0; i <ciudad.size(); i++){
           System.out.println( (i+1) + ") " +  ciudad.get(i).getCiudad() );           
       }       
       input.close();
    }

}   