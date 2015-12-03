package petInfo;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by benjaminhowland on 11/11/15.
 */

public class PetsGeneral {

    private int ID;
    private String canBattle;
    @JsonIgnore
    private String creatureID;
    private String name;
    private String family;
    @JsonIgnore
    private String icon;
    private String strongAgainst;
    @JsonIgnore
    private String typeID;
    //got an error if I didnt have this so i took it out
    //pets is used at the start of the string/json file
    @JsonIgnore
    private String pets;
    private String weakAgainst;

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String isCanBattle() {
        return canBattle;
    }

    public void setCanBattle(String canBattle) {
        this.canBattle = canBattle;
    }

    public String getCreatureID() {
        return creatureID;
    }

    public void setCreatureID(String creatureID) {
        this.creatureID = creatureID;
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

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public String getWeakAgainst() {
        return weakAgainst;
    }

    public void setWeakAgainst(String weakAgainst) {
        this.weakAgainst = weakAgainst;
    }
}
