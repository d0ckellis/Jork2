import java.util.HashMap;

public class Inventory {
    HashMap<Item, Boolean> inventory = new HashMap<>();

    public boolean hasItem(Item item) {
        return inventory.containsKey(item);
    }

    public void add(Item item) {
        inventory.put(item, true);
    }

    public void remove(Item item) {
        inventory.remove(item);
    }

    public String addedItem(Item item) {
        String added = "";
        return added = "You added" + item + "to your inventory.";}
}
