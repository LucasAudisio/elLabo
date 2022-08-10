public class Cuenta {
    private String nombre;
    private int numero;
    private float interes;
    private float saldodisponible;

    public Cuenta(String nombre, int numero, float interes, float saldodisponible) {
        this.nombre = nombre;
        this.numero = numero;
        this.interes = interes;
        this.saldodisponible = saldodisponible;
    }
    public Cuenta(int numero, float interes, float saldodisponible) {
        this.nombre = "Juan";
        this.numero = numero;
        this.interes = interes;
        this.saldodisponible = saldodisponible;
    }

    public Cuenta() {
        nombre = "AlejoG";
        numero = 13;
        interes = (float) 5.3;
        saldodisponible = 777;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public float getSaldodisponible() {
        return saldodisponible;
    }

    public void setSaldodisponible(float saldodisponible) {
        this.saldodisponible = saldodisponible;
    }

    public void IngresoDineral(int dinero){
        this.saldodisponible = this.saldodisponible + (dinero - (this.interes * dinero / 100));
    }
    public boolean ExtractoDineral(int dinero){
        this.saldodisponible = this.saldodisponible - dinero;
        if (saldodisponible < 0){
            System.out.println("No se  pudo :( ");
            this.saldodisponible = this.saldodisponible + dinero;
            return false;
        }
        else{
            System.out.println("Si se pudo :D ");
            return true;
        }
    }

    public static void transferirDineral(int dinero, Cuenta Cuentaemisora, Cuenta Cuentarecibidora){
        if(Cuentaemisora.ExtractoDineral(dinero) == true) {
            Cuentarecibidora.IngresoDineral(dinero);
        }
    }
}
