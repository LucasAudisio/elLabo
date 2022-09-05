public abstract class Alarma {
    private boolean conectado;
    private int año;

    public Alarma(boolean conectado, int año){
        this.conectado=conectado;
        this.año=año;
    }

    public abstract double getvalor();

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void mostrarValores(){

    }
}