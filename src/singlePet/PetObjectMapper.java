package singlePet;

import org.apache.log4j.Logger;
import petInfo.AddOrUpdate;
import petInfo.JsonMapper;
import petInfo.OverallPets;
import petInfo.PetsArray;

/**
 * Created by benjaminhowland on 12/4/15.
 */
public class PetObjectMapper {

    /**
     * Created by benjaminhowland on 12/3/15.
     */


        static Logger log = Logger.getLogger(PetObjectMapper.class.getName());
        petInfo.AddOrUpdate addOrUpdate = new AddOrUpdate();

        public void addPet(String postBodyData) {

            System.out.println("IN PetObjectMapper before swapping: " + postBodyData);
            OverallPets overallPets = JsonMapper.decode(postBodyData, OverallPets.class);
            PetsArray petsArray = PetsArray.getInstance();
            petsArray.addPet(overallPets);
            System.out.println("IN PetObjectMapper after swapping: " + petsArray);


//                  ///////   CHANGE THIS  SO SO MUCH HERE///////////////

//            int i = 0;
//            for (OverallPets p : petsArray.getPetsArray().get(PetsArray.KEY)) {
//                    log.info("ATDB: For loop: " + p);
//                    log.info("ATDB: For loop: " + petsArray);
//                    log.info("Loaded a total of " + i + " pets");
//                    p.getList().get(i).getCanBattle();
//                    p.getList().get(i).getName();
//                    p.getList().get(i).getFamily();
//                    p.getList().get(i).getStrongAgainst();
//                    p.getList().get(i).getWeakAgainst();
//                    addOrUpdate.addOrUpdatePet(p);
//                    i++;
//            }
        }
}
