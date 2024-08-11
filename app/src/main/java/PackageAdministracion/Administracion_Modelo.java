package PackageAdministracion;

import PackageLogin.Login_Object;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Administracion_Modelo {

    private final SessionFactory sessionFactory;

    //CONSTRUCTOR
    public Administracion_Modelo(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //METODO PARA OBTENER TODOS LOS ADMIN (MODELO)
    public List<Login_Object> obtenerTodosLogin_M() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Login_Object", Login_Object.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL OBTENER A LOS ADMINISTRADORES", "INFORMACION", JOptionPane.ERROR_MESSAGE);
            return new ArrayList<>();
        }
    }

    //METODO PARA GUARDAR EL ADMIN (MODELO)
    public void guardarAdmin_M(Login_Object admin) {

        try {

            Session sesion = sessionFactory.openSession();
            Transaction transaccion = sesion.beginTransaction();

            sesion.save(admin);
            JOptionPane.showMessageDialog(null, "ADMIN AGREGADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            transaccion.commit();

        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR EL ADMIN", "INFORMACION", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    
    //METODO PARA OBTENER UN ADMIN (MODELO)
    public Login_Object obtenerAdmin_M(int idAdmin) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Login_Object.class, idAdmin);
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL OBTENER EL ADMIN", "INFORMACION", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    
    //METODO PARA ACTUALIZAR EL ADMIN (MODELO)
    public void actualizarAdmin_M(Login_Object admin) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(admin);
            JOptionPane.showMessageDialog(null, "ADMIN ACTUALIZADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            transaction.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR EL ADMIN", "INFORMACION", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    //METODO PARA ELIMINAR UN ADMIN (MODELO)
    public void eliminarAdmin_M(int idAdmin) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Login_Object admin = session.get(Login_Object.class, idAdmin);
            if (admin != null) {
                session.delete(admin);
                JOptionPane.showMessageDialog(null, "ADMIN ELIMINADO CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
            transaction.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR EL ADMIN", "INFORMACION", JOptionPane.ERROR_MESSAGE);
        }
    }

}
