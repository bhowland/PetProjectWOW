package petInfo;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by benjaminhowland on 11/23/15.
 */
public class ManagePets {
    static Logger log = Logger.getLogger(ManagePets.class.getName());
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        BufferedReader br = null;
        String fileToBeRead = "allPetsSixPointTwo";
        String line = "";
        String jsonFileString = "";
        PetObjectMapper petObjectMapper = new PetObjectMapper();
        try {
            session.beginTransaction();
            br = new BufferedReader(new FileReader(fileToBeRead));
            while ((line = br.readLine()) != null) {
                jsonFileString += line;
            }//end while
            petObjectMapper.addPet(jsonFileString);
        }
        catch (Exception e) {
            log.debug("error of:" + e);
        }finally {
            if (br != null){
                try{
                br.close();
                }catch (IOException e){
                    log.error("captin oh captin", e);
                }
            }
        }//end try/catch block
        System.out.println("oh happy dagger");///////////Just I know it is done//////uisng this one
    }//end method
}//end class


