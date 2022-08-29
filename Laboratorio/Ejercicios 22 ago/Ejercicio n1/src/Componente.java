public class Componente {
    private String nombre;
    private String nombreFabricante;
    private String modelo;
    private float precio;
    private int stock;

    public Componente(String nombre, String nombreFabricante, String modelo, float precio, int stock) {
        this.nombre = nombre;
        this.nombreFabricante = nombreFabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public Componente() {
        nombre = "";
        nombreFabricante = "";
        modelo = "";
        precio = 0;
        stock = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void restarStock(){
        this.stock--;
    }
}
