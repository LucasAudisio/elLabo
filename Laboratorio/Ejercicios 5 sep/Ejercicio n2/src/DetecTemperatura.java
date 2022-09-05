public class DetecTemperatura extends Alarma{
    public static int valorUmbral = 2;
    private double temperatura;

    public DetecTemperatura(boolean conectado, int año, int temperatura){
        super(conectado, año);
        this.temperatura=temperatura;
    }

    public double getvalor() {
        return temperatura;
    }
    public void alarma(){
        System.out.println("Cuidado! La temperatura sube");
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void mostrarValores(){
        System.out.println("Valor umbral: " + valorUmbral);
        System.out.println("Temperatura: " + temperatura);
    }
}