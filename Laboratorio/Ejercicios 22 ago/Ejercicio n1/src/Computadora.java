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
        if(this.dispositivosSalida.size() < dispositivoSalidaMinimos) return false;
        if(this.dispositivosEntrada.size() < dispositivoEntradaMinimos) return false;
        int cont = 0;
        for(int i = 0; i < this.componentes.size(); i++){
            for(int j = 0; j < componentesMinimos.size(); j++){
                if(componentesMinimos.get(j).equals(componentes.get(i))) cont++;
            }
        }
        if(cont < componentesMinimos.size()) return false;
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
        for(int i = 0; i < this.componentes.size(); i++){
            if(componentes.get(i).getStock() <= 0) {
                System.out.println("no hay stock");
                return 0;
            }
        }
        for(int i = 0; i < this.dispositivosSalida.size(); i++){
            if(dispositivosSalida.get(i).getStock() <= 0) {
                System.out.println("no hay stock");
                return 0;
            }
        }
        for(int i = 0; i < this.dispositivosEntrada.size(); i++){
            if(dispositivosEntrada.get(i).getStock() <= 0) {
                System.out.println("no hay stock");
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
