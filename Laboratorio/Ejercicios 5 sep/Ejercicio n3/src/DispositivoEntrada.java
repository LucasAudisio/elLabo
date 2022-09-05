public class DispositivoEntrada extends Dispositivo{
    private String tipoConector;

    public DispositivoEntrada(String nombre, String nombreFabricante, String modelo, float precio, int stock, String nombre1, String puertosValidos, String tipoConector) {
        super(nombre, nombreFabricante, modelo, precio, stock, nombre1, puertosValidos);
        this.tipoConector = tipoConector;
    }
}