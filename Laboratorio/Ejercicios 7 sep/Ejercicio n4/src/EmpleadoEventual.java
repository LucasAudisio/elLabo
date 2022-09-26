import java.time.LocalDate;

public class EmpleadoEventual extends EmpleadoAdministrativo{
    private double honorariosPorHora;
    private int horasTotales;
    private LocalDate fechaTerminoContrato;

    public EmpleadoEventual(int dni, String nombre, String apellido, LocalDate fechaNac, String direccion, String ciudadProcedencia, int codigoEmpleado, int horasExtra, LocalDate fechaIngreso, String area, String cargo, double honorariosPorHora, int horasTotales, LocalDate fechaTerminoContrato) {
        super(dni, nombre, apellido, fechaNac, direccion, ciudadProcedencia, codigoEmpleado, horasExtra, fechaIngreso, area, cargo);
        this.honorariosPorHora = honorariosPorHora;
        this.horasTotales = horasTotales;
        this.fechaTerminoContrato = fechaTerminoContrato;
    }

    public double getHonorariosPorHora() {
        return honorariosPorHora;
    }

    public void setHonorariosPorHora(double honorariosPorHora) {
        this.honorariosPorHora = honorariosPorHora;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public LocalDate getFechaTerminoContrato() {
        return fechaTerminoContrato;
    }

    public void setFechaTerminoContrato(LocalDate fechaTerminoContrato) {
        this.fechaTerminoContrato = fechaTerminoContrato;
    }
}
