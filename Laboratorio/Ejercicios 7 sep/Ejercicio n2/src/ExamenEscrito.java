public class ExamenEscrito extends Examen{
    private int duracionMinutos;
    private NotaNumerica notaNumerica;

    public ExamenEscrito(int duracionMinutos, NotaNumerica notaNumerica) {
        this.duracionMinutos = duracionMinutos;
        this.notaNumerica = notaNumerica;
    }

    public ExamenEscrito(String fechaRealizacion, int duracionMinutos, NotaNumerica notaNumerica) {
        super(fechaRealizacion);
        this.duracionMinutos = duracionMinutos;
        this.notaNumerica = notaNumerica;
    }

    @Override
    public boolean esAprobado(){
        return notaNumerica.getNotaValor() >= NotaNumerica.SEIS.getNotaValor();
    }
}
