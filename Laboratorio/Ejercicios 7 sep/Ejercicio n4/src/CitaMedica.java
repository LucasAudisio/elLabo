import java.time.LocalDateTime;

public class CitaMedica {
    private int dniPaciente;
    private int nro;
    private LocalDateTime fechaYHora;
    private int codigoEmpAtendiende;
    private String nombreMedico;
    private String servicio;

    public CitaMedica(int dniPaciente, int nro, LocalDateTime fechaYHora, int codigoEmpAtendiende, String nombreMedico, String servicio) {
        this.dniPaciente = dniPaciente;
        this.nro = nro;
        this.fechaYHora = fechaYHora;
        this.codigoEmpAtendiende = codigoEmpAtendiende;
        this. nombreMedico = nombreMedico;
        this.servicio = servicio;
    }

    public int getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(int dniPaciente) {
        this.dniPaciente = dniPaciente;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public int getCodigoEmpAtendiende() {
        return codigoEmpAtendiende;
    }

    public void setCodigoEmpAtendiende(int codigoEmpAtendiende) {
        this.codigoEmpAtendiende = codigoEmpAtendiende;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
}
