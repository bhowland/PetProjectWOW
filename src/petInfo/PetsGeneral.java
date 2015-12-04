package petInfo;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by benjaminhowland on 11/11/15.
 */

public class PetsGeneral {

    private int ID;
    private String canBattle;
    private String name;
    private String family;
    private String strongAgainst;
    private String weakAgainst;
    @JsonIgnore
    private String icon;
    @JsonIgnore
    private String creatureID;
    @JsonIgnore
    private String typeID;
    //got an error if I didnt have this so i took it out
    //pets is the top level string/json file
    @JsonIgnore
    private String pets;
    @JsonIgnore
    private String qualityId;
    @JsonIgnore
    private String speciesId;
    @JsonIgnore
    private String breedId;
    @JsonIgnore
    private String petQualityId;
    @JsonIgnore
    private String level;
    @JsonIgnore
    private String health;
    @JsonIgnore
    private String power;
    @JsonIgnore
    private String speed;


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

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    public String getQualityId() {
        return qualityId;
    }

    public void setQualityId(String qualityId) {
        this.qualityId = qualityId;
    }

    public String getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(String speciesId) {
        this.speciesId = speciesId;
    }

    public String getBreedId() {
        return breedId;
    }

    public void setBreedId(String breedId) {
        this.breedId = breedId;
    }

    public String getPetQualityId() {
        return petQualityId;
    }

    public void setPetQualityId(String petQualityId) {
        this.petQualityId = petQualityId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getWeakAgainst() {
        return weakAgainst;
    }

    public void setWeakAgainst(String weakAgainst) {
        this.weakAgainst = weakAgainst;
    }
}