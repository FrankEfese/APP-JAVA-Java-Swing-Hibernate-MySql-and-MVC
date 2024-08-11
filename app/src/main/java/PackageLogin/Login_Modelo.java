package PackageLogin;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Login_Modelo {

    private final SessionFactory sessionFactory;

    //CONSTRUCTOR
    public Login_Modelo(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //METODO PARA OBTENER TODOS LOS LOGIN (MODELO)
    public List<Login_Object> obtenerTodosLogin_M() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Login_Object", Login_Object.class).list();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR AL COMPROBAR EL USUARIO", "INFORMACION", JOptionPane.ERROR_MESSAGE);
            return new ArrayList<>();
        }
    }

}
