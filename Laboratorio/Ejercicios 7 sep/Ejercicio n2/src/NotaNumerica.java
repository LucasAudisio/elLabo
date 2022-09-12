public enum NotaNumerica {
    UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10);

    private int notaValor;

    private NotaNumerica(int notaValor){
        this.notaValor = notaValor;
    }

    public int getNotaValor(){
        return notaValor;
    }
}
