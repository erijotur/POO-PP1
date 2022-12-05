import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
class Main {

    //Cargar datos
    public static ArrayList<Residente> res;
    public static ArrayList<Visitante> vis;
    public static ArrayList<Empleado> emp;
    public static ArrayList<Urbanizacion> urb;
  public static void main(String[] args) {

    iniciarSistema();
  }
  public static void iniciarSistema(){
    Calendar inicio= new GregorianCalendar(2022,Calendar.JANUARY,15);
  Calendar fin=new GregorianCalendar(2022,Calendar.MARCH,12);
    res=new ArrayList<Residente>();
    vis=new ArrayList<Visitante>();
    emp=new ArrayList<Empleado>();
    urb=new ArrayList<Urbanizacion>();
   Urbanizacion urb1 = new   Urbanizacion("Chespirito",2,"pepe@hotmail.com","Enrique Segoviano","Const",TipoEmpleado.administrador);
    Residente r1 = new Residente("Jose",123,"jose@outlook.com",147,true,1,1,1,urb1);
    Visitante v1 = new Visitante("Alfredo",321,"alfredo@gmail.com",198,"KFC",false);
    Empleado emp1= new Empleado("Carlos",213,"carlos@gmail.com",143,true,"Seguridad",TipoEmpleado.guardia,inicio,fin);
      res.add(r1);
      vis.add(v1);
      emp.add(emp1);
      urb.add(urb1);

    //Bucle principal
    Scanner sc = new Scanner(System.in);
    boolean salir = false;
    int opcion;
    while(!salir){
      System.out.print("1. Urbanización" +"\n2. Residentes" +"\n3. Visitantes"+"\n4. Colaboradores de la urbanización"+"\n5. Permisos de entrada"+"\n6. Revisión de entrada"+"\n7. Reportes" +"\n8. Salir");
      System.out.print("\nA que opcion deseas ingresar: ");
      opcion=sc.nextInt();
      switch(opcion){
        case 1:
          System.out.println("Esta es la opcion 1");
          System.out.println("///////////////////////////////////////////");
          System.out.println("///MOSTRANDO INFORMACION DE URBANIZACION///");
          System.out.println("///////////////////////////////////////////");
          System.out.println();
          System.out.println(urb1.toString());
          System.out.println();
          System.out.println("///////////////////////////////////////////");
          System.out.println("////////////FIN DE INFORMACION/////////////");
          System.out.println("///////////////////////////////////////////");
          System.out.println();
          //Editar
          break;
        case 2:
          System.out.println("Esta es la opcion 2");
          System.out.println("///MOSTRANDO INFORMACION DE RESIDENTES///");
          System.out.println(r1.ToString());
          //Agregar
          //Editar
          //Borrar
          break;
        case 3:
          System.out.println("Esta es la opcion 3");
          System.out.println("///MOSTRANDO INFORMACION DE VISITANTES///");
          System.out.println(v1.ToString());
          //Agregar
          int add_vis;
          System.out.print("Desea agregar Visitantes? (1=Si)");
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
          break;
        case 4:
          System.out.println("Esta es la opcion 4");
          System.out.println("///MOSTRANDO INFORMACION DE EMPLEADOS///");
          System.out.println(emp1.ToString());
          break;
        case 5:
          System.out.println("Esta es la opcion 5");
          System.out.println(res.get(0));
          break;
        case 6:
          System.out.println("Esta es la opcion 6");
          System.out.println(vis.get(0));
          break;
        case 7:
          System.out.println("Esta es la opcion 7");
          System.out.println(emp.get(0));
          break;
        case 8:
          salir=true;
          break;
        default:
          System.out.println("Las opciones son entre 1 y 8");
      }
    }
   }
  }
