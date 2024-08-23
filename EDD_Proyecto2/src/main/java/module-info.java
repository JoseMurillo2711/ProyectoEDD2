module espol {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.base;
    requires javafx.graphics;

    opens espol to javafx.fxml;
    exports espol;
}
