import java.util.ArrayList;

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
        
        SistemaAlarmas sistema1 = new SistemaAlarmas();
        sistema1.setDetsHumo(detectoresHumo);
        sistema1.setGrupos(grupos);
        sistema1.ejecucionGrupos();
        sistema1.ejecucionIndividual();
    }
}