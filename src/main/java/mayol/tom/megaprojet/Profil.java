package mayol.tom.megaprojet;

import com.dlsc.formsfx.model.util.ResourceBundleService;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Profil implements Initializable {

    public Button btnHome;
    public Button btnTrading;
    public Button btnAutres;
    public Button btnProfil;

    private Stage stage;
    private Scene scene;

    @FXML
    private Circle imgProfil;


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

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        imgProfil.setStroke(Color.SEAGREEN);
        Image image = new Image("https://www.w3schools.com/howto/img_avatar.png", false);
        imgProfil.setFill(new ImagePattern(image));
        imgProfil.setEffect(new DropShadow(+25d, 0d , +2d, Color.DARKSEAGREEN));
    }
}
