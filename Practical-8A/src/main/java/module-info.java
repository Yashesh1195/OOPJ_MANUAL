module com.example.practical8a {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practical8a to javafx.fxml;
    exports com.example.practical8a;
}