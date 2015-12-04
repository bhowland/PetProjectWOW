package petInfo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by benjaminhowland on 12/3/15.
 */
public class AddOrUpdate {
    /** Method to CREATE or UPDATE a pet in the database
     * If an id of 0 is passed in, a new pet entry will be created
     * If an id of an existing record is passed in, the pet is updated
     *
     * @param petsGeneral The UserRole to be added or created
     **/
    public void addOrUpdatePet(PetsGeneral petsGeneral) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer Id = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(petsGeneral);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}