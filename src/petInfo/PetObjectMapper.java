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

            System.out.println("IN PetObjectMapper 1: " + postBodyData);
            OverallPets petsGeneral = JsonMapper.decode(postBodyData, OverallPets.class);
            PetsArray petsArray = PetsArray.getInstance();
            System.out.println("IN PetObjectMapper 2: " + petsArray.getPetsArray());
            petsArray.addPet(petsGeneral);
            System.out.println("IN PetObjectMapper 3: " + petsArray.getPetsArray());


            int i = 0;
            for (OverallPets p : petsArray.getPetsArray().get(PetsArray.KEY)) {


                System.out.println("ATDB: For loop: ran " + i + " time(s)");
                System.out.println("ATDB: For loop: " + p.getList().get(98).getName().toString());
                p.getList().get(i).getCanBattle();
                p.getList().get(i).getName();
                p.getList().get(i).getFamily();
                p.getList().get(i).getStrongAgainst();
                p.getList().get(i).getWeakAgainst();
                addOrUpdate.addOrUpdatePet(p);
                i++;
            }
        }

}
