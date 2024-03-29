package sigs.api.model;


import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class  UserDTO {
    private String username;
    private String password;

   // private Role role;
   @ManyToOne
   @JoinColumn(name = "role_id")
   private Role role;



    private String nom;

    private String prenom;



    private String email;



    private String tel;




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


/*
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
*/



    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }





    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


}
