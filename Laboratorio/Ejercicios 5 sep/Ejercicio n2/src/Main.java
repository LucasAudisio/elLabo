import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<DetecHumo> detectoresHumo = new ArrayList<>();
        detectoresHumo.add(new DetecHumo(true, 2022, 0));
        detectoresHumo.add(new DetecHumo(true, 2022, 15));

        ArrayList<Alarma> alarmas = new ArrayList<>();
        alarmas.add(new DetecHumo(true, 2022, 3));
        alarmas.add(new DetecTemperatura(true, 2022, 3));

        Grupo grupo1 = new Grupo(1, 5);
        grupo1.setAlarmas(alarmas);

        ArrayList<Grupo> grupos = new ArrayList<>();
        grupos.add(grupo1);

        boolean nroValido=false;
        while (!nroValido) {
            try {
                Scanner nroAlarma = new Scanner(System.in);
                System.out.println("Ingrese el numero de alarma que quiere ver");
                int numAlarma = nroAlarma.nextInt();
                nroValido=true;
                String nombreClase = alarmas.get(numAlarma-1).getClass().toString();
                System.out.println("Tipo: " + nombreClase.substring(6));
                System.out.println("Año: " + alarmas.get(numAlarma-1).getAño());
                if (alarmas.get(numAlarma-1).isConectado()) System.out.println("Estado: Conectado");
                else System.out.println("Estado: Desconectado");
                alarmas.get(numAlarma-1).mostrarValores();
            } catch (InputMismatchException e) {
                System.out.println("El numero ingresado no es valido, ingrese uno entero");
                nroValido=false;
            }
            catch (IndexOutOfBoundsException f){
                System.out.println("El numero ingresado no es valido, ingrese uno dentro del rango de alarmas");
                nroValido=false;
            }
        }

        SistemaAlarmas sistema1 = new SistemaAlarmas();
        sistema1.setDetsHumo(detectoresHumo);
        sistema1.setGrupos(grupos);
        sistema1.ejecucionGrupos();
        sistema1.ejecucionIndividual();
    }
}