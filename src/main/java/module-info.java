module com.example.tamalou {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tamalou to javafx.fxml;
    exports com.example.tamalou;
}