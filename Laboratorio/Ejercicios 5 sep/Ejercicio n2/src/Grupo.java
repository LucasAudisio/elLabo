import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Grupo {
    private int numero;
    private double valUmbral;
    private ArrayList<Alarma> alarmas;

    public Grupo(int numero, double valUmbral){
        this.numero=numero;
        this.valUmbral=valUmbral;
        alarmas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Alarma> getAlarmas() {
        return alarmas;
    }

    public void setAlarmas(ArrayList<Alarma> alarmas) {
        this.alarmas = alarmas;
    }

    public double getValUmbral() {
        return valUmbral;
    }

    public void setValUmbral(double valUmbral) {
        this.valUmbral = valUmbral;
    }

    public void alarmaCompleja(){
        System.out.println("Los sensores del grupo " + this.numero + " detectan valores anormales");
    }


}