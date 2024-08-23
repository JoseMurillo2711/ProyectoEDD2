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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class PantallaJugadorController implements Initializable {

    @FXML
    private BorderPane borderPane;
    @FXML
    private VBox vbFiltros;
    @FXML
    private Button RespuestaSi;
    @FXML
    private Button RespuestaNo;
    @FXML
    private VBox vbMarcas;
    @FXML
    private Button CambioPreguntaAntButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void siButton(ActionEvent event) {
    }

    @FXML
    private void noButton(ActionEvent event) {
    }

    @FXML
    private void CambioPregAnt(ActionEvent event) {
    }
    
}
