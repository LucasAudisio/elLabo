import java.time.LocalDate;

public class EmpleadoPlanilla extends EmpleadoAdministrativo{
    private double salarioMensual;
    private double porcentajeHorasExtra;

    public EmpleadoPlanilla(int dni, String nombre, String apellido, LocalDate fechaNac, String direccion, String ciudadProcedencia, int codigoEmpleado, int horasExtra, LocalDate fechaIngreso, String area, String cargo, double salarioMensual, double porcentajeHorasExtra) {
        super(dni, nombre, apellido, fechaNac, direccion, ciudadProcedencia, codigoEmpleado, horasExtra, fechaIngreso, area, cargo);
        this.salarioMensual = salarioMensual;
        this.porcentajeHorasExtra = porcentajeHorasExtra;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public double getPorcentajeHorasExtra() {
        return porcentajeHorasExtra;
    }

    public void setPorcentajeHorasExtra(double porcentajeHorasExtra) {
        this.porcentajeHorasExtra = porcentajeHorasExtra;
    }
}
