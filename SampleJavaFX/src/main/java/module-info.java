module com.example.samplejavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.samplejavafx to javafx.fxml;
    exports com.example.samplejavafx;
}