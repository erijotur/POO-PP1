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
   //Getters
  public String GetEmpresa(){
    return empresa;
  }
  public boolean GetSancion(){
    return sancion;
  }
  //Setters
  public void SetEmpresa(String empresa){
    this.empresa=empresa;
  }
  public void SetSancion(boolean sancion){
    this.sancion=sancion;
  }
  //ToString()
    @Override
    public String toString() {
        return "Visitante{" + "empresa=" + empresa + ", sancion=" + sancion + '}';
    }
  
}
