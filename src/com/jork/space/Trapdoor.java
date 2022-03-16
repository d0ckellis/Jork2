package com.jork.space;
import com.jork.items.Inventory;
import com.jork.items.Item;
import com.jork.model.Player;

import java.util.Random;

public class Trapdoor extends Space {
    public Boolean isTrapDoorOpen;

    private Boolean getIsTrapDoorOpen() {return isTrapDoorOpen;}

    private void setIsTrapDoorOpen() {
        if(isTrapDoorOpen = false) {isTrapDoorOpen = true;}
    }

    public Trapdoor(Builder builder) {
        super(builder);
    }
    public void use(Inventory inventory, String noun, Player player) {
        switch (noun.toUpperCase()) {
            case "TRAPDOOR":
            case "TRAP":
            case "DOOR": useTrapdoor(inventory, player);
                break;
            default:
                super.use(inventory, noun, player);
        }
    }
    public void useTrapdoor(Inventory inventory, Player player) {
        if (inventory.hasItem(Item.RUG) || player.getHasHungRug() && !getIsTrapDoorOpen()) {
            int result = new Random().nextInt(20) + 1 + player.getStrength();
            if (result >= 15) {
                System.out.println("\tYour strength allows you to lift the heavy door open\n" +
                        "\trevealing a small compartment underneath.\n" +
                        "\tYou wipe away the cobwebs to reveal an antique neckless bejewled and made of silver.\n" +
                        "\tSomething about it feels magical.");
                inventory.add(Item.NECKLACE);
                player.setIntelligence(player.getIntelligence() + 5);
            } else {
                System.out.println("\tYou're not quite strong enough to open it.");
            }
        } else if(getIsTrapDoorOpen()) {
            System.out.println("\tYou already opened it.");
        }
    }
    public static class Builder extends Space.Builder{
        public Builder(String describeSpace) {
            super(describeSpace);
        }

        public Trapdoor build() {
            return new Trapdoor(this);
        }
    }
}
