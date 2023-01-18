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
public class Vista2Controller implements Initializable {

    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnEdita;
    @FXML
    private Button btnBorra;
    @FXML
    private TableColumn<Residente, String> nombre;
    @FXML
    private TableColumn<Residente, Integer> cedula;
    @FXML
    private TableColumn<Residente, String> email;
    @FXML
    private TableColumn<Residente, Integer> telefono;
    @FXML
    private TableColumn<Residente, Boolean> estado;
    @FXML
    private TableColumn<Residente,Integer> mz;
    @FXML
    private TableColumn<Residente,Integer> villa;
    @FXML
    private TableColumn<Residente, Integer> cant_perso;
    @FXML
    private TableColumn<Residente, Urbanizacion> urbanizacion;  
    Urbanizacion urb1 = new   Urbanizacion("Chespirito",2,"pepe@hotmail.com","Enrique Segoviano","Const",TipoEmpleado.administrador);
    Urbanizacion urb2= new Urbanizacion("Milagro",1,"mil@hotmail.com","Las Peñas","Const",TipoEmpleado.administrador);
    Urbanizacion urb3=new Urbanizacion("Milagro",1,"mil@hotmail.com","Las Peñas","Const",TipoEmpleado.administrador);
    ObservableList<Residente> residente = FXCollections.observableArrayList(
        
        new Residente("Jose",123,"jose@outlook.com",147,true,1,1,1,urb1),
        new Residente("Carlos",321,"carlos@outlook.com",198,true,1,2,2,urb2),
        new Residente("Tomas",213,"tomas@outlook.com",152,true,1,3,3,urb3)
    );
    @FXML
    private TableView<Residente> tblRes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nombre.setCellValueFactory(new PropertyValueFactory<Residente, String>("nombre"));
        cedula.setCellValueFactory(new PropertyValueFactory<Residente, Integer>("cedula"));
        email.setCellValueFactory(new PropertyValueFactory<Residente, String>("email"));
        telefono.setCellValueFactory(new PropertyValueFactory<Residente, Integer>("telefono"));
        estado.setCellValueFactory(new PropertyValueFactory<Residente,Boolean>("estado"));
        mz.setCellValueFactory(new PropertyValueFactory<Residente, Integer>("mz"));
        villa.setCellValueFactory(new PropertyValueFactory<Residente, Integer>("villa"));
        cant_perso.setCellValueFactory(new PropertyValueFactory<Residente, Integer>("cant_perso"));
        urbanizacion.setCellValueFactory(new PropertyValueFactory<Residente, Urbanizacion>("urbanizacion"));
        
        tblRes.setItems(residente);
    }    

    @FXML
    private void btnAgrega(ActionEvent event) {
        System.out.println("Agregando");
    }

    @FXML
    private void btnEdita(ActionEvent event) {
        System.out.println("Editando");
    }

    @FXML
    private void btnBorra(ActionEvent event) {
        System.out.println("Borrando");
    }

    
}
