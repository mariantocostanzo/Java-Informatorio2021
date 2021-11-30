package complementariosNivel2;

public class Carta {
     
    //Atributos
    private int numero;
    private String palo;

    //Constructor
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    @Override
    public String toString() {
        return "numero=" + numero + ", palo=" + palo;
    }
     
}