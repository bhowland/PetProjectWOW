package petInfo;

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

            System.out.println("IN PetObjectMapper 1 " + postBodyData);
            PetsGeneral petsGeneral = JsonMapper.decode(postBodyData, PetsGeneral.class);
            System.out.println("IN PetObjectMapper 2 " + petsGeneral.getCanBattle());
            PetsArray petsArray = PetsArray.getInstance();
            System.out.println("IN PetObjectMapper 3 " + petsArray.getPetsArray());
            petsArray.addPet(petsGeneral);
            System.out.println("IN PetObjectMapper 4 " + petsArray.getPetsArray());

            System.out.println("fun times");



            for (PetsGeneral p : petsArray.getPetsArray().get(PetsArray.KEY)) {

                System.out.println("ATDB: For loop: " + p.getCanBattle());
                p.getCanBattle();
                p.getName();
                p.getFamily();
                p.getStrongAgainst();
                p.getWeakAgainst();
                addOrUpdate.addOrUpdatePet(p);
            }
        }

}
