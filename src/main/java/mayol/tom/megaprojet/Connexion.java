package mayol.tom.megaprojet;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.*;

public class Connexion {
    @FXML
    private TextField pseudo;
    @FXML
    private PasswordField password;
    @FXML
    private Button connexion;
    @FXML
    private AnchorPane identifier;

    public void connexionUser() {

        // verifier le connexion de l'utilisateur.

        String pseudoUser = pseudo.getText();
        String passwordUser = password.getText();

        identifier.getChildren().remove(connexion);

        ProgressIndicator indicator = new ProgressIndicator();

        indicator.setLayoutX(connexion.getLayoutX());
        indicator.setLayoutY(connexion.getLayoutY());

        AnchorPane anchorPane = new AnchorPane();

        AnchorPane.setBottomAnchor(indicator, 20.0);
        AnchorPane.setLeftAnchor(indicator, 0.0);
        AnchorPane.setRightAnchor(indicator, 0.0);

        identifier.getChildren().add(indicator);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        identifier.getChildren().remove(indicator);
        identifier.getChildren().add(connexion);


    }
}
