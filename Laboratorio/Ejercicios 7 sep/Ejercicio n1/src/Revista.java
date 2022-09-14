import java.time.LocalDate;

public class Revista extends Lectura implements Prestable{
    private LocalDate publicacion;

    public Revista(){
        super();
        publicacion = LocalDate.now();
    }

    @Override
    public String toString(){
        return "titulo: " + this.titulo + " / codigo: " + this.codigo + " / añoPublicacion" + this.añoPub +
                " / fecha publicacion" + this.publicacion;
    }

    @Override
    public void agregarElemento(){
        int trimestreActual = (LocalDate.now().getMonthValue() - 1) * 3 / 12 + 1;
        if(this.publicacion.getMonthValue() <= trimestreActual * 4 - 4){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
        }
        else{
            System.out.println("El articulo ingresado no podrá ingresar a nuestro sistema");
        }
    }

    @Override
    public void prestar(){
        int trimestreActual = LocalDate.now().getMonthValue() * 3 / 12 + 1;
        if(this.publicacion.getMonthValue() <= trimestreActual * 4 - 4){
            System.out.println("El/La revista se dará prestado");
        }
        else{
            System.out.println("El/La revista no se dará prestado");
        }
    }
}
