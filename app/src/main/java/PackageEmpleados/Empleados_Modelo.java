package PackageEmpleados;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Empleados_Modelo {
    
    
    private final SessionFactory sessionFactory;

    
    //CONSTRUCTOR
    public Empleados_Modelo(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    //METODO PARA OBTENER TODOS LOS EMPLEADOS (MODELO)
    public List<Empleados_Object> obtenerTodosEmpleados_M() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Empleados_Object", Empleados_Object.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL OBTENER LOS EMPLEADOS", "INFORMACION", JOptionPane.ERROR_MESSAGE);
            return new ArrayList<>();
        }
    }
    
    
    //METODO PARA GUARDAR EL EMPLEADO (MODELO)
    public void guardarEmpleado_M(Empleados_Object empleado) {

        try {

            Session sesion = sessionFactory.openSession();
            Transaction transaccion = sesion.beginTransaction();

            sesion.save(empleado);
            JOptionPane.showMessageDialog(null, "EMPLEADO AGREGADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            transaccion.commit();

        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR AL EMPLEADO", "INFORMACION", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    
    //METODO PARA ELIMINAR UN EMPLEADO (MODELO)
    public void eliminarEmpleado_M(int idEmpleado) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Empleados_Object empleado = session.get(Empleados_Object.class, idEmpleado);
            if (empleado != null) {
                session.delete(empleado);
                JOptionPane.showMessageDialog(null, "EMPLEADO ELIMINADO CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
            transaction.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR AL EMPLEADO", "INFORMACION", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    //METODO PARA ACTUALIZAR AL EMPLEADO (MODELO)
    public void actualizarEmpleado_M(Empleados_Object empleado) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(empleado);
            JOptionPane.showMessageDialog(null, "EMPLEADO ACTUALIZADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            transaction.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR AL EMPLEADO", "INFORMACION", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    //METODO PARA OBTENER UN EMPLEADO (MODELO)
    public Empleados_Object obtenerEmpleado_M(int idEmpleado) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Empleados_Object.class, idEmpleado);
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL OBTENER EL EMPLEADO", "INFORMACION", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
