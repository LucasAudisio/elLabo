import java.time.LocalDate;

public class Medico extends Persona{
    private String especialidad;
    private String servicio;
    private int nroConsultorio;

    public Medico(int dni, String nombre, String apellido, LocalDate fechaNac, String direccion, String ciudadProcedencia, String especialidad, String servicio, int nroConsultorio) {
        super(dni, nombre, apellido, fechaNac, direccion, ciudadProcedencia);
        this.especialidad = especialidad;
        this.servicio = servicio;
        this.nroConsultorio = nroConsultorio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getNroConsultorio() {
        return nroConsultorio;
    }

    public void setNroConsultorio(int nroConsultorio) {
        this.nroConsultorio = nroConsultorio;
    }
}
