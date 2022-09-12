public class ExamenOral extends Examen{
    public NivelSatisfaccion nivelSatisfaccion;

    public ExamenOral(NivelSatisfaccion nivelSatisfaccion) {
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    public ExamenOral(String fechaRealizacion, NivelSatisfaccion nivelSatisfaccion) {
        super(fechaRealizacion);
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    @Override
    public boolean esAprobado(){
        return (nivelSatisfaccion != NivelSatisfaccion.INSUFICIENTE);
    }
}
