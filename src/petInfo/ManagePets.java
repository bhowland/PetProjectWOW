package petInfo;

import com.oracle.javafx.jmx.json.JSONFactory;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by benjaminhowland on 11/23/15.
 */
public class ManagePets {
    static Logger log = Logger.getLogger(ManagePets.class.getName());

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        PetsGeneral pet = new PetsGeneral();
        BufferedReader br = null;
        String fileToBeRead = "allPetsSixPointTwo";
        String line = "";
        String jsonFileString = "";
        AddToDataBase addToDataBase = new AddToDataBase();
        try {
            session.beginTransaction();
            br = new BufferedReader(new FileReader(fileToBeRead));
            while ((line = br.readLine()) != null) {
                jsonFileString += line;
            }//end while
            //THIS IS NOT WORKING AS PLANNED SAD PANDA
//            JSONObject petObject = new JSONObject(jsonFileString);
//            System.out.println(petObject); /////////////////////////////////////////using this one
//            System.out.println("in try before for loop");///////////////////////////using this one
//            log.info(petObject);
//            for (int i = 0; i < petObject.length(); i++) {
//                System.out.println("FOR LOOP START");////////////////////////////////using this one
//                pet.setCanBattle(petObject.getString("canBattle"));
//                pet.setName(petObject.getString("name"));
//                pet.setFamily(petObject.getString("family"));
//                pet.setStrongAgainst(petObject.getString("strongAgainst"));
//                pet.setWeakAgainst(petObject.getString("weakAgainst"));
//                session.save(pet);
//                System.out.println("FOR LOOP END");///////////////////////////////////using this one
//            }

            System.out.println("Before send off: " + jsonFileString);
            addToDataBase.addPet(jsonFileString);
            System.out.println("After send off" + jsonFileString);
            


//            System.out.println("in try after for loop");//////////////////////////////using this one
//            session.getTransaction().commit();
            System.out.println("in try after commit");////////////////////////////////using this one
        }
        catch (Exception e) {
            log.debug("error of:" + e);
            System.out.println("In catch with the error of:" + e);////////////////////using this one
        }finally {
            if (br != null){
                try{
                br.close();
                }catch (IOException e){
                    log.error("captin oh captin", e);
                    e.printStackTrace();
                }
            }
        }//end try/catch block
        System.out.println("oh happy dagger");/////////////////////////////////////////uisng this one
    }//end method
}//end class


