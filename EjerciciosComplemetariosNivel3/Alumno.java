package EjerciciosComplemetariosNivel3;
import java.time.LocalDate;
import java.time.Period;

public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;

    public Alumno() {

    }

    public Alumno(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreCompuesto() {
        return "\"" + apellido + " " + nombre + "\"";
    }

    public Integer getEdad() {
        return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
    }

    public void setfechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

}
