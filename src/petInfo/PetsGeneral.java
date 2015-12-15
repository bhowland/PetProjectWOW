package petInfo;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.List;

/**
 * Created by benjaminhowland on 11/11/15.
 */

public class PetsGeneral {

    private int ID;

//    private OverallPets pets;

    private String canBattle;
    private String name;
    private String family;
    private String strongAgainst;
    private String weakAgainst;
    @JsonIgnore
    private String icon;
    @JsonIgnore
    private String creatureId;
    @JsonIgnore
    private String typeId;
//    private List<StatsForPets> list;
//
//    public List<StatsForPets> getList() {//took out since it was not in use
//        return list;
//    }
//
//    public void setList(List<StatsForPets> list) {
//        this.list = list;
//    }


//    public OverallPets getPets() {
//        return pets;
//    }
//
//    public void setPets(OverallPets pets) {
//        this.pets = pets;
//    }


    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeID) {
        this.typeId = typeID;
    }

    @Override
    public String toString() {

        return "canBattle:" + this.canBattle + " , "
                + "name:" + this.name + " , "
                + "family:" + this.family + " , "
                + "strongAgainst:" + this.strongAgainst + " , "
                + "weakAgainst:" + this.weakAgainst;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCanBattle() {
        return canBattle;
    }

    public void setCanBattle(String canBattle) {
        this.canBattle = canBattle;
    }

    public String getCreatureId() {
        return creatureId;
    }

    public void setCreatureId(String creatureID) {
        this.creatureId = creatureID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStrongAgainst() {
        return strongAgainst;
    }

    public void setStrongAgainst(String strongAgainst) {
        this.strongAgainst = strongAgainst;
    }

    public String getWeakAgainst() {
        return weakAgainst;
    }

    public void setWeakAgainst(String weakAgainst) {
        this.weakAgainst = weakAgainst;
    }
}