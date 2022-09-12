import java.time.LocalDate;

abstract class Ropa implements Prestable{
    protected String color;
    protected String marca;
    protected String material;
    protected String estado;

    public Ropa(){
        color = "";
        marca = "";
        material = "";
        estado = "";
    }

    @Override
    public String toString(){
        return "color: " + color + " / marca: " + marca + " / material: " + material + " / estado: " + estado;
    }
    @Override
    public void agregarElemento(){
        if(estado.equals("bueno")){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
        }
        else{
            System.out.println("El articulo ingresado no podrá ingresar a nuestro sistema");
        }
    }

    @Override
    public void prestar(){
        if(estado.equals("bueno")){
            System.out.println("El/La prenda se dará prestado");
        }
        else{
            System.out.println("El/La prenda no se dará prestado");
        }
    }
}
