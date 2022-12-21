module com.example.antivirus {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.antivirus to javafx.fxml;
    exports com.example.antivirus;
}