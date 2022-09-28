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

    public String nombreMedicoSegunCodigo(int codigoMedico){
        for(int i=0; i<medicos.size(); i++){
            if (medicos.get(i).getCodigoEmpleado() == codigoMedico){
                return medicos.get(i).getNombre();
            }
        }
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
        ArrayList<Medico> arrayMedicos = medicos;
        Medico medicoTemp;
        while(!arrayOrdenado) {
            arrayOrdenado = true;
            for (int i = 0; i < arrayMedicos.size() - 1; i++) {
                if (compararPalabras(arrayMedicos.get(i).getEspecialidad(), arrayMedicos.get(i + 1).getEspecialidad()) < 0) {
                    medicoTemp = arrayMedicos.get(i);
                    arrayMedicos.set(i, arrayMedicos.get(i + 1));
                    arrayMedicos.set(i + 1, medicoTemp);
                    arrayOrdenado = false;
                }
            }
        }
        for (int i = 0; i < arrayMedicos.size(); i++){
            System.out.println("DNI: " + medicos.get(i).getDni + "Especialidad: " + medicos.get(i).getEspecialidad());
        }
    }

    public void pacientesDeUnMedico(int codigoMedico){
        String nombreMedico = nombreMedicoSegunCodigo(codigoMedico);
        HashSet<Integer> dnisPacientes = new HashSet<>();
        for (CitaMedica citaActual : citasMedicas){
            if(citaActual.getNombreMedico() == nombreMedico){
                dnisPacientes.add(citaActual.getDniPaciente());
            }
        }
        for (Paciente pacienteActual : pacientes){
            if(dnisPacientes.contains(pacienteActual.getDni())){
                System.out.println("Nombre: " + pacienteActual.getNombre() + "Apellido: " + pacienteActual.getApellido());
            }
        }
    }
}
