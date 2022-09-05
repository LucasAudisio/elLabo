import java.util.ArrayList;
import java.util.Arrays;

public class Computadora {
    private ArrayList<Componente> componentes;
    private ArrayList<DispositivoEntrada> dispositivosEntrada;
    private ArrayList<DispositivoSalida> dispositivosSalida;

    private static int dispositivoEntradaMinimos = 1;
    private static int dispositivoSalidaMinimos = 1;
    private static ArrayList<String> componentesMinimos = new ArrayList<>(Arrays.asList("Procesador"));

    public Computadora(ArrayList<Componente> componentes, ArrayList<DispositivoEntrada> dispositivosEntrada, ArrayList<DispositivoSalida> dispositivosSalida) {
        this.componentes = componentes;
        this.dispositivosEntrada = dispositivosEntrada;
        this.dispositivosSalida = dispositivosSalida;
    }

    public boolean comprobarComputadora(){
        try{
            int nroTemp = 1/dispositivosSalida.size();
            nroTemp = 1/dispositivosEntrada.size();
        }
        catch (ArithmeticException e){
            System.out.println("La computadora no tiene los dispositivos de entrada y salida requeridos");
            return false;
        }
        int cont = 0;
        for(int i = 0; i < this.componentes.size(); i++){
            for(int j = 0; j < componentesMinimos.size(); j++){
                if(componentesMinimos.get(j).equals(componentes.get(i))) cont++;
            }
        }
        try{
            int nroTemp = 1/componentesMinimos.size();
        }
        catch (ArithmeticException e){
            System.out.println("La computadora no tiene los componentes minimos");
            return false;
        }
        return true;
    }

    public float calcularPrecio(){
        float precioTotal = 0;
        for(int i = 0; i < this.componentes.size(); i++){
            precioTotal += componentes.get(i).getPrecio();
        }
        for(int i = 0; i < this.dispositivosSalida.size(); i++){
            precioTotal += dispositivosSalida.get(i).getPrecio();
        }
        for(int i = 0; i < this.dispositivosEntrada.size(); i++){
            precioTotal += dispositivosEntrada.get(i).getPrecio();
        }
        return precioTotal;
    }

    public int restarStock(){
        //comprobacion
        for(int i = 0; i < this.componentes.size(); i++) {
            try{
                int nroComprobar = 1/componentes.get(i).getStock();
            }
            catch (ArithmeticException e){
                System.out.println("No hay stock del producto");
                return 0;
            }
        }
        for(int i = 0; i < this.dispositivosSalida.size(); i++){
            try{
                int nroComprobar = 1/dispositivosSalida.get(i).getStock();
            }
            catch (ArithmeticException e){
                System.out.println("No hay stock del producto");
                return 0;
            }
        }
        for(int i = 0; i < this.dispositivosEntrada.size(); i++){
            try{
                int nroComprobar = 1/dispositivosEntrada.get(i).getStock();
            }
            catch (ArithmeticException e){
                System.out.println("No hay stock del producto");
                return 0;
            }
        }
        //resta
        for(int i = 0; i < this.componentes.size(); i++) componentes.get(i).restarStock();

        for(int i = 0; i < this.dispositivosSalida.size(); i++) dispositivosSalida.get(i).restarStock();

        for(int i = 0; i < this.dispositivosEntrada.size(); i++) dispositivosEntrada.get(i).restarStock();

        return 0;
    }
}