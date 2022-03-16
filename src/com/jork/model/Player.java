package com.jork.model;

import com.jork.items.Inventory;

/**
 * A class for storing com.jork.model.Player info and for building the player object.
 * @author alexb
 * @version 1.3
 */
public class Player {
    public String name;
    public int strength;
    public int intelligence;
    public int agility;
    public Inventory inventory;
    public Boolean hasHungRug = false;
    public Boolean hasSeenGlint = false;
    public Boolean hasWetParchment = false;

    public Player(Builder builder) {
        this.name = builder.name;
        this.strength = builder.strength;
        this.intelligence = builder.intelligence;
        this.agility = builder.agility;
        this.inventory = builder.inventory;
    }

    public void setName(String n) {name = n;}

    public String getName() {
        return name;
    }

    public void setStrength(int p) {
        strength = p;
    }

    public int getStrength() {return strength;}

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

    public Boolean getHasHungRug() {return hasHungRug;}

    public Boolean getHasSeenGlint() {return hasSeenGlint;}

    public Boolean getHasWetParchment() {return hasWetParchment;}

    public void setHasWetParchment() {
        if(hasWetParchment = false) {
            hasWetParchment = true;
        }
    }

    public void setHasSeenGlint() {
        if(hasSeenGlint = false) {
            hasSeenGlint = true;
        }
    }

    public void setHasHungRug() {
        if (hasHungRug = false) {
            hasHungRug = true;
        }
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
