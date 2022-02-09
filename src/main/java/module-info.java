module mayol.tom.megaprojet {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires java.sql;
    requires javax.persistence;

    opens mayol.tom.megaprojet to javafx.fxml;
    exports mayol.tom.megaprojet;
}