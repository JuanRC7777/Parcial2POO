package ctrl__salud;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author mMJua
 */
public class OperacionesMedico {
    public static ArrayList<Medico> md = new ArrayList();
    
    public static void Guardar(Medico med){
        md.add(med);
    }
    public static Medico buscar(int cedula){
        for(Medico p : md){
            if(p.getIdMedico()== cedula){
                System.out.println("encontrado");
                return p;
            }
        }
        return null;
    }
    public static void modificar(int idMedico, String nombremedico, int especialidad) {
    Medico p = buscar(idMedico); // busca al nmedico por cedula
    if (p != null) {
        p.setIdEspecialidad(especialidad);
        p.setIdMedico(idMedico);
        p.setMedico(nombremedico);
        System.out.println("medico modificado");
    } else {
        System.out.println("medico no encontrado");
    }
}
}
