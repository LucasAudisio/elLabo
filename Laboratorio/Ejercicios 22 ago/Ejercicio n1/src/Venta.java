public class Venta {
    private Cliente cliente;
    private String metodoPago;
    private static int recargaTarjeta = 5;
    private int numeroTarjeta;
    private String nombreBanco;
    private boolean esDebito;
    private float dinero;
    private Computadora computadora;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public static int getRecargaTarjeta() {
        return recargaTarjeta;
    }

    public static void setRecargaTarjeta(int recargaTarjeta) {
        Venta.recargaTarjeta = recargaTarjeta;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public boolean isEsDebito() {
        return esDebito;
    }

    public void setEsDebito(boolean esDebito) {
        this.esDebito = esDebito;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Venta(Computadora computadora, Cliente cliente, String metodoPago, int numeroTarjeta, String nombreBanco, boolean esDebito) {
        this.cliente = cliente;
        this.metodoPago = metodoPago;
        if(!computadora.comprobarComputadora()) System.out.println("no es valida");
        this.dinero = computadora.calcularPrecio() * cliente.getInflasionPais() / 100 + computadora.calcularPrecio();
        if(metodoPago.equals("tarjeta")){
            this.numeroTarjeta = numeroTarjeta;
            this.nombreBanco = nombreBanco;
            this.esDebito = esDebito;
            this.dinero = this.dinero * recargaTarjeta / 100 + this.dinero;
        }
    }
}
