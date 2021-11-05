module com.example.interfacce {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interfacce to javafx.fxml;
    exports com.example.interfacce;
}