package proyecto;

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

    @Override
    public String toString() {
        return "\nEmpleado{ Nombre= "+ super.nombre + ", Cedula= "+ super.cedula + ", Email= "+ super.email + 
                "\n, Telefono= "+ super.telefono + ", Estado= "+ super.estado+ "trabajo= " + trabajo + ", tipo= " + tipo + 
                "\n, inicio= " + inicio + ", fin= " + fin + '}';
    }
  
  
}
