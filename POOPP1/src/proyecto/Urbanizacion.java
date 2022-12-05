package proyecto;

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

    public void setNom_urb(String nom_urb) {
        this.nom_urb = nom_urb;
    }

    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }

    public void setEmail_urb(String email_urb) {
        this.email_urb = email_urb;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public void setAdmin(TipoEmpleado admin) {
        this.admin = admin;
    }
  

    @Override
    public String toString() {
        return "Urbanizacion{" + "nom_urb=" + nom_urb + ", etapa=" + etapa + ", email_urb=" + email_urb + ", direccion=" + direccion + ", constructora=" + constructora + ", admin=" + admin + '}';
    }
  
}