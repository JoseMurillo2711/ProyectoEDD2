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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author María José Villón
 */
public class PantallaInicioController implements Initializable {

    @FXML
    private ComboBox<String> TemaJuegoComoBox;
    @FXML
    private Spinner<Integer> nPreguntasSpinner;
    @FXML
    private Button siguienteBoton;
    @FXML
    private Button AtrasBoton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void TemaJuego(ActionEvent event) {
    }

    @FXML
    private void nPregutnas(MouseEvent event) {
    }

    @FXML
    private void Siguiente(ActionEvent event) {
    }

    @FXML
    private void Atras(ActionEvent event) {
    }
    
}
