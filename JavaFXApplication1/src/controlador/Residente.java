/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Krade
 */
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
  //Getters

    public int getMz() {
        return mz;
    }

    public int getVilla() {
        return villa;
    }

    public int getCant_perso() {
        return cant_perso;
    }

    public Urbanizacion getUrbanizacion() {
        return urbanizacion;
    }
  public void setMz(int mz){
        this.mz = mz;
  }

    public void setVilla(int villa) {
        this.villa = villa;
    }

    public void setCant_perso(int cant_perso) {
        this.cant_perso = cant_perso;
    }

    //Setters
    public void setUrbanizacion(Urbanizacion urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    //ToString()
    public String ToString() {
        return super.ToString()+"\nEstado: "+getEstado()+"\nmz : "+mz+"\nVilla: "+villa+"\nCantidad de personas: "+cant_perso+"\nUrbanizacion: "+urbanizacion.getNom_urb();
    }
}
