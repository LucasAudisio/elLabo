import java.time.LocalDate;

abstract class Lectura {
    protected int codigo;
    protected String titulo;
    protected int añoPub;

    public Lectura(){
        codigo = 0;
        titulo = "";
        añoPub = 0;
    }

    @Override
    public String toString(){
        return "titulo: " + titulo + " / codigo: " + codigo + " / año: " + añoPub;
    }
}
