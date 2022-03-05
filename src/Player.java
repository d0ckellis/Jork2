/**
 * Player class for creation of player objects to store various player relevant fields.
 * @author allyv
 * @author alexb
 * @version 1.1
 */

public class Player {
    private Inventory inventory;
    String name;
    int power;
    int intelligence;
    int agility;

    //creating getter and setter for name and power of player
    private void setName(String n) {
        name = n;
    }

    private String getName() {
        return name;
    }

    private void setPower(int p) {
        power = p;
    }

    private int getPower() {
        return power;
    }

    private void setIntelligence(int smart) {
        intelligence = smart;
    }

    private int getIntelligence() {
        return intelligence;
    }

    private void setAgility(int a) {
        agility = a;
    }

    private int getAgility() {
        return agility;
    }

    private Inventory getInventory() {
        return inventory;
    }
}
