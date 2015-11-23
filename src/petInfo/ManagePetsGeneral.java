

package petInfo;

import java.util.List;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Update;

/**
 * Created by benjaminhowland on 11/11/15.
*/
import java.util.List;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManagePetsGeneral {


    private static SessionFactory factory;
    public static void main(String[] args) {
        try{
            factory = new Configuration().configure().buildSessionFactory();
        }catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        ManagePetsGeneral GeneralPets = new ManagePetsGeneral();

    }
    /* Method to CREATE a pet in the database */
    public Integer addPet(){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer ID = null;
        try{
            tx = session.beginTransaction();
            PetsGeneral pets = new PetsGeneral();
            ID = (Integer) session.save(pets);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return ID;
    }
}