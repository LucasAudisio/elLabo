import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Hospital implements OperacionesHospital{
    private HashSet<EmpleadoAdministrativo> empleadosAdministrativos;
    private ArrayList<Medico> medicos;
    private HashSet<Paciente> pacientes;
    private HashSet<CitaMedica> citasMedicas;

    public Hospital(){
        this.empleadosAdministrativos = new HashSet<>();
        this.medicos = new ArrayList<>();
        this.pacientes = new HashSet<>();
        this.citasMedicas = new HashSet<>();
    }

    public boolean existeEmpleado(int codigoEmpleado){
        for (EmpleadoAdministrativo empleadoActual : empleadosAdministrativos){
            if (empleadoActual.getCodigoEmpleado() == codigoEmpleado){
                return true;
            }
        }
        return false;
    }

    public boolean existeMedico(String nombreMedico){
        for (Medico medicoActual : medicos) {
            if (medicoActual.getNombre() == nombreMedico){
                return true;
            }
        }
        return false;
    }

    public int compararPalabras(String palabra1, String palabra2){
        return palabra1.compareToIgnoreCase(palabra2);
    }

    public HashSet<Paciente> pacientesDeUnMedico(int codigoMedico){
        HashSet<Paciente> pacientesCorrespondientes = new HashSet<>();

    }

    public void registrarEmpleado(EmpleadoAdministrativo empleado){
        this.empleadosAdministrativos.add(empleado);
    }

    public void registrarMedico(Medico medico){
        this.medicos.add(medico);
    }

    public void registrarPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }

    public void registrarCita(CitaMedica cita){
        if(existeEmpleado(cita.getCodigoEmpAtendiende()) && existeMedico(cita.getNombreMedico())){
            citasMedicas.add(cita);
        }
        else System.out.println("No se puede registrar la cita");
    }

    public void listarMedicosPorEspecialidad(){
        boolean arrayOrdenado = false;
        Medico medicoTemp;
        for (int i=0; i<medicos.size()-1; i++){
            if (compararPalabras(medicos.get(i).getEspecialidad(), medicos.get(i+1).getEspecialidad())>0){
                medicoTemp = medicos.get(i);
                medicos.set(i, medicos.get(i+1));
                medicos.set(i+1, medicoTemp);
            }
        }
        
    }
}
