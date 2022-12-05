package proyecto;

public class Residente extends Persona{
  private int mz;
  private int villa;
  private int cant_perso;
  private String urbanizacion;
  private static int contador;
  private int numero;
  
  
//Constructor
  public Residente(String nombre,int cedula,String email,int telefono,boolean estado,int mz,int villa,int cant_perso,String urbanizacion){
    super(nombre,cedula,email,telefono,estado);
    contador++;
    this.numero=contador;
    this.mz=mz;
    this.villa=villa;
    this.cant_perso=cant_perso;
    this.urbanizacion=urbanizacion;
  }
  //ToString()

    @Override
    public String toString() {
        return "Residente "+numero+"{" + " Nombre="+ super.nombre + ", Cedula="+ super.cedula + ", Email="+ super.email + 
                ", Telefono="+ super.telefono + ", Estado="+ super.estado + ", mz=" + mz + ", villa=" + villa + 
                ", cant_perso=" + cant_perso + ", urbanizacion=" + urbanizacion + '}' +"\n";
    }

    public void setMz(int mz) {
        this.mz = mz;
    }

    public void setVilla(int villa) {
        this.villa = villa;
    }

    public void setCant_perso(int cant_perso) {
        this.cant_perso = cant_perso;
    }

    public void setUrbanizacion(String urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public void setNombre(String nombre) {
        super.nombre = nombre;
    }

    public void setCedula(int cedula) {
        super.cedula = cedula;
    }

    public void setEmail(String email) {
        super.email = email;
    }

    public void setTelefono(int telefono) {
        super.telefono = telefono;
    }

    public void setEstado(boolean estado) {
        super.estado = estado;
    }

    public int getNumero() {
        return numero;
    }
    
    
    
  
}