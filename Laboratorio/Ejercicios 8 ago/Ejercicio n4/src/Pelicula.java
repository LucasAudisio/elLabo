public class Pelicula {
    private String titulo;
    private int duracionSegundos;
    private int edadMin;
    private String director;

    public Pelicula(String titulo, int duracionSegundos, int edadMin, String director) {
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
        this.edadMin = edadMin;
        this.director = director;
    }

    public Pelicula() {
        titulo = "";
        duracionSegundos = 0;
        edadMin = 0;
        director = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
