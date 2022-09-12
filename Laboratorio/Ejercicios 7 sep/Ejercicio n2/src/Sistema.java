import java.util.ArrayList;

public class Sistema {
    private ArrayList<Alumno> alumnos;

    public int cantAprobados(){
        int cant = 0;
        for(Alumno alumnoActual : alumnos){
            if (alumnoActual.esAprobado()) cant++;
        }
        return cant;
    }
}
