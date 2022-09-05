public class DetecPresion extends Alarma{
    public static int valorUmbral = 3;
    private double presion;

    public DetecPresion(boolean conectado, int año, int presion){
        super(conectado, año);
        this.presion=presion;
    }

    public double getvalor() {
        return presion;
    }
    public void alarma(){
        System.out.println("Sensor de presion activado");
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    @Override
    public void mostrarValores(){
        System.out.println("Valor umbral: " + valorUmbral);
        System.out.println("Presion: " + presion);
    }
}