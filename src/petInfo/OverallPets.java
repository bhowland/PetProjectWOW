package petInfo;

import java.util.List;

/**
 * Created by benjaminhowland on 12/4/15.
 */
public class OverallPets {


    private  List pets;
    private List<PetsGeneral> list;

    public List getPets() {
        return pets;
    }

    public void setPets(List pets) {
        this.pets = pets;
    }

    public List<PetsGeneral> getList() {
        return list;
    }

    public void setList(List<PetsGeneral> list) {
        this.list = list;
    }

}
