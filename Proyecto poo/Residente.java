public class Residente extends Persona{
  private int mz;
  private int villa;
  private int cant_perso;
  private Urbanizacion urbanizacion;
//Constructor
  public Residente(String nombre,int cedula,String email,int telefono,boolean estado,int mz,int villa,int cant_perso,Urbanizacion urbanizacion){
    super(nombre,cedula,email,telefono,estado);
    this.mz=mz;
    this.villa=villa;
    this.cant_perso=cant_perso;
    this.urbanizacion=urbanizacion;
  }
  //ToString()
  public String ToString(){
    return super.ToString()+"\nEstado: "+getEstado()+"\nmz : "+mz+"\nVilla: "+villa+"\nCantidad de personas: "+cant_perso+"\nUrbanizacion: "+urbanizacion.getNom_urb();
  }
}