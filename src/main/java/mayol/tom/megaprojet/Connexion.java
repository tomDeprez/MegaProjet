package mayol.tom.megaprojet;

import entity.UserEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.*;


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

    @FXML
    private Label testLabel;

    private Stage stage;
    private Scene scene;

    public void connexionUser(ActionEvent event) throws IOException {

        DatabaseConnection connection = new DatabaseConnection();
        Connection connectionDB = connection.getConnection();

//        String connecrQuerry = "SELECT * FROM user WHERE pseudo = ? and password = ?" ;

        try {
            Statement statement = connectionDB.createStatement();

            PreparedStatement ps = connectionDB.prepareStatement("SELECT * FROM user WHERE pseudo = ? and password = ?");
            ps.setString(1, pseudo.getText());
            ps.setString(2, password.getText());

            ResultSet queryOuput = ps.executeQuery();

            if(queryOuput.next() == false)
            {
                testLabel.setText("Erreur, utilisateur non trouvé");
            }
            else
            {

                Parent root = FXMLLoader.load(getClass().getResource("profil-view.fxml"));
                stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }


//        EntityManager entityManager = Persistence
//                .createEntityManagerFactory("ours")
//                .createEntityManager();
//        EntityTransaction entityTransaction = entityManager.getTransaction();

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ours");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//
//        // verifier le connexion de l'utilisateur.
//
//        String pseudoUser = pseudo.getText();
//        String passwordUser = password.getText();
//
//        identifier.getChildren().remove(connexion);
//
//        ProgressIndicator indicator = new ProgressIndicator();
//
//        indicator.setLayoutX(connexion.getLayoutX());
//        indicator.setLayoutY(connexion.getLayoutY());
//
//        AnchorPane anchorPane = new AnchorPane();
//
//        AnchorPane.setBottomAnchor(indicator, 20.0);
//        AnchorPane.setLeftAnchor(indicator, 0.0);
//        AnchorPane.setRightAnchor(indicator, 0.0);
//
//        identifier.getChildren().add(indicator);
//        try {
///*            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//
//
//// Connexion à la base myschema sur la machine localhost
//// en utilisant le login "username" et le password "password"
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ours",
//                    "root", "");
//            var test = "";
//            connection.close();*/
//            UserEntity UserEntity = new UserEntity();
//            UserEntity.setEmail("test@test.com");
//            UserEntity.setPseudo("tm.de");
//            UserEntity.setPassword("tom");
//            entityManager.persist(UserEntity);
//        } catch (Exception e) {
//            var test = e.getMessage();
//            test = e.getMessage();
//        }
//        identifier.getChildren().remove(indicator);
//        identifier.getChildren().add(connexion);


    }
}
