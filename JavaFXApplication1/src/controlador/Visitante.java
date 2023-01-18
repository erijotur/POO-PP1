/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Krade
 */
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

    public String getEmpresa() {
        return empresa;
    }

    public boolean isSancion() {
        return sancion;
    }
  public void setEmpresa(String empresa){
        this.empresa = empresa;
  }

    //Setters
    public void setSancion(boolean sancion) {
        this.sancion = sancion;
    }

    //ToString()
    public String ToString() {
        return super.ToString()+"\nEmpresa: "+empresa+"\nSancion: "+sancion;
    }
}
