import com.sun.management.UnixOperatingSystemMXBean;

import java.util.ArrayList;

public class NominaLegisladores {
    private ArrayList<Legislador> legisladores;

    public NominaLegisladores(){
        legisladores = new ArrayList<>();
    }

    public void agregaLegislador(Legislador legislador){
        this.legisladores.add(legislador);
    }
    public void muestraContenido(){
        for (int i=0; i<legisladores.size(); i++ ){
            System.out.println("Legislador número: " + i+1);
            System.out.println("Tipo: " + legisladores.get(i).getClass().getName());
            System.out.println("Nombre: " + legisladores.get(i).getNombre() + " - Apellido: " + legisladores.get(i).getApellido()
            + " - Edad: " + legisladores.get(i).getEdad() + " - booleano: " + legisladores.get(i).isBooleano() +
            " - Provincia: " + legisladores.get(i).getProvincia());
            System.out.println("Partido: " + legisladores.get(i).getPartido() + " - Nro1: " +
            legisladores.get(i).getNro1() + " - Nro2: " + legisladores.get(i).getNro2());
        }
    }

    public int getTamaño(){
        return this.legisladores.size();
    }
}
