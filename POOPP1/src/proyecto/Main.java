package proyecto;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;



class Main {

    //Cargar datos
    public static ArrayList<Residente> res = new ArrayList<>();
    public static ArrayList<Visitante> vis = new ArrayList<>();
    public static ArrayList<Empleado> emp = new ArrayList<>();
    public static ArrayList<Urbanizacion> urb = new ArrayList<>();
    public static ArrayList<Entrada> perm = new ArrayList<>();
    
    public static void main(String[] args) {
    iniciarSistema();
    }
    
    public static void iniciarSistema(){
        Calendar inicio= new GregorianCalendar(2022,Calendar.JANUARY,15);
        Calendar fin=new GregorianCalendar(2022,Calendar.MARCH,12);
        
        Urbanizacion urb1 = new   Urbanizacion("Chespirito",2,"pepe@hotmail.com","Enrique Segoviano","Const",TipoEmpleado.administrador);
        Visitante v1 = new Visitante("Alfredo",321,"alfredo@gmail.com",198,"KFC",false);
        Empleado emp1= new Empleado("Carlos",213,"carlos@gmail.com",143,true,"Seguridad",TipoEmpleado.guardia,inicio,fin);
          vis.add(v1);
          emp.add(emp1);
          urb.add(urb1);

        //Bucle principal
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while(!salir){
            
          //Mensaje de Ingreso al Menu Principal
          System.out.println("--------------------//////////////MENU PRINCIPAL///////////////--------------------");
          System.out.println();
          System.out.print("1. Urbanización" +"\n2. Residentes" +"\n3. Visitantes"+"\n4. Colaboradores de la Urbanización"+
                            "\n5. Permisos de Entrada"+"\n6. Revisión de Entrada"+"\n7. Reportes" +"\n8. Salir");
          System.out.println("A que opcion deseas ingresar: ");
          opcion=sc.nextInt();
          
          switch(opcion){
              
            //Urbanizacion
            case 1:
              //Mensaje de Ingreso a la Opcion 1
              System.out.println("Esta es la opcion 1");
              System.out.println("--------------------///MOSTRANDO INFORMACION DE URBANIZACION///--------------------");
              System.out.println();
              System.out.println(urb1.toString());
              System.out.println();
              System.out.println("--------------------////////////FIN DE INFORMACION/////////////--------------------");
              System.out.println();
              //Editar
              System.out.print("Desea editar la Urbanizacion?(1=Si): ");
              int edt_urb=sc.nextInt();
              if (edt_urb == 1){
                System.out.print("Cuantas Urbanizaciones desea editar?: ");
                int nu_urb = sc.nextInt();
                for (int j=1;j<nu_urb+1;j++){
                 System.out.print("Ingrese la etapa: ");
                 int localizar = sc.nextInt();
                   for (int k =0;k<urb.size();k++){
                      if (localizar == urb.get(k).getEtapa()){
                        System.out.print("Ingrese el nuevo nombre de la Urbanizacion: ");
                        sc.nextLine();
                        String no_urb = sc.nextLine();
                        urb.get(k).SetNom_urb(no_urb);
                        System.out.print("Ingrese el email de la Urbanizacion: ");
                        String ema_urb = sc.nextLine();
                        urb.get(k).SetEmailU(ema_urb);
                        System.out.print("Ingrese la nueva direccion de la Urbanizacion: ");
                        String direc_urb = sc.nextLine();
                        urb.get(k).SetDireccionU(direc_urb);
                        System.out.print("Ingrese la nueva constructora: ");
                        String const_urb = sc.nextLine();
                        urb.get(k).SetConstructora(const_urb);
                      } else {
                  System.out.println("No se encontro a la Urbanizacion "+k);
                }
              }
            }
          }
              break;
            
            //Residentes
            case 2:
              Scanner pc2 = new Scanner(System.in);
              int opcion2;
              boolean exit2=false;
              while(!exit2){
                  //Mensaje de Ingreso a la Opcion 2
                  System.out.println();
                  System.out.println("Esta es la opcion 2");
                  System.out.println();
                  System.out.println("--------------------////MOSTRANDO INFORMACION DE RESIDENTES////--------------------");
                  System.out.println(res);
                  System.out.println("--------------------////////////FIN DE INFORMACION/////////////--------------------");
                  System.out.println();
                  System.out.print("1.Agregar Residente" +"\n2.Editar Residente" +"\n3.Inhabilitar Residente"+"\n4.Atras");
                  System.out.print("\n¿QUE ACCION DESEA REALIZAR? : ");
                  opcion2 = pc2.nextInt();
                  switch(opcion2){
                      
                      //Agregar
                      case 1:
                          //Mensaje de Ingreso para agregar nuevo Residente
                          System.out.println("--------------------////Agregar Nuevo Residente////--------------------");
                          System.out.println();
                          
                          Scanner nresi = new Scanner(System.in);
                          
                          System.out.println("Ingrese el nombre del nuevo residente: ");
                          String nombre = nresi.nextLine();
                          
                          System.out.println("Ingrese la cedula del nuevo residente: ");
                          int cedula = nresi.nextInt();
                          
                          System.out.println("Ingrese el Email del nuevo residente: ");
                          nresi.nextLine();
                          String email = nresi.nextLine();
                          
                          System.out.println("Ingrese el telefono del nuevo residente: ");
                          int telefono = nresi.nextInt();
                          
                          System.out.println("Ingrese la manzana del nuevo residente: ");
                          int mz = nresi.nextInt();
                          
                          System.out.println("Ingrese la villa del nuevo residente: ");
                          int villa = nresi.nextInt();
                          
                          System.out.println("Ingrese la cantidad de personas que habitan con el nuevo residente: ");
                          int cantp = nresi.nextInt();
                          
                          res.add(new Residente(nombre,cedula,email,telefono,true,mz,villa,cantp,urb1.getNom_urb()));
                          break;
                          
                      //Editar    
                      case 2:
                          //Mensaje de Ingreso para Editar un Residente
                          System.out.println("--------------------////Editar un Residente////--------------------");
                          System.out.println();
                          Scanner eresi = new Scanner(System.in);
                          System.out.println("Ingrese el Numero del residente que desea Editar: ");
                          int numresi = eresi.nextInt();
                          System.out.println("Este es el Residente que desea Editar: "+res.get(numresi-1));
                          System.out.println("Que variable del residente desea editar? \n 1.nombre \n 2.cedula \n 3.email \n 4.telefono \n 5.manzana "
                                               + "\n 6.villa \n 7.cant de personoas \n 8.Cancelar \n SU OPCION:");
                          int opcion22=eresi.nextInt();
                          switch(opcion22){
                              
                              case 1:
                                  Scanner eresi21 = new Scanner(System.in);
                                  System.out.println("Ingrese el nuevo nombre del Residente: ");
                                  String nnomb = eresi21.nextLine();
                                  res.get(numresi-1).SetNombre(nnomb);
                                  break;
                              case 2:
                                  Scanner eresi22= new Scanner(System.in);
                                  System.out.println("Ingrese la nueva cedula del Residente: ");
                                  int nced = eresi22.nextInt();
                                  res.get(numresi-1).SetCedula(nced);
                                  break;
                              case 3:
                                  Scanner eresi23= new Scanner(System.in);
                                  System.out.println("Ingrese el nuevo Email del Residente: ");
                                  String nem = eresi23.nextLine();
                                  res.get(numresi-1).SetEmail(nem);
                                  break;
                              case 4:
                                  Scanner eresi24= new Scanner(System.in);
                                  System.out.println("Ingrese el nuevo telefono del Residente: ");
                                  int ntel = eresi24.nextInt();
                                  res.get(numresi-1).SetTelefono(ntel);
                                  break;
                              case 5:
                                  Scanner eresi25= new Scanner(System.in);
                                  System.out.println("Ingrese la nueva manzana donde habita el Residente: ");
                                  int nmz = eresi25.nextInt();
                                  res.get(numresi-1).setMz(nmz);
                                  break;
                              case 6:
                                  Scanner eresi26= new Scanner(System.in);
                                  System.out.println("Ingrese la nueva villa donde habita el Residente: ");
                                  int nvill = eresi26.nextInt();
                                  res.get(numresi-1).setVilla(nvill);
                                  break;
                              case 7:
                                  Scanner eresi27= new Scanner(System.in);
                                  System.out.println("Ingrese la nueva cantidad de personas que habitan con el Residente: ");
                                  int ncper = eresi27.nextInt();
                                  res.get(numresi-1).setCant_perso(ncper);
                                  break;
                              case 8:
                                  System.out.println("Cancelando la edicion de Residente");
                                  break;
                              default:
                                  System.out.println("Las opciones son entre 1 y 8");
                          }
                          break;
                      //Borrar    
                      case 3:
                          //Mensaje de Ingreso para Inhabilitar un Residente
                          System.out.println("--------------------////Inhabilitar un Residente////--------------------");
                          System.out.println();
                          Scanner inhres = new Scanner(System.in);
                          System.out.println("Ingrese el Numero del residente que desea Inhabilitar: ");
                          int numresi2 = inhres.nextInt();
                          System.out.println("Este es el Residente que desea Inhabilitar: "+res.get(numresi2-1));
                          System.out.println("Esta seguro que Desea Inhabilitar al Residente? \n 1.Continuar \n 2.Cancelar");
                          int opcion23=inhres.nextInt();
                          switch(opcion23){
                              case 1:
                                  res.get(numresi2-1).setEstado(false);
                                  break;
                              case 2:
                                  System.out.println("Cancelando la Inhabilitacion del Residente");
                                  break;
                              default:
                                  System.out.println("Las opciones son entre 1 y 2");
                          }
                                  
                          break;
                          
                      case 4:
                          exit2=true;
                          break;
                      default:
                          System.out.println("Las opciones son entre 1 y 4");
                  }
              }
              break;
              
            //Visitantes
            case 3:
              System.out.println("Esta es la opcion 3");
              System.out.println("///MOSTRANDO INFORMACION DE VISITANTES///");
              System.out.println(v1);
              //Agregar
              int add_vis;
          System.out.print("Desea agregar Visitantes? (1=Si): ");
          add_vis=sc.nextInt();
          if (add_vis == 1){ 
            System.out.print("Cuantos visitantes desea ingresar?: ");
            int num_vis = sc.nextInt();
            for (int i=1;i<num_vis+1;i++){
              System.out.print("Digite la cedula: ");
              int ced_vis=sc.nextInt();
              System.out.print("Digite el nombre: ");
              sc.nextLine();
              String nomb_vis=sc.nextLine();
              System.out.print("Digite el email: ");
              String emai_vis=sc.nextLine();
              System.out.print("Digite el telefono: ");
              int tel_vis=sc.nextInt();
              System.out.print("Digite si tiene sancion(true/false): ");
              boolean san_vis=sc.nextBoolean();
              System.out.print("Digite la empresa: ");
              sc.nextLine();
              String emp_vis=sc.nextLine();
              Visitante r = new Visitante(nomb_vis,ced_vis,emai_vis,tel_vis,emp_vis,san_vis);
              vis.add(r);
              System.out.println(vis.size());
            }
          }
              //Editar
              System.out.print("Desea editar Visitantes?(1=Si): ");
          int edt_vis=sc.nextInt();
          if (edt_vis == 1){
            System.out.print("Cuantos visitantes desea editar?: ");
            int nu_vis = sc.nextInt();
            for (int j=1;j<nu_vis+1;j++){
              System.out.print("Ingrese la cedula: ");
              int busqueda = sc.nextInt();
              for (int k =0;k<vis.size();k++){
                if (busqueda == vis.get(k).getCedula()){
                  System.out.print("Ingrese el nuevo nombre del Visitante: ");
                  sc.nextLine();
                  String nom_vis = sc.nextLine();
                  vis.get(k).SetNombre(nom_vis);
                  System.out.print("Ingrese el nuevo email del Visitante: ");
                  String ema_vis = sc.nextLine();
                  vis.get(k).SetEmail(ema_vis);
                  System.out.print("Ingrese el nuevo telefono del Visitante: ");
                  int telf_vis = sc.nextInt();
                  vis.get(k).SetTelefono(telf_vis);
                  System.out.print("Ingrese si tiene sancion: ");
                  boolean sa_vis = sc.nextBoolean();
                  vis.get(k).SetSancion(sa_vis);
                  System.out.print("Ingrese la empresa del Visitante: ");
                  sc.nextLine();
                  String em_vis = sc.nextLine();
                  vis.get(k).SetEmail(em_vis); 
                  } else {
                  System.out.println("No se encontro a la persona en posicion: "+k);
                }
              }
            }
          }
              break;
              
            //Colaboradores de la Urbanización
            case 4:
              System.out.println("Esta es la opcion 4");
              System.out.println("///MOSTRANDO INFORMACION DE EMPLEADOS///");
              System.out.println(emp1);
              break;
              
            //Permisos de Entrada
            case 5:
              System.out.println("Esta es la opcion 5");
              System.out.println("--------------------////Permisos de Entrada////--------------------");
              System.out.println();
              Scanner perm = new Scanner(System.in);
              System.out.println("1.Crear Permiso de Entrada \n2.Eliminar Permiso de Entrada \n3.Consultar Permisos por Manzana y Villa \n4.Atras");
              System.out.println("");
              System.out.println("Ingrese la Accion que desea Realizar: ");
              int opc5 = perm.nextInt();
              switch(opc5){
                  case 1:
                      

                      break;
                  case 2:
                      
                      break;
                  case 3:
                      
                      break;
                  case 4:
                      System.out.println("Cancelando la Creacion de Permisos");
                      break;
                  default:
                      System.out.println("Las opciones son entre 1 y 4");
                      
              }
              break;
              
            //Revisión de Entrada
            case 6:
              System.out.println("Esta es la opcion 6");
              System.out.println(vis.get(0));
              break;
            
            //Reportes
            case 7:
              System.out.println("Esta es la opcion 7");
              System.out.println(emp.get(0));
              break;
              
            //Salir
            case 8:
              salir=true;
              break;
            default:
              System.out.println("Las opciones son entre 1 y 8");
          }
    }
   }
  }
