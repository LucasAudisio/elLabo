public class Celular implements Mensajero{
    public int numeroSerie;
    public String fabricante;
    public String modelo;
    public int numero;
    public String empresaTelefonica;
    public boolean prendido;
    public int saldo;

    public Celular(int saldo, boolean prendido, int numeroSerie, String fabricante, String modelo, int numero, String empresaTelefonica) {
        this.numeroSerie = numeroSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numero = numero;
        this.empresaTelefonica = empresaTelefonica;
        this.prendido = prendido;
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmpresaTelefonica() {
        return empresaTelefonica;
    }

    public void setEmpresaTelefonica(String empresaTelefonica) {
        this.empresaTelefonica = empresaTelefonica;
    }

    @Override
    public String mandarMensaje(String partido){
        if(this.prendido && this.saldo >= 1){
            saldo--;
            return "Conectando con la antena más cercana";
        }
        return "";
    }
}
