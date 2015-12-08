package singlePet;

import com.sun.xml.internal.bind.v2.TODO;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import petInfo.HibernateUtil;
import petInfo.PetObjectMapper;

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
        String fileToBeRead = "crawling_claw";
        String line = "";
        String jsonFileString = "";
        //PetObjectMapper petObjectMapper = new PetObjectMapper();///////   CHANGE THIS ///////////////
        try {
            session.beginTransaction();
            br = new BufferedReader(new FileReader(fileToBeRead));
            while ((line = br.readLine()) != null) {
                jsonFileString += line;
            }//end while

            //petObjectMapper.addPet(jsonFileString);////////   CHANGE THIS /////////////////////
        }
        catch (Exception e) {
            log.info("error of:" + e);
        }finally {
            if (br != null){
                try{
                br.close();
                }catch (IOException e){
                    log.info("captin oh captin", e);
                }
            }
        }//end try/catch block
        log.info("oh happy dagger");///////////Just I know it is done//////uisng this one
    }//end method
}//end class


