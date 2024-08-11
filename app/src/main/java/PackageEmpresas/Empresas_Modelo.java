package PackageEmpresas;

import PackageEmpleados.Empleados_Object;
import PackageProductos.Productos_Object;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Empresas_Modelo {

    private final SessionFactory sessionFactory;

    //CONSTRUCTOR
    public Empresas_Modelo(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //METODO PARA OBTENER TODOS LAS EMPRESAS (MODELO)
    public List<Empresas_Object> obtenerTodasEmpresas_M() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Empresas_Object", Empresas_Object.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL OBTENER LAS EMPRESAS", "INFORMACION", JOptionPane.ERROR_MESSAGE);
            return new ArrayList<>();
        }
    }

    //METODO PARA GUARDAR LA EMPRESA (MODELO)
    public void guardarEmpresa_M(Empresas_Object empresa) {

        try {

            Session sesion = sessionFactory.openSession();
            Transaction transaccion = sesion.beginTransaction();

            sesion.save(empresa);
            JOptionPane.showMessageDialog(null, "EMPRESA AGREGADA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            transaccion.commit();

        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR LA EMPRESA", "INFORMACION", JOptionPane.ERROR_MESSAGE);
        }

    }

    //METODO PARA ELIMINAR UNA EMPRESA (MODELO)
    public void eliminarEmpresa_M(int idEmpresa) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Empresas_Object empresa = session.get(Empresas_Object.class, idEmpresa);
            if (empresa != null) {
                session.delete(empresa);
                JOptionPane.showMessageDialog(null, "EMPRESA ELIMINADA CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
            transaction.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR LA EMPRESA", "INFORMACION", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    //METODO PARA ACTUALIZAR LA EMPRESA (MODELO)
    public void actualizarEmpresa_M(Empresas_Object empresa) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(empresa);
            JOptionPane.showMessageDialog(null, "EMPRESA ACTUALIZADA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            transaction.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR LA EMPRESA", "INFORMACION", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    //METODO PARA OBTENER UNA EMPRESA (MODELO)
    public Empresas_Object obtenerEmpresa_M(int idEmpresa) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Empresas_Object.class, idEmpresa);
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL OBTENER LA EMPRESA", "INFORMACION", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    
    //METODO PARA OBTENER LOS EMPLEADOS (MODELO)
    public List<Empleados_Object> obtenerEmpleadosDeEmpresa_M(int idEmpresa) {
        try (Session session = sessionFactory.openSession()) {
            String jpql = "SELECT emp FROM Empleados_Object emp WHERE emp.empresas_id_empresa.id_empresa = :id_Empresa";
            return session.createQuery(jpql, Empleados_Object.class)
                    .setParameter("id_Empresa", idEmpresa)
                    .getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL OBTENER LOS EMPLEADOS DE LA EMPRESA", "INFORMACION", JOptionPane.ERROR_MESSAGE);
            return new ArrayList<>();
        }
    }
    
    
    //METODO PARA OBTENER LOS PRODUCTOS (MODELO)
    public List<Productos_Object> obtenerProductosDeEmpresa_M(int idProducto) {
        try (Session session = sessionFactory.openSession()) {
            String jpql = "SELECT empp FROM Productos_Object empp WHERE empp.empresas_id_empresa_p.id_empresa = :id_Producto";
            return session.createQuery(jpql, Productos_Object.class)
                    .setParameter("id_Producto", idProducto)
                    .getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL OBTENER LOS PRODUCTOS DE LA EMPRESA", "INFORMACION", JOptionPane.ERROR_MESSAGE);
            return new ArrayList<>();
        }
    }

}
