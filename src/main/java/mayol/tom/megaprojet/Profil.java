package mayol.tom.megaprojet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Profil {

    public Button btnHome;
    public Button btnTrading;
    public Button btnAutres;
    public Button btnProfil;

    private Stage stage;
    private Scene scene;


    @FXML
    protected void showProfil(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("profil-view.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void showHome(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home-view.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
