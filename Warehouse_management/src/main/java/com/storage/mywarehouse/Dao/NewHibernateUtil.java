package com.storage.mywarehouse.Dao;



import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

class NewHibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
             
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
