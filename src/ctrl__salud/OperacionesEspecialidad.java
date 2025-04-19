package ctrl__salud;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author mMJua
 */
public class OperacionesEspecialidad {
    public static ArrayList<Especialidad> ep = new ArrayList();
    // solo por esta parte no utilizo el objeto solo necesito que sea string
    public static void Guardar(Especialidad esp){
    ep.add(esp);
        System.out.println("En efecto se esta guardando: " + esp.getEspacialidad());
    }
    // esta clase no lleva metodo buscar porque directamente en el combox se selecciona y aparecen las especialidades
    
 
}
