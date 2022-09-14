import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajador implements Mensajero{
    public String nombre;
    public String apellido;
    public int DNI;
    public LocalDate nacimiento;
    public int CUIL;
    public float sueldo;
    public String direccion;
    static int horaInicioLaburo = 8;
    static int horaFinLaburo = 17;
    static int horaAlmuerzo = 12;
    static int duracionAlmuerzo = 1;

    public Trabajador(String nombre, String apellido, int DNI, LocalDate nacimiento, int CUIL, float sueldo, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.nacimiento = nacimiento;
        this.CUIL = CUIL;
        this.sueldo = sueldo;
        this.direccion = direccion;
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getCUIL() {
        return CUIL;
    }

    public void setCUIL(int CUIL) {
        this.CUIL = CUIL;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String mandarMensaje(String partido){
        int horaActual = LocalTime.now().getHour();
        if ((horaActual >= Trabajador.horaInicioLaburo && horaActual < Trabajador.horaAlmuerzo)
                || (horaActual >= (horaAlmuerzo + duracionAlmuerzo) && horaActual < horaFinLaburo)){
            return "yo " + this.nombre + " te invito a que votes por " + partido;
        }
        return "";
    }
}
