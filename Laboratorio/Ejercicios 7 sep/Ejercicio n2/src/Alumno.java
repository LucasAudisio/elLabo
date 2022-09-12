import java.util.ArrayList;

public class Alumno {
    private int DNI;
    private String Nombre;
    private String Apellido;
    private ArrayList<Examen> examenesRealizados;

    public Alumno(int DNI, String nombre, String apellido, ArrayList<Examen> examenesRealizados) {
        this.DNI = DNI;
        Nombre = nombre;
        Apellido = apellido;
        this.examenesRealizados = examenesRealizados;
    }

    public boolean esAprobado(){
        for(Examen examenActual: examenesRealizados){
            if (!examenActual.esAprobado()) return false;
        }
        return true;
    }
}
