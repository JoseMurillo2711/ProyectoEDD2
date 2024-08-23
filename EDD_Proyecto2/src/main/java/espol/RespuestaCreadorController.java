/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package espol;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author María José Villón
 */
public class RespuestaCreadorController implements Initializable {

    @FXML
    private BorderPane borderPane;
    @FXML
    private VBox vbFiltros;
    @FXML
    private TextField respuestaCreadorArea;
    @FXML
    private Button FinalizarButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void respuestaCreador(ActionEvent event) {
    }

    @FXML
    private void Finalizar(ActionEvent event) {
    }
    
}
