public class Urbanizacion{
  private String nom_urb;
  private int etapa;
  private String email_urb;
  private String direccion;
  private String constructora;
  private TipoEmpleado admin;
  //Constructor
  public Urbanizacion(String nomb_urb,int etapa,String email_urb,String direccion,String constructora,TipoEmpleado admin){
    this.nom_urb=nomb_urb;
    this.etapa=etapa;
    this.email_urb=email_urb;
    this.direccion=direccion;
    this.constructora=constructora;
    this.admin=admin;
  }
  //Getters
  public String getNom_urb(){
    return nom_urb;
  }
  //Setters
  public void SetNom_urb(String nom_urb){
    this.nom_urb=nom_urb;
  }
  //ToString()
  public String toString(){
    return "Nombre de Urbanizacion: "+nom_urb+"\nEtapa: "+etapa+"\nEmai de urbanizacion: "+email_urb+"\nDireccion: "+direccion+"\nConstructora: "+constructora+"\nAdministrador: "+admin;
  }
}
