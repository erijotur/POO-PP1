/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
/**
 *
 * @author Krade
 */
public class JavaFXApplication1 extends Application {
    public static ArrayList<Residente> res;
    public static ArrayList<Visitante> vis;
    public static ArrayList<Empleado> emp;
    public static ArrayList<Urbanizacion> urb;
    @Override
    public void init(){
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
        System.out.println(urb1.toString());
    }
    //Metodo start
    @Override
    public void start(Stage primaryStage) {
        //Imagen
        GridPane root =  new GridPane();
        //Botones
        Button btn1= new Button("Urbanizacion");
        Button btn2= new Button("Residentes");
        Button btn3= new Button("Visitantes");
        Button btn4= new Button("Colaboradores");
        Button btn5= new Button("Permisos de entrada");
        Button btn6= new Button("Permisos de salida");
        Button btn7= new Button("Reportes");
        Button btn8= new Button("Salir");
        //Lugar del boton
        GridPane.setConstraints(btn1,0,0);
        GridPane.setConstraints(btn2,0,1);
        GridPane.setConstraints(btn3,0,2);
        GridPane.setConstraints(btn4,0,3);
        GridPane.setConstraints(btn5,1,0);
        GridPane.setConstraints(btn6,1,1);
        GridPane.setConstraints(btn7,1,2);
        GridPane.setConstraints(btn8,1,3);
        //Detalles
        
        root.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8);
        root.setHgap(75);
        root.setVgap(45);
        root.setAlignment(Pos.CENTER);
        //Acciones de los botones
        //Boton 1: Urbanizacion
        btn1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                primaryStage.close();
                try {
                    Stage Stage = new Stage();
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(JavaFXApplication1.class.getResource("/vista/Vista1.fxml"));
                    Pane root1 = (Pane) loader.load();
                    Scene scene1 = new Scene(root1);
                             
                    Stage.setTitle("Urbanizacion");
                    Stage.setScene(scene1);
                    Stage.show();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                     }
                 }
            });
        //Boton 2: Residentes
        btn2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
               primaryStage.close();
               try {
                    Stage Stage = new Stage();
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(JavaFXApplication1.class.getResource("/vista/Vista2.fxml"));
                    Pane root2 = (Pane) loader.load();
                    Scene scene2 = new Scene(root2);
                             
                    Stage.setTitle("Residentes");
                    Stage.setScene(scene2);
                    Stage.show();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                     }
                 }              
            });
        //Boton 3: Visitantes
        btn3.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
               primaryStage.close();
               try {
                    Stage Stage = new Stage();
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(JavaFXApplication1.class.getResource("/vista/Vista3.fxml"));
                    Pane root3 = (Pane) loader.load();
                    Scene scene3 = new Scene(root3);
                             
                    Stage.setTitle("Visitantes");
                    Stage.setScene(scene3);
                    Stage.show();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                     }
                 } 
            });
        //Boton 4: Colaboradores
        //Boton 8 : Salir
        btn8.setOnAction(new EventHandler<ActionEvent>(){
        @Override
            public void handle(ActionEvent event){
                primaryStage.close();
            }
        });
            
        //Escena
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("PROYECTO");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
