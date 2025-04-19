package ctrl__salud;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author mMJua
 */
public class OperacionesPaciente {
    public static ArrayList<Paciente> lc = new ArrayList(); //utilizo sin incrementador para que se agregen al final sin necesidad del identificador
        //creamos metodo guardar
        public static void Guardad(Paciente p) {
        lc.add(p);
        System.out.println("Paciente agregado: " + p.getIdPaciente());
    }
    
    //creamos el metodo buscar
    public static Paciente buscar(int cedula){
        for(Paciente p : lc){
            if(p.getIdPaciente() == cedula){
                System.out.println("encontrado");
                return p;
            }
        }
        return null;
}
    //creamos metodo para modificar 
    public static void modificar(int idPaciente, String nombrePaciente, int edad, String direccion, int telefono) {
    Paciente p = buscar(idPaciente); // busca al paciente por cdula
    if (p != null) {
        p.setNombrePaciente(nombrePaciente);
        p.setEdad(edad);
        p.setDireccion(direccion);
        p.setTelefono(telefono);
        System.out.println("Paciente modificado");
    } else {
        System.out.println("Paciente no encontrado");
    }
}

}
