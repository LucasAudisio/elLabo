import java.time.LocalDate;
import java.util.HashSet;

public class Paciente extends Persona{
    private int nroHistoriaClinica;
    private String sexo;
    private GrupoSanguineo grupoSanguineo;
    private HashSet<String> medicamentosAlergico;

    public Paciente(int dni, String nombre, String apellido, LocalDate fechaNac, String direccion, String ciudadProcedencia, int nroHistoriaClinica, String sexo, GrupoSanguineo grupoSanguineo, HashSet<String> medicamentosAlergico) {
        super(dni, nombre, apellido, fechaNac, direccion, ciudadProcedencia);
        this.nroHistoriaClinica = nroHistoriaClinica;
        this.sexo = sexo;
        this.grupoSanguineo = grupoSanguineo;
        this.medicamentosAlergico = medicamentosAlergico;
    }

    public int getNroHistoriaClinica() {
        return nroHistoriaClinica;
    }

    public void setNroHistoriaClinica(int nroHistoriaClinica) {
        this.nroHistoriaClinica = nroHistoriaClinica;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public GrupoSanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(GrupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public HashSet<String> getMedicamentosAlergico() {
        return medicamentosAlergico;
    }

    public void setMedicamentosAlergico(HashSet<String> medicamentosAlergico) {
        this.medicamentosAlergico = medicamentosAlergico;
    }
}
