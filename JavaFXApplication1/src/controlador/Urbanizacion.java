/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Krade
 */
import java.util.Objects;
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

    public String getNom_urb() {
        return nom_urb;
    }

    public int getEtapa() {
        return etapa;
    }

    public String getEmail_urb() {
        return email_urb;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getConstructora() {
        return constructora;
    }

    public TipoEmpleado getAdmin() {
        return admin;
    }
  
  //Setters
  public void SetNom_urb(String nom_urb){
    this.nom_urb=nom_urb;
  }
  public void SetEtapa(int etapa){
    this.etapa=etapa;
  }
  public void SetEmailU(String email_urb){
    this.email_urb=email_urb;
  }
  public void SetDireccionU(String direccion){
    this.direccion=direccion;
  }
  public void SetConstructora(String constructora){
    this.constructora=constructora;
  }
  public void setAdmin(TipoEmpleado admin) {
    this.admin = admin;
   }
  
  //Equals

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Urbanizacion other = (Urbanizacion) obj;
        if (this.etapa != other.etapa) {
            return false;
        }
        if (!Objects.equals(this.nom_urb, other.nom_urb)) {
            return false;
        }
        if (!Objects.equals(this.email_urb, other.email_urb)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.constructora, other.constructora)) {
            return false;
        }
        return this.admin == other.admin;
    }
  
  
  //ToString()
  public String toString(){
    return "Nombre de Urbanizacion: "+nom_urb+"\nEtapa: "+etapa+"\nEmai de urbanizacion: "+email_urb+"\nDireccion: "+direccion+"\nConstructora: "+constructora+"\nAdministrador: "+admin;
  }
}
