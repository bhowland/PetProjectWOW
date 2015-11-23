package petInfo;

import org.hibernate.Session;

/**
 * Created by benjaminhowland on 11/23/15.
 */
public class ManagePets {


        public static void main(String[] args)
        {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            //Add new Employee object
            PetsGeneral pet = new PetsGeneral();
            pet.setCanBattle("stuff from the file");
            //Save the employee in database
            session.save(pet);

            //Commit the transaction
            session.getTransaction().commit();
            HibernateUtil.shutdown();
        }
}
