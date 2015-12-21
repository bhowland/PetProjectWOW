import org.junit.Test;
import petInfo.PetObjectMapper;

import static org.junit.Assert.assertNotNull;

/**
 * Created by benjaminhowland on 12/20/15.
 */
public class TestPetObjectMapper {

    @Test
    public void testAddPet(){

        PetObjectMapper petObjectMapper = new PetObjectMapper();
        petObjectMapper.addPet("{\"canBattle\": true, \"creatureId\": 35325, \"name\": \"TESTERtest\", \"family\": \"undead\", \"strongAgainst\": \"flying\", \"weakAgainst\": \"humanoid\"}");
        assertNotNull(petObjectMapper);
    }


}
