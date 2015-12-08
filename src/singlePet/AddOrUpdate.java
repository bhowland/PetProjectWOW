package singlePet;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import petInfo.HibernateUtil;
import petInfo.ManagePets;
import petInfo.OverallPets;

/**
 * Created by benjaminhowland on 12/3/15.
 */
public class AddOrUpdate {

    static Logger log = Logger.getLogger(ManagePets.class.getName());

    /** Method to CREATE or UPDATE a pet in the database
     * If an id of 0 is passed in, a new pet entry will be created
     * If an id of an existing record is passed in, the pet is updated
     *
     * @param petsGeneral The pet to be added or created
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
            log.info("addOrUpdatePet error of: " + e);
        } finally {
            session.close();
        }
    }
}
