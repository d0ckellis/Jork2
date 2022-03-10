import java.util.Scanner;

public class Player {
    private final Scanner console;
    public String name;
    public int strength;
    public int intelligence;
    public int agility;

    private Player(Builder builder) {
        this.console = builder.console;
        this.name = builder.name;
        this.strength = builder.strength;
        this.intelligence = builder.intelligence;
        this.agility = builder.agility;
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

    private Inventory inventory;

    public static class Builder {
        private final Scanner console;
        public String name;
        public int strength;
        public int intelligence;
        public int agility;

        public Builder(Scanner console, String name, int strength, int intelligence, int agility) {
            this.console = console;
            this.name = name;
            this.strength = strength;
            this.intelligence = intelligence;
            this.agility = agility;
        }
    }





}
