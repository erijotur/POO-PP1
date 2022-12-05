package proyecto;

import java.util.Calendar;
    
public class Entrada {
    private Calendar calendario=Calendar.getInstance();
    
    private int diaCreacion;
    private int mesCreacion;
    private int anioCreacion;
    private int horaCreacion;
    private int minutoCreacion;
    private int resemisor;
    private int visitcp;
    private int diaIngreso;
    private int mesIngreso;
    private int anioIngreso;
    private int horaIngreso;
    private int minutoIngreso;
    private int duracionVisita;
    private String codigoEntrada;
    private Permiso tipoPermiso;

    
    public Entrada(int resemisor, int visitcp, int diaIngreso, int mesIngreso, 
                   int anioIngreso, int horaIngreso, int minutoIngreso, int duracionVisita) {
        this.diaCreacion = calendario.get(Calendar.DATE);
        this.mesCreacion = calendario.get(Calendar.MONTH);
        this.anioCreacion = calendario.get(Calendar.YEAR);
        this.horaCreacion = calendario.get(Calendar.HOUR_OF_DAY);
        this.minutoCreacion = calendario.get(Calendar.MINUTE);
        this.resemisor = resemisor;
        this.codigoEntrada = resemisor+""+diaCreacion+""+diaIngreso+""+anioCreacion;
        this.visitcp = visitcp;
        this.diaIngreso = diaIngreso;
        this.mesIngreso = mesIngreso;
        this.anioIngreso = anioIngreso;
        this.horaIngreso = horaIngreso;
        this.minutoIngreso = minutoIngreso;
        this.duracionVisita = duracionVisita;
        this.tipoPermiso = Permiso.activo;
    }

    public void setTipoPermiso(Permiso tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }
     
    public int getResemisor() {
        return resemisor;
    }
    

    @Override
    public String toString() {
        return "Permisos de Entrada{" + ", Fecha de Creacion = " + diaCreacion + "/" + mesCreacion + "/" + anioCreacion + 
                                    ", Hora de Creacion = " + horaCreacion + "hrs:" + minutoCreacion + "min, Cedula de Residente=" + 
                                    resemisor + ", Cedula de Visistante=" + visitcp + ", \nFecha de Ingreso = " + diaIngreso + "/" + mesIngreso + 
                                    "/" + anioIngreso + ", Hora Estimada de Ingreso = " + horaIngreso + "hrs:" + minutoIngreso + 
                                    "min, duracionVisita=" + duracionVisita + ", codigoEntrada=" + codigoEntrada + ", tipoPermiso=" + tipoPermiso + "}\n\n";
    }
    
}