public class DispositivoSalida extends Dispositivo{
    private String metodoImpresion;

    public DispositivoSalida(String nombre, String nombreFabricante, String modelo, float precio, int stock, String nombre1, String puertosValidos, String metodoImpresion) {
        super(nombre, nombreFabricante, modelo, precio, stock, nombre1, puertosValidos);
        this.metodoImpresion = metodoImpresion;
    }
}