package proyecto;

public class Visitante extends Persona{
  private String empresa;
  private boolean sancion;
//Constructor
  public Visitante(String nombre,int cedula,String email,int telefono,String empresa,boolean sancion){
    super(nombre,cedula,email,telefono);
    this.empresa=empresa;
    this.sancion=sancion;
    
  
    
  }
  //ToString()

    public String getEmpresa() {
        return empresa;
    }

    public boolean isSancion() {
        return sancion;
    }

    @Override
    public String toString() {
        return "Visitante{" + "empresa=" + empresa + ", sancion=" + sancion + '}';
    }
  
}