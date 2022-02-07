package model.entity;

public class User {
    private int id;
    private String email;
    private String pseudo;
    private String password;

    public User(String pseudo, String email){
        this.email = email;
        this.pseudo = pseudo;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}
