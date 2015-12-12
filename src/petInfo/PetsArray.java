package petInfo;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by benjaminhowland on 12/3/15.
 */
public class PetsArray {

    static Logger log = Logger.getLogger(PetsArray.class.getName());



            private static PetsArray instance = null;

            private static HashMap<String, ArrayList<OverallPets>> petsArray;
            protected static final String KEY = "pets";

            public static PetsArray getInstance() {
                if (instance == null) {
                    instance = new PetsArray();
                    petsArray = new HashMap();
                    petsArray.put(KEY, new ArrayList<OverallPets>());
                }
                return instance;
            }

            public HashMap<String, ArrayList<OverallPets>> getPetsArray() {
                return petsArray;
            }

            public void addPet(OverallPets overallPets) {
                petsArray.get(KEY).add(overallPets);
                log.info("in pet array " + petsArray);
            }

        }
