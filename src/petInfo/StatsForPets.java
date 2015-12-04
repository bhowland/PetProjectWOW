package petInfo;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * Created by benjaminhowland on 12/4/15.
 */

public class StatsForPets {

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
}
