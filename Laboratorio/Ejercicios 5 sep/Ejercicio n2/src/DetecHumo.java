public class DetecHumo extends Alarma{
    public static int valorUmbral = 1;
    private double humo;

    public DetecHumo(boolean conectado, int año, int humo){
        super(conectado, año);
        this.humo=humo;
    }

    public double getvalor() {
        return humo;
    }

    public double getHumo(){
        return this.humo;
    }

    public void setHumo(double humo) {
        this.humo = humo;
    }

    public void alarma()
    {
        System.out.println("Se llamaron al Montag");
    }
    @Override
    public void mostrarValores(){
        System.out.println("Valor umbral: " + valorUmbral);
        System.out.println("Humo: " + humo);
    }
}