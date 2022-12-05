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
  public String ToString(){
    return super.ToString()+"\nEmpresa: "+empresa+"\nSancion: "+sancion;
  }
}