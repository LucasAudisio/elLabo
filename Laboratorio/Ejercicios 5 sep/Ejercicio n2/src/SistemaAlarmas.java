import java.util.ArrayList;
import java.util.HashMap;

public class SistemaAlarmas {
    private ArrayList<DetecHumo> detsHumo;
    private ArrayList<DetecPresion> detsPresion;
    private ArrayList<DetecTemperatura> detsTemp;
    private ArrayList<Grupo> grupos;

    public SistemaAlarmas(){
        this.detsHumo = new ArrayList<>();
        this.detsPresion = new ArrayList<>();
        this.detsTemp = new ArrayList<>();
        this.grupos = new ArrayList<>();
    }

    public void ejecucionIndividual(){
        for (int i=0; i<detsHumo.size(); i++) {
            if (detsHumo.get(i).getvalor() > DetecHumo.valorUmbral) {
                detsHumo.get(i).alarma();
            }
        }
        for (int i=0; i<detsTemp.size(); i++){
            if (detsTemp.get(i).getTemperatura()>DetecTemperatura.valorUmbral){
                detsTemp.get(i).alarma();
            }
        }
        for (int i=0; i<detsPresion.size(); i++){
            if (detsPresion.get(i).getPresion()>DetecPresion.valorUmbral){
                detsPresion.get(i).alarma();
            }
        }
    }

    public void ejecucionGrupos(){
        for (int i=0; i<grupos.size(); i++){
            double sumaGrupo=0.0;
            for (int j=0; j<grupos.get(i).getAlarmas().size(); j++){
                if (grupos.get(i).getAlarmas().get(j).isConectado()) {
                    sumaGrupo += grupos.get(i).getAlarmas().get(j).getvalor();
                }
            }
            sumaGrupo=sumaGrupo/grupos.get(i).getAlarmas().size();
            if (sumaGrupo>grupos.get(i).getValUmbral()){
                grupos.get(i).alarmaCompleja();
            }
            else System.out.println("Los valores detectados estan dentro del rango de los aceptados");
        }
    }

    public ArrayList<DetecHumo> getDetsHumo() {
        return detsHumo;
    }

    public void setDetsHumo(ArrayList<DetecHumo> detsHumo) {
        this.detsHumo = detsHumo;
    }

    public ArrayList<DetecPresion> getDetsPresion() {
        return detsPresion;
    }

    public void setDetsPresion(ArrayList<DetecPresion> detsPresion) {
        this.detsPresion = detsPresion;
    }

    public ArrayList<DetecTemperatura> getDetsTemp() {
        return detsTemp;
    }

    public void setDetsTemp(ArrayList<DetecTemperatura> detsTemp) {
        this.detsTemp = detsTemp;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }
}