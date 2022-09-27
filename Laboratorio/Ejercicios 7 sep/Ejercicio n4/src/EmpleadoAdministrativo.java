import java.time.LocalDate;

public abstract class EmpleadoAdministrativo extends Persona{
    private int codigoEmpleado;
    private int horasExtra;
    private LocalDate fechaIngreso;
    private String area;
    private String cargo;

    public EmpleadoAdministrativo(int dni, String nombre, String apellido, LocalDate fechaNac, String direccion,
                                  String ciudadProcedencia, int codigoEmpleado, int horasExtra, LocalDate fechaIngreso,
                                  String area, String cargo){
        super(dni, nombre, apellido, fechaNac, direccion, ciudadProcedencia);
        this.horasExtra = horasExtra;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.cargo = cargo;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
