import java.util.HashSet;

public interface OperacionesHospital {
    public boolean existeEmpleado(int codigoEmpleado);
    public boolean existeMedico(String nombreMedico);
    public int compararPalabras(String palabra1, String palabra2);
    public String nombreMedicoSegunCodigo(int codigoMedico);
}
