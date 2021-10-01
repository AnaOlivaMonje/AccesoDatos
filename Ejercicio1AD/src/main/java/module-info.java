module com.example.ejercicio1ad {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicio1ad to javafx.fxml;
    exports com.example.ejercicio1ad;
}