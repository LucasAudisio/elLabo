public class Paloma implements Mensajero{
    static String especie = "caniche";
    public String color;
    public String nombre;
    public boolean sabeMapa;

    public Paloma(String color, String nombre, boolean sabeMapa) {
        this.color = color;
        this.nombre = nombre;
        this.sabeMapa = sabeMapa;
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        Paloma.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSabeMapa() {
        return sabeMapa;
    }

    public void setSabeMapa(boolean sabeMapa) {
        this.sabeMapa = sabeMapa;
    }

    @Override
    public String mandarMensaje(String partido){
        if(this.sabeMapa){
            return "Lanzando un papelito que dice que votes por el partido: " + partido;
        }
        return "";
    }
}
