package proyecto;

import java.util.Calendar;
    
public class Entrada {
    private Calendar calendario=Calendar.getInstance();
    private int diaCreacion;
    private int mesCreacion;
    private int anioCreacion;
    private int horaCreacion;
    private int minutoCreacion;
    private String codigoEntrada;
    private Residente resemisor;
    private Visitante visitcp;
    private int diaIngreso;
    private int mesIngreso;
    private int anioIngreso;
    private int horaIngreso;
    private int minutoIngreso;
    private int duracionVisita;
    private Permiso tipoPermiso;

    public Entrada(String codigoEntrada, Residente resemisor, Visitante visitcp, int diaIngreso, int mesIngreso, int anioIngreso, int horaIngreso, int minutoIngreso, int duracionVisita, Permiso tipoPermiso) {
        this.diaCreacion = calendario.get(Calendar.DATE);
        this.mesCreacion = calendario.get(Calendar.MONTH);
        this.anioCreacion = calendario.get(Calendar.YEAR);
        this.horaCreacion = calendario.get(Calendar.HOUR_OF_DAY);
        this.minutoCreacion = calendario.get(Calendar.MINUTE);
        this.codigoEntrada = codigoEntrada;
        this.resemisor = resemisor;
        this.visitcp = visitcp;
        this.diaIngreso = diaIngreso;
        this.mesIngreso = mesIngreso;
        this.anioIngreso = anioIngreso;
        this.horaIngreso = horaIngreso;
        this.minutoIngreso = minutoIngreso;
        this.duracionVisita = duracionVisita;
        this.tipoPermiso = tipoPermiso;
    }
    
    
    
    public void generarCodigo(int numero,String nombreurb){
        this.codigoEntrada=numero+""+nombreurb;
    }
    
    public void eliminarPermiso(){
        
    }
}
    
