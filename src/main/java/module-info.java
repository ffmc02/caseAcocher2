module com.afpa.casesacocher {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.afpa.casesacocher to javafx.fxml;
    exports com.afpa.casesacocher;
}