package petInfo;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

/**
 * Created by benjaminhowland on 11/11/15.
 */
@Entity
@Table(name = "All_General_pets", uniqueConstraints =  {
        @UniqueConstraint(columnNames = "ID")
})
public class PetsGeneral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int ID;
    @Column(name = "canBattle", unique = true,nullable = false)
    private boolean canBattle;
    @Column(name = "creatureID", unique = true,nullable = false,length = 5)
    private String creatureID;
    @Column(name = "name", unique = true,nullable = false,length = 20)
    private String name;
    @Column(name = "family", unique = false,nullable = false,length = 20)
    private String family;
    @Column(name = "icon", unique = false,nullable = false,length = 30)
    private String icon;
    @Column(name = "strongAgainst", unique = false,nullable = false,length = 20)
    private String strongAgainst;
    @Column(name = "typeID", unique = false,nullable = false,length = 2)
    private String typeID;
    @Column(name = "weakAgainst", unique = false,nullable = false,length = 20)
    private String weakAgainst;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isCanBattle() {
        return canBattle;
    }

    public void setCanBattle(boolean canBattle) {
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
