import java.util.ArrayList;

public class Libro extends Lectura implements Prestable{
    private ArrayList<Integer> paginasPorCapitulo;

    public Libro(){
        super();
        paginasPorCapitulo = new ArrayList<>();
    }

    @Override
    public String toString(){
        String juan = "titulo: " + this.titulo + " / año publicacion: " + this.añoPub + " / codigo: " + this.codigo;
        for(int i = 0; i < paginasPorCapitulo.size(); i++){
            juan += " / paginasCapitulo " + (i + 1) + ": " + paginasPorCapitulo.get(i);
        }
        return juan;
    }

    @Override
    public void agregarElemento(){
        if(paginasPorCapitulo.size() % 2 == 0){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
        }
        else{
            System.out.println("El articulo ingresado no podrá ingresar a nuestro sistema");
        }
    }

    @Override
    public void prestar(){
        if(paginasPorCapitulo.size() % 2 == 0){
            System.out.println("El/La libro se dará prestado");
        }
        else{
            System.out.println("El/La libro no se dará prestado");
        }
    }
}
