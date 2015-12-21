import org.junit.Test;
import petInfo.AddOrUpdate;
import petInfo.PetsGeneral;

import static org.junit.Assert.assertEquals;

/**
 * Created by benjaminhowland on 12/20/15.
 */
public class TestAddOrUpdate {

    @Test
    public void saveAndUpdatePetTest() {

        //here is your variable of type User
        PetsGeneral petsGeneral = new PetsGeneral ();

        petsGeneral.setCanBattle("true");
        petsGeneral.setFamily("undead");
        petsGeneral.setName("TESTERtest");
        petsGeneral.setCreatureId("35325");
        petsGeneral.setWeakAgainst("humanoid");
        petsGeneral.setStrongAgainst("flying");

        assertEquals("true", petsGeneral.getCanBattle());
        assertEquals("undead", petsGeneral.getFamily());
        assertEquals("TESTERtest", petsGeneral.getName());
        assertEquals("35325", petsGeneral.getCreatureId());
        assertEquals("humanoid", petsGeneral.getWeakAgainst());
        assertEquals("flying", petsGeneral.getStrongAgainst());


        //you need to pass a variable with type User
        AddOrUpdate addOrUpdate = new AddOrUpdate();
        addOrUpdate.addOrUpdatePet(petsGeneral);

    }
}
