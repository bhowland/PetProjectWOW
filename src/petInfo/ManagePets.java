package petInfo;

import com.sun.javafx.tools.packager.Log;
import org.hibernate.Session;
import org.json.JSONObject;
import sun.misc.IOUtils;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by benjaminhowland on 11/23/15.
 */
public class ManagePets {




        public static void main(String[] args)
        {


            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            PetsGeneral pet = new PetsGeneral();

            try {
                InputStream is = new FileInputStream("allPetsSixPointTwo.json");
                //String petText = IOUtils.toString(is);
                JSONObject petObject = new JSONObject(is);

                for(int i = 0; i<petObject.pets.length(); i++) {
                    pet.setCanBattle(petObject.getBoolean(canBattle));
                    pet.setName(petObject.getString(name));
                    pet.setFamily(petObject.getString(family));
                    pet.setStrongAgainst(petObject.getString(strongAgainst));
                    pet.setWeakAgainst(petObject.getString(weakAgainst));
                    session.save(pet);

                }
            }catch (Exception e) {
                Log.debug("loading file");
            }


                //Add new pet object
            //pet.setCanBattle("stuff from the file");
            //Save the pet in database
           // session.save(pet);

            //Commit the transaction
            session.getTransaction().commit();
            HibernateUtil.shutdown();
        }


}
