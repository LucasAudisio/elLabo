public abstract class Dispositivo extends Componente{
    private String nombre;
    private String puertosValidos;

    public Dispositivo(String nombre, String nombreFabricante, String modelo, float precio, int stock, String nombre1, String puertosValidos) {
        super(nombre, nombreFabricante, modelo, precio, stock);
        this.nombre = nombre1;
        this.puertosValidos = puertosValidos;
    }
}