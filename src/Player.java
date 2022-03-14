import java.util.Scanner;

/**
 * A class for storing Player info and for building the player object.
 * @author alexb
 * @version 1.2
 */
public class Player {
    public String name;
    public int strength;
    public int intelligence;
    public int agility;
    public Inventory inventory;

    private Player(Builder builder) {
        this.name = builder.name;
        this.strength = builder.strength;
        this.intelligence = builder.intelligence;
        this.agility = builder.agility;
        this.inventory = builder.inventory;
    }

    //creating getter and setter for name and power of player
    public void setName(String n) {name = n;}

    public String getName() {
        return name;
    }

    public void setPower(int p) {
        strength = p;
    }

    public int getPower() {
        return strength;
    }

    public void setIntelligence(int smart) {
        intelligence = smart;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setAgility(int a) {
        agility = a;
    }

    public int getAgility() {
        return agility;
    }


    public static class Builder {
        public String name;
        public int strength;
        public int intelligence;
        public int agility;
        public Inventory inventory;

        public Builder(String name, int strength, int intelligence, int agility, Inventory inventory) {
            this.name = name;
            this.strength = strength;
            this.intelligence = intelligence;
            this.agility = agility;
            this.inventory = inventory;
        }
        public Player build() {
            return new Player(this);
        }
    }





}
