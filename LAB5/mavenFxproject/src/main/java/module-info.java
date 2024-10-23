module com.mycompany.mavenfxproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mavenfxproject to javafx.fxml;
    exports com.mycompany.mavenfxproject;
}
