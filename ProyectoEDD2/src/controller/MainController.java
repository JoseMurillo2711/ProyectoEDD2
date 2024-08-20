package controller;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import modelo.Usuario;
import util.Alertas;
import util.UsuarioDataManager;
import util.Utilitario;
import static util.Utilitario.abrirNuevaVentana;

/**
 * FXML Controller class
 */
public class MainController implements Initializable {
    @FXML
    private BorderPane rootBorderPane;
    @FXML
    private HBox hbIniciarSesion;
    @FXML
    private MenuBar menuUser;
    @FXML
    private HBox hbBusqueda;

    private Usuario usuario;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.usuario = UsuarioDataManager.getInstance().getUsuarioActual();
        configIniciales();
//        cargarPagina("inicio");
    }

    private void configIniciales() {
        if (this.usuario == null) {
            this.menuUser.setVisible(false);
            this.menuUser.setManaged(false);
            this.hbIniciarSesion.setVisible(true);
            this.hbIniciarSesion.setManaged(true);
        } else {
            this.menuUser.getMenus().get(0).setText("Bienvenido/a, " + this.usuario.getNickname() + "!");
            this.menuUser.setVisible(true);
            this.menuUser.setManaged(true);
            this.hbIniciarSesion.setVisible(false);
            this.hbIniciarSesion.setManaged(false);
        }
    }

    @FXML
    private void iniciarSesion(MouseEvent event) {
        mostrarVentanaDeInicioSesion();
    }

    @FXML
    private void registrarse(MouseEvent event) {
        abrirNuevaVentana("registro", "Registro de Usuario");
        cerrarVentana();
    }

   
    

    @FXML
    private void inicioDePagina(MouseEvent event) {
        cargarPagina("inicio");
    }

    public void cargarPagina(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../vista/" + fxmlFile + ".fxml"));
            Node pagina = loader.load();
            rootBorderPane.setCenter(pagina);
        } catch (IOException e) {
            Alertas.alertaError("Ha ocurrido un error", e.getMessage());
        }
    }

    @FXML
    private void cerrarSesion(ActionEvent event) {
        mostrarVentanaDeInicioSesion();
        UsuarioDataManager.getInstance().cerrarSesion();
        Alertas.alertaInfo("Acabas de cerrar Sesion", "Sesion cerrada correctamente");
    }

    private void cerrarVentana() {
    }

    private void mostrarVentanaDeInicioSesion() {
        abrirNuevaVentana("login", "Iniciar Sesión");
        cerrarVentana();
    }

    @FXML
    private void irPaginaPrincipal(ActionEvent event) {
        cargarPagina("inicio");
    }

    public void showSearchBar() {
        this.hbBusqueda.setVisible(true);
    } 
}