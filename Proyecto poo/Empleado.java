import java.util.Calendar;
public class Empleado extends Persona{
  private String trabajo;
  private TipoEmpleado tipo;
  private Calendar inicio;
  private Calendar fin;
//Constructor
  public Empleado(String nombre,int cedula,String email,int telefono,boolean estado,String trabajo,TipoEmpleado tipo,Calendar inicio,Calendar fin){
    super(nombre,cedula,email,telefono,estado);
    this.trabajo=trabajo;
    this.tipo=tipo;
    this.inicio=inicio;
    this.fin=fin;
  }
  //ToString()
  public String ToString(){
    return super.ToString()+"\nEstado: "+getEstado()+"\nTrabajo: "+trabajo+"\nTipo de Empleado: "+tipo+"\nFecha de inicio: "+inicio.get(Calendar.DAY_OF_MONTH)+"/"+inicio.get(Calendar.MONTH)+"/"+inicio.get(Calendar.YEAR)+"\nFecha fin: "+fin.get(Calendar.DAY_OF_MONTH)+"/"+fin.get(Calendar.MONTH)+"/"+fin.get(Calendar.YEAR);
  }
}
