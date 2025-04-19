package ctrl__salud;

/**
 *
 * @author mMJua
 */
public class Paciente {
   public int idPaciente;
   public String nombrePaciente;
   public int edad;
   public String direccion;
   public int telefono;

        public Paciente(String nombrePaciente, int edad, String direccion, int telefono) {
        this.nombrePaciente = nombrePaciente;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
   
}
