package petInfo;

import hibernate.JsonMapper;
import org.apache.log4j.Logger;

/**
 * Created by benjaminhowland on 12/4/15.
 */
public class PetObjectMapper {

    /**
     * Created by benjaminhowland on 12/3/15.
     */


        static Logger log = Logger.getLogger(PetObjectMapper.class.getName());
        AddOrUpdate addOrUpdate = new AddOrUpdate();

        public void addPet(String postBodyData) {

            log.info("IN PetObjectMapper before swapping: " + postBodyData);
            PetsGeneral petsGeneral = JsonMapper.decode(postBodyData, PetsGeneral.class);
            PetsArray petsArray = PetsArray.getInstance();
            petsArray.addPet(petsGeneral);
            log.info("IN PetObjectMapper after swapping: petArray=  " + petsArray);


            int i = 0;
            for (PetsGeneral p : petsArray.getPetsArray().get(PetsArray.KEY)) {
                log.info("ATDB: For loop: p= " + p);
                log.info("ATDB: For loop: petArray= " + petsArray);
                log.info("Loaded a total of " + i + " pets");
                p.getID();
                p.getCanBattle();
                p.getName();
                p.getCreatureId();
                p.getFamily();
                p.getStrongAgainst();
                p.getWeakAgainst();
                i++;
                log.info("Loaded a total of " + i + " pets");
                addOrUpdate.addOrUpdatePet(p);

            }
        }
}
