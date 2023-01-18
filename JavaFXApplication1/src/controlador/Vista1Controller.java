/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Krade
 */
public class Vista1Controller implements Initializable {

    @FXML
    private Button btnadd;
    @FXML
    private Button btnedit;
    @FXML
    private Button btnborrar;
    @FXML
    private TableView<Urbanizacion> tblUrb;
    private TableColumn<Urbanizacion,String> colNom_urb;
    private TableColumn<Urbanizacion, Integer> colEtapa;
    private TableColumn<Urbanizacion, Integer> colEmail_urb;
    private TableColumn<Urbanizacion, Integer> colDireccion;
    private TableColumn<Urbanizacion, Integer> colConstructora;
    private TableColumn<Urbanizacion, TipoEmpleado> colAdmin;

    
    ObservableList<Urbanizacion> urbanizacion = FXCollections.observableArrayList(
            
       new Urbanizacion("Chespirito",2,"pepe@hotmail.com","Enrique Segoviano","Const",TipoEmpleado.administrador),
       new Urbanizacion("Milagro",1,"mil@hotmail.com","Las Peñas","Const",TipoEmpleado.administrador),
       new Urbanizacion("Transilvania",5,"vania@hotmail.com","Hotel Trivago","Const",TipoEmpleado.administrador)
                    
    );
    @FXML
    private TableColumn<Urbanizacion,String > nom_urb;
    @FXML
    private TableColumn<Urbanizacion,Integer > etapa;
    @FXML
    private TableColumn<Urbanizacion,Integer> email_urb;
    @FXML
    private TableColumn<Urbanizacion,Integer> direccion;
    @FXML
    private TableColumn<Urbanizacion,Integer> constructora;
    @FXML
    private TableColumn<Urbanizacion,TipoEmpleado> admin;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nom_urb.setCellValueFactory(new PropertyValueFactory<Urbanizacion,String>("nom_urb"));
        etapa.setCellValueFactory(new PropertyValueFactory<Urbanizacion,Integer>("etapa"));
        email_urb.setCellValueFactory(new PropertyValueFactory<Urbanizacion,Integer>("email_urb"));
        direccion.setCellValueFactory(new PropertyValueFactory<Urbanizacion,Integer>("direccion"));
        constructora.setCellValueFactory(new PropertyValueFactory<Urbanizacion,Integer>("constructora"));
        admin.setCellValueFactory(new PropertyValueFactory<Urbanizacion,TipoEmpleado>("admin"));
        tblUrb.setItems(urbanizacion);
    }    

    @FXML
    private void btnAgregar(ActionEvent event) {
        System.out.println("Agregando");
    }

    @FXML
    private void btnEditar(ActionEvent event) {
        System.out.println("Editando");
    }

    @FXML
    private void btnBorrar(ActionEvent event) {
        System.out.println("Borrando");
    }
    
}
