import java.util.ArrayList;

public class Sistema {
    private ArrayList<Venta> ventas;

    private void comprar(Computadora computadora, Venta venta){
        venta.getComputadora().restarStock();
        this.ventas.add(venta);
    }
}