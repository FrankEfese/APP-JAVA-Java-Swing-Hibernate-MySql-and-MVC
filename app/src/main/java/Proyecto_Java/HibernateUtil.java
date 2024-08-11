package Proyecto_Java;

import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {

        sessionFactory = new Configuration().configure(new File("C:\\Users\\franc\\Desktop\\PROYECTOS\\JAVA\\APP-JAVA-GESTOR-HIBERNATE\\GESTOR-HIBERNATE\\app\\src\\main\\resources\\hibernate.cfg.xml")).buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
