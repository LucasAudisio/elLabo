import java.util.ArrayList;

public class PartidoPolitico{
    public int afiliados;
    public String nombre;
    public String direccion;
    public ArrayList<Mensajero> mensajeros;

    public PartidoPolitico(int afiliados, String nombre, String direccion, ArrayList<Mensajero> mensajeros) {
        this.afiliados = afiliados;
        this.nombre = nombre;
        this.direccion = direccion;
        this.mensajeros = mensajeros;
    }

    public void agregarMensajero(Mensajero mensajero){
        mensajeros.add(mensajero);
    }

    public void hacerCampaña(){
        for (Mensajero mensajeroActual : mensajeros){
            System.out.println(mensajeroActual.mandarMensaje(this.nombre));
        }
    }
}
