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
public class Vista3Controller implements Initializable {

    @FXML
    private Button btnAdd;
    @FXML
    private Button btnEdit;
    @FXML
    private Button btnBorrar;
    @FXML
    private TableView<Visitante> tblVis;
    @FXML
    private TableColumn<Visitante,String> nombre;
    @FXML
    private TableColumn<Visitante,Integer> cedula;
    @FXML
    private TableColumn<Visitante,String> email;
    @FXML
    private TableColumn<Visitante,Integer> telefono;
    @FXML
    private TableColumn<Visitante,String> empresa;
    @FXML
    private TableColumn<Visitante,Boolean> sancion;
    
    ObservableList<Visitante> visitante = FXCollections.observableArrayList(
        
        new Visitante("Alfredo",542,"alfredo@gmail.com",198,"KFC",false),
        new Visitante("Cesar",785,"cesar@gmail.com",120,"Claro",false),
        new Visitante("Javier",325,"javier@gmail.com",149,"Mc Donalds",false)
    );

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nombre.setCellValueFactory(new PropertyValueFactory<Visitante,String>("nombre"));
        cedula.setCellValueFactory(new PropertyValueFactory<Visitante,Integer>("cedula"));
        email.setCellValueFactory(new PropertyValueFactory<Visitante,String>("email"));
        telefono.setCellValueFactory(new PropertyValueFactory<Visitante,Integer>("telefono"));
        empresa.setCellValueFactory(new PropertyValueFactory<Visitante,String>("empresa"));
        sancion.setCellValueFactory(new PropertyValueFactory<Visitante,Boolean>("sancion"));
        tblVis.setItems(visitante);
    }    

    @FXML
    private void btnAdd(ActionEvent event) {
        System.out.println("Agrenando");
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
