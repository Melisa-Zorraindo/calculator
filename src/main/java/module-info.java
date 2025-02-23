module com.melisazor.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.melisazor.calculator to javafx.fxml;
    exports com.melisazor.calculator;
}