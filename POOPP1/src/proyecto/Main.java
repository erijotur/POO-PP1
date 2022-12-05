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
        
        
        //Inicializamos los datos requeridos por el metodo iniciarSistema(), que nos pide una cantidad de usuarios
        
        //Datos de la Urbanizacion
        Urbanizacion urb1 = new Urbanizacion("Chespirito",2,"pepe@hotmail.com","Enrique Segoviano","Const",TipoEmpleado.administrador);
        urb.add(urb1);
        
        //Primer Residente
        Residente residente1 = new Residente("Cecilia", 999, "cecilia@gmail.com", 111, true, 1, 1, 1, urb1.getNom_urb());
        res.add(residente1);
        
        //Primeros Visitantes
        Visitante v1 = new Visitante("Alfredo",321,"alfredo@gmail.com",198,"Ninguna",false);
        Visitante v2 = new Visitante("Carlos",456,"carlos@gmail.com",911,"MCdonalds",false);
        vis.add(v1);
        vis.add(v2);
        
        //2 Guardias
        Empleado emp1= new Empleado("Mike",852,"mike@gmail.com",777,true,"Seguridad",TipoEmpleado.guardia,inicio,fin);
        Empleado emp2= new Empleado("Joana",753,"joana@gmail.com",666,true,"Seguridad",TipoEmpleado.guardia,inicio,fin);
        emp.add(emp1);
        emp.add(emp2);
        
        //Permisos de entrada asociados al primer residente
        Entrada ent1 = new Entrada(999, 321, 31, 12, 2022, 22, 0, 60);
        Entrada ent2 = new Entrada(999, 456, 5, 11, 2022, 13, 30, 5);
        perm.add(ent1);
        perm.add(ent2);
        
        //Bucle principal
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while(!salir){
            
          //Mensaje de Ingreso al Menu Principal
          System.out.println("--------------------//////////////MENU PRINCIPAL///////////////--------------------");
          System.out.println();
          System.out.print("1. Urbanización" +"\n2. Residentes" +"\n3. Visitantes"+"\n4. Colaboradores de la Urbanizacion"+
                            "\n5. Permisos de Entrada"+"\n6. Revisión de Entrada"+"\n7. Reportes" +"\n8. Salir");
          System.out.println("A que opcion deseas ingresar: ");
          opcion=sc.nextInt();
          
          switch(opcion){
              
            //Urbanizacion
            case 1:
              //Mensaje de Ingreso a la Opcion 1 Datos y Edicion de urbanizacion
              System.out.println("Esta es la opcion 1");
              System.out.println("--------------------///MOSTRANDO INFORMACION DE URBANIZACION///--------------------");
              System.out.println();
              System.out.println(urb1.toString());
              System.out.println();
              System.out.println("--------------------////////////FIN DE INFORMACION/////////////--------------------");
              System.out.println();
              //Editar Urbanizacion
              System.out.println("--------------------////Editar La Urbanizacion////--------------------");
              System.out.println();
              Scanner eurb = new Scanner(System.in);
              System.out.println("Que variable de la Urbanizacion desea editar? \n 1.nombre \n 2.etapa \n 3.email \n 4.direccion \n 5.constructora "
                                   +"\n 6.Cancelar \n SU OPCION:");
              int opcion12=eurb.nextInt();
              switch(opcion12){
                  
                  case 1:
                      Scanner eurb11 = new Scanner(System.in);
                      System.out.println("Ingrese el nuevo nombre de la Urbanizacion: ");
                      String nnombu = eurb11.nextLine();
                      urb1.setNom_urb(nnombu);
                      break;
                  case 2:
                      Scanner eurb12= new Scanner(System.in);
                      System.out.println("Ingrese la nueva etapa de la Urbanizacion: ");
                      int netap = eurb12.nextInt();
                      urb1.setEtapa(netap);
                      break;
                  case 3:
                      Scanner eurb13= new Scanner(System.in);
                      System.out.println("Ingrese el nuevo Email de la Urbanizacion: ");
                      String nemu = eurb13.nextLine();
                      urb1.setEmail_urb(nemu);
                     break;
                  case 4:
                      Scanner eurb14= new Scanner(System.in);
                      System.out.println("Ingrese la nueva drieccion de la Urbanizacion: ");
                      String direu = eurb14.nextLine();
                      urb1.setDireccion(direu);
                      break;
                  case 5:
                      Scanner eurb15= new Scanner(System.in);
                      System.out.println("Ingrese la nueva constructora de la Urbanizacion: ");
                      String consu = eurb15.nextLine();
                      urb1.setConstructora(consu);
                      break;
                  case 6:
                      System.out.println("Cancelando la edicion de de la Urbanizacion");
                      break;
                  default:
                      System.out.println("Las opciones son entre 1 y 6");
                }
              break;
            
            //Ingreso a Residentes
            case 2:
              Scanner pc2 = new Scanner(System.in);
              int opcion2;
              boolean exit2=false;
              while(!exit2){
                  //Mensaje de Ingreso a la Opcion de Residentes
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
                      
                      //Agregar Residente
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
              
            //Ingreso a Visitantes
            case 3:
              System.out.println("Esta es la opcion 3");
              System.out.println("----------------///////MOSTRANDO INFORMACION DE VISITANTES///////-------------------");
              System.out.println(vis);
              System.out.println("--------------------////////////FIN DE INFORMACION/////////////--------------------");
              //Agregar Visitantes
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
              //Editar Visitantes
              System.out.print("Desea editar Residentes?(1=Si): ");
              int edt_vis=sc.nextInt();
              if (edt_vis == 1){
                System.out.print("Cuantos residentes desea editar?: ");
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
              System.out.println("--------------///////////MOSTRANDO INFORMACION DE EMPLEADOS//////////--------------");
              System.out.println(emp);
              System.out.println("--------------------////////////FIN DE INFORMACION/////////////--------------------");
              System.out.println("");
              break;
              
            //Permisos de Entrada
            case 5:
                //Mensajes de Ingreo a PErmisos de Entrada y Logica
              Scanner perm5 = new Scanner(System.in);
              boolean exit5 = false;
              int opcion5;
              while(!exit5){
                System.out.println("Esta es la opcion 5");
                System.out.println("--------------------////Permisos de Entrada Dsiponibles////--------------------");
                System.out.println();
                System.out.println(perm);
                System.out.println();
                System.out.println("--------------------////////////FIN DE INFORMACION/////////////--------------------");
                System.out.println();
                System.out.println("1.Crear Permiso de Entrada \n2.Eliminar Permiso de Entrada \n3.Consultar Permisos por Manzana y Villa \n4.Atras");
                System.out.println("");
                System.out.println("Ingrese la Accion que desea Realizar: ");
                opcion5 = perm5.nextInt();
                switch(opcion5){
                    // Crear permisos de entrada
                    case 1:
                        System.out.println();
                        System.out.println("--------------------////Crear Permisos de Entrada////--------------------");
                        System.out.println();
                        System.out.println("Ingrese Los Valores Requeridos con representacions de fecha numericas");
                        System.out.println();

                        Scanner perment = new Scanner(System.in);
                        
                        System.out.println("Identificacion del residente que crea el permiso de entrada: ");
                        int resemisor = perment.nextInt();
                        
                        System.out.println("Identificacion del visitante: ");
                        int visitcp = perment.nextInt();
                        
                        System.out.println("Ingrese el dia en el que el visitante llega: ");
                        int diaIngreso = perment.nextInt();

                        System.out.println("Ingrese el mes en el que el visitante llega: ");
                        int mesIngreso = perment.nextInt();

                        System.out.println("Ingrese el anio en el que el visitante llega: ");
                        int anioIngreso = perment.nextInt();

                        System.out.println("Ingrese la hora en el que el visitante llega: ");
                        int horaIngreso = perment.nextInt();

                        System.out.println("Ingrese los minutos en el que el visitante llega: ");
                        int minutoIngreso = perment.nextInt();

                        System.out.println("Ingrese el tiempo de estadia en minutos del visitante : ");
                        int duracionVisita = perment.nextInt();
                        
                        perm.add(new Entrada(resemisor,visitcp,diaIngreso,mesIngreso,anioIngreso,horaIngreso,minutoIngreso,duracionVisita));
                        break;
                        
                    //Eliminar Permisos de entrada validando el numero de cedula del residente que lo creo
                    case 2:
                        Scanner permisos = new Scanner(System.in);
                        System.out.println("Ingrese el numero de cedula del Residente del que quiere consultar y modificar sus permisos: ");
                        int ced = permisos.nextInt();
                        for(Residente residente:res){
                            if (residente.cedula==ced) {
                                for(Entrada permiso :perm){
                                    if (permiso.getResemisor()==ced) {
                                        System.out.println("----Permiso emitido por el Residente Consultado----");
                                        System.out.println("");
                                        System.out.println(permiso);
                                        System.out.println("");
                                        System.out.println("---------------------------------------------------");
                                        Scanner numper = new Scanner(System.in);
                                        System.out.println("Desea eliminar este permiso? (1: SI, 2: NO) ");
                                        int x = numper.nextInt();
                                        switch(x){
                                        case 1:
                                            permiso.setTipoPermiso(Permiso.inactivo);
                                            break;
                                        case 2:
                                            System.out.println("--Pasando al Siguiente Permiso--");
                                            break;
                                        default:
                                            System.out.println("Las opciones son entre 1 y 2");
                                        }
                                    }
                                    else
                                        System.out.println("No hay permisos para el Residente ingresado");
                                }
                                
                            }
                            else
                                System.out.println("No hay ningun residente registrado con ese numero de cedula");
                        }

                        break;
                    //Busqueda de permisos de entrada con los parametros de Manzana y Villa
                    case 3:
                        Scanner cmzvll = new Scanner(System.in);

                        System.out.println("Ingrese la Manzana del residente: ");
                        int consulmzv = cmzvll.nextInt();

                        System.out.println("Ingrese la Villa del residente: ");
                        int consulvll = cmzvll.nextInt();
                        
                        for(Residente residente:res){
                            if (residente.getMz()==consulmzv && residente.getVilla()==consulvll){
                                int cedulaAsociada = residente.getCedula();
                                for(Entrada permiso :perm){
                                    if (permiso.getResemisor()==cedulaAsociada) {
                                        System.out.println("----Permiso emitido por el Residente Consultado por Manzana: "+consulmzv+ " y Villa: "+consulvll+"----");
                                        System.out.println("");
                                        System.out.println(permiso);
                                        System.out.println("");
                                        System.out.println("-----------------------------------------------------------------------");
                                        Scanner numper = new Scanner(System.in);
                                        System.out.println("Continuar mostrando permisos encontrados? (1: SI, 2: NO) ");
                                        int x = numper.nextInt();
                                        switch(x){
                                        case 1:
                                            System.out.println("--Pasando al Siguiente Permiso--");
                                            break;
                                        case 2:
                                            break;
                                        default:
                                            System.out.println("Las opciones son entre 1 y 2");
                                        }
                                    }
                                    else
                                        System.out.println("----ATENCION!: No hay permisos para los datos del Residente ingresado----");
                                }
                                
                            }
                            else
                                System.out.println("---- ATENCION! : No hay ningun residente registrado con los Datos Presentados----");
                        }
                        break;
                    case 4:
                        System.out.println("Cancelando la Creacion de Permisos");
                        exit5=true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 4");
                }                   
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
              Scanner reporte = new Scanner(System.in);
              System.out.println("Ingrese el numero de cedula del Residente del que quiere realizar la consulta: ");
              int cedRes = reporte.nextInt();
              for(Residente residente:res){
                  if (residente.cedula==cedRes) {
                      for(Entrada permiso :perm){
                          if (permiso.getResemisor()==cedRes) {
                              System.out.println("-----////Permiso emitido por el Residente Consultado////-----");
                              System.out.println("");
                              System.out.println(permiso);
                              System.out.println("");
                              System.out.println("-------------------------------------------------------------");
                          }
                          else
                              System.out.println("No hay permisos para el Residente ingresado");
                      }
                      
                  }
                  else
                      System.out.println("No hay ningun residente registrado con ese numero de cedula");
                        }
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
