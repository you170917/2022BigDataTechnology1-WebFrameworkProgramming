module com.example.homework01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homework01 to javafx.fxml;
    exports com.example.homework01;
}