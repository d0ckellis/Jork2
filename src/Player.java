public class Player {
    Description name;
    int power;
    int intelligence;
    int agility;

    //creating getter and setter for name and power of player
    public void setName(Description n) {
        name = n;
    }

    public Description getName() {
        return name;
    }

    public void setPower(int p) {
        power = p;
    }

    public int getPower() {
        return power;
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





}
