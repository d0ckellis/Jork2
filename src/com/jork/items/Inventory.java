package com.jork.items;

import java.util.HashMap;

/**
 * A unique {@code HashMap} with its own behavior used to store {@link Item}s within.
 * @author jaspersn
 * @author alexb
 * @version 1.3
 */
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
            System.out.println("You either can't or don't know how, you decide.");
        }
    }

    public void remove(Item item) {
        inventory.remove(item);
    }

    public String addedItem(Item item) {
        return "You added " + item + " to your inventory.";
    }

    public void printInventory() {
        System.out.println("Your inventory contains: " + inventory.keySet());
    }

}

