package mayol.tom.megaprojet;

import entity.UserEntity;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

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
/*            DriverManager.registerDriver(new com.mysql.jdbc.Driver());


// Connexion à la base myschema sur la machine localhost
// en utilisant le login "username" et le password "password"
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ours",
                    "root", "");
            var test = "";
            connection.close();*/
            UserEntity UserEntity = new UserEntity();
            UserEntity.setEmail("test@test.com");
            UserEntity.setPseudo("tm.de");
            UserEntity.setPassword("tom");
            entityManager.persist(UserEntity);
        } catch (Exception e) {
            var test = e.getMessage();
            test = e.getMessage();
        }
        identifier.getChildren().remove(indicator);
        identifier.getChildren().add(connexion);


    }
}
