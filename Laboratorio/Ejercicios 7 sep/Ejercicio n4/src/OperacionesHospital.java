import java.util.HashSet;

public interface OperacionesHospital {
    public boolean existeEmpleado(int codigoEmpleado);
    public boolean existeMedico(String nombreMedico);
    public int compararPalabras(String palabra1, String palabra2);
    //String.compareToIgnoreCase(String). Si devuelve >0 el string es mayor al que compara
    //guardar nombre del medico segun su codigo, recorrer citas medicas, guardar en un hashmap los
    //pacientes adecuados (no se si hace falta poner alguna funcion en la interfaz)
}
