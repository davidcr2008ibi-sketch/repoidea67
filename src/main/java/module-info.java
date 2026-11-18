module com.example.idea {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.idea to javafx.fxml;
    exports com.example.idea;
}