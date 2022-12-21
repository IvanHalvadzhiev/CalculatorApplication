module com.example.findnearestpoints {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.findnearestpoints to javafx.fxml;
    exports com.example.findnearestpoints;
}