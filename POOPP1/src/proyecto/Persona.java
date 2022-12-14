package proyecto;

public class Persona{
  protected String nombre;
  protected int cedula;
  protected String email;
  protected int telefono;
  protected boolean estado;

  //Primer constructor
  public Persona(String nombre,int cedula,String email,int telefono,boolean estado){
    this.nombre=nombre;
    this.cedula=cedula;
    this.email=email;
    this.telefono=telefono;
    this.estado=estado;
    }
  //Segundo constructor
  public Persona(String nombre,int cedula,String email,int telefono){
    this.nombre=nombre;
    this.cedula=cedula;
    this.email=email;
    this.telefono=telefono;
    }
  //Getters
  public String getNombre(){
    return nombre;
  }
  public String getEmail(){
    return email;
  }
  public int getTelefono(){
    return telefono;
  }
  public boolean getEstado(){
    return estado;
  }
  //Setters
  public void SetNombre(String nombre){
   this.nombre=nombre;
    }
  public void SetCedula(int cedula){
   this.cedula=cedula;
    }
  public void SetEmail(String email){
    this.email=email;
    }
   public void SetTelefono(int telefono){
     this.telefono=telefono;
   } 
   public void SetEstado(boolean estado){
     this.estado=estado;
     
   }
   
   public int getCedula() {
        return this.cedula;
    }
  //To String()

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", email=" + email + ", telefono=" + telefono + ", estado=" + estado + '}';
    }
  
}
