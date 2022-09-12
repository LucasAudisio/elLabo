public class Pantalon extends Ropa{
    private int cintura;
    private int largo;
    private int cadera;

    public Pantalon(){
        super();
        cintura = 0;
        largo = 0;
        cadera = 0;
    }

    @Override
    public String toString(){
        return "color: " + color + " / marca: " + marca + " / material: " + material + " / estado: " + estado
                + " / cintura: " + cintura + " / largo: " + largo + " / cadera: " + cadera;
    }
}
