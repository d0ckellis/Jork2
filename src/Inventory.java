import java.util.HashMap;

public class Inventory {
    HashMap<Item, Boolean> inventory = new HashMap<>();

    public boolean hasItem(Item item) {
        return inventory.containsKey(item);
    }

    public void add(Item item) {
        if(item != Item.EMPTY) {
            inventory.put(item, true);
            item.setItemInInventory();
            System.out.println(addedItem(item));
        } else {
            System.out.println("You don't want that.");
        }
    }

    public void remove(Item item) {
        inventory.remove(item);
    }

    public String addedItem(Item item) {
        String added = "";
        return added = "You added " + item + " to your inventory.";
    }

    public void printInventory() {
        System.out.println("Your inventory contains: " + inventory.keySet());

    }

}

