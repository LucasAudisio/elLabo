public class Asiento {
    private char letra;
    private int numero;
    private boolean ocupao;

    public Asiento(char letra, int numero, boolean ocupao) {
        this.letra = letra;
        this.numero = numero;
        this.ocupao = ocupao;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupao() {
        return ocupao;
    }

    public void setOcupao(boolean ocupao) {
        this.ocupao = ocupao;
    }
}
