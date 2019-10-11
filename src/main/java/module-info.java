module com.carioquime.monopolime {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.carioquime.monopolime to javafx.fxml;
    exports com.carioquime.monopolime;
}