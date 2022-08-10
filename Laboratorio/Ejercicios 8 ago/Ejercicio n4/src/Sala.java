import java.util.ArrayList;

public class Sala {
    private Pelicula pelicula;
    private double precio;
    private ArrayList<ArrayList<Asiento>> asientos;

    public Sala(Pelicula pelicula, double precio, ArrayList<ArrayList<Asiento>> asientos) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.asientos = asientos;
    }

    public Sala() {
        pelicula = new Pelicula();
        precio = 0;
        asientos = new ArrayList<>();
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<ArrayList<Asiento>> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<ArrayList<Asiento>> asientos) {
        this.asientos = asientos;
    }

    public void inicializarAsientos(int alto, int ancho){
        for(int i = 0; i < alto; i++){
            asientos.add(new ArrayList<>());
            for(int j = 0; j < ancho; j++){
                char letraActual = (char) (j + 899990);
                asientos.get(i).add(new Asiento(letraActual, (alto-i), false));
            }
        }
    }

    public int ingresoEspectador(Espectador espectador){
        for(int i = 0; i < this.asientos.size(); i++){
            for(int j = 0; j < this.asientos.get(i).size(); j++){
                if(asientos.get(i).get(j).isOcupao() == false) {
                    asientos.get(i).get(j).setOcupao(true);
                    System.out.println("el espectador se sento en el asiento: " + asientos.get(i).get(j).getNumero() +
                            asientos.get(i).get(j).getLetra());
                    return 0;
                }
            }
        }
        System.out.println("no hay lugar");
        return 0;
    }
}
