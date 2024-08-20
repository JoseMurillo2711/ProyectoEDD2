/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import TDA.*;
//import controller.MostrarInfoController;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.Random;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import proyectoedd1.ProyectoEDD1;
import static util.CONSTANTES.CHARACTERS;
import static util.CONSTANTES.ID_LENGTH;
import static util.CONSTANTES.IMAGEN_NOT_FOUND;
import static util.CONSTANTES.RUTA_IMAGEN_CARROS;
import static util.CONSTANTES.RUTA_IMAGEN_LOGO;

/**
 *
 * @author Michelle
 */
public class Utilitario {

    private static final Random RANDOM = new SecureRandom();

    public static void formatoAlfanumerico(TextField textField) {
        TextFormatter<String> textFormatter = new TextFormatter<>(change -> {
            String nuevoTexto = change.getControlNewText();
            if (nuevoTexto.matches("[a-zA-Z0-9]*")) {
                return change;
            } else {
                return null;
            }
        });
        textField.setTextFormatter(textFormatter);
    }

    public static void formatoNumerico(TextField textField) {
        TextFormatter<String> textFormatter = new TextFormatter<>(change -> {
            String nuevoTexto = change.getControlNewText();
            if (nuevoTexto.matches("\\d*")) {
                return change;
            } else {
                return null;
            }
        });
        textField.setTextFormatter(textFormatter);
    }

    public static void formatoNumericoDecimal(TextField textField) {
        TextFormatter<String> textFormatter = new TextFormatter<>(change -> {
            String nuevoTexto = change.getControlNewText();
            if (nuevoTexto.matches("\\d*|\\d+\\.\\d*")) {
                return change;
            } else {
                return null;
            }
        });
        textField.setTextFormatter(textFormatter);
    }

    public static String generateUniqueId() {
        StringBuilder sb = new StringBuilder(ID_LENGTH);
        for (int i = 0; i < ID_LENGTH; i++) {
            sb.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    public static FXMLLoader abrirNuevaVentana(String vista, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(ProyectoEDD1.class.getResource("/vista/" + vista + ".fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            if (vista.equalsIgnoreCase("main")) {
                stage.setOnCloseRequest(event -> {
                    Platform.exit();
                    System.exit(0);
                });
            }
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.show();
            return loader;
        } catch (IOException ex) {
            Alertas.alertaError("Ha ocurrido un error", ex.getMessage());
            return null;
        }
    }
    
    public static void configureDatePicker(DatePicker datePicker) {
        datePicker.setDayCellFactory((final DatePicker datePicker1) -> new DateCell() {
            @Override
            public void updateItem(LocalDate item, boolean empty) {
                super.updateItem(item, empty);
                if (item.isAfter(LocalDate.now())) {
                    setDisable(true);
                    setStyle("-fx-background-color: #ffc0cb;");
                }
            }
        });

        datePicker.setValue(LocalDate.now());
    }
}