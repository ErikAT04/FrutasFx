module com.example.ejfxfruta {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.ejfxfruta to javafx.fxml;
    exports com.example.ejfxfruta;
}