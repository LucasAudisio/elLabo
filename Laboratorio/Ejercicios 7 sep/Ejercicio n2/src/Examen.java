public abstract class Examen {
    private String fechaRealizacion;

    public Examen() {
        fechaRealizacion = "";
    }

    public Examen(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public abstract boolean esAprobado();
}
