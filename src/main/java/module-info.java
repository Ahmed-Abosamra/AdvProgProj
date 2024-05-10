module com.example.elmat3am {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.elmat3am to javafx.fxml;
    exports com.example.elmat3am;
}