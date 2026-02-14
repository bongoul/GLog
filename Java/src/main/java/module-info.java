module br.edu.java {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.edu.java to javafx.fxml;
    exports br.edu.java;
}