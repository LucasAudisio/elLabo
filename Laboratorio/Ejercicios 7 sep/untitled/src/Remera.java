import java.time.LocalDate;

public class Remera extends Ropa{
    private int contorno;
    private int espalda;
    private int largoTorso;

    public Remera(){
        super();
        contorno = 0;
        espalda = 0;
        largoTorso = 0;
    }

    @Override
    public String toString(){
        return "color: " + color + " / marca: " + marca + " / material: " + material + " / estado: " + estado
                + " / contorno: " + contorno + " / espalda: " + espalda + " / largoTorso: " + largoTorso;
    }
}
