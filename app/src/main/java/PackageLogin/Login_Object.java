package PackageLogin;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "login")
public class Login_Object implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_login")
    private int id_login;

    @Column(name = "correo", nullable = false, unique = true)
    private String correo;

    @Column(name = "contraseña", nullable = false)
    private String contraseña;

    //CONSTRUCTOR
    public Login_Object() {
    }

    //CONSTRUCTOR
    public Login_Object(int id_Login, String correo, String contraseña) {
        this.id_login = id_Login;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    //CONSTRUCTOR
    public Login_Object(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    //GETTER AND SETTERS
    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Login_Object{" + "id_Login=" + id_login + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + '}';
    }

}
