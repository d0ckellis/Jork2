package com.jork.space;
import com.jork.items.Inventory;
import com.jork.items.Item;
import com.jork.main.Jork;
import com.jork.model.Player;
import com.jork.model.SystemMessages;

import java.util.Random;

public class Door extends Space {
    public Boolean isDoorOpen;
    private Boolean isKeyFound = false;


    public Door(Builder builder) {
        super(builder);
    }

    public Boolean getKeyFound() {return isKeyFound;}

    public void setKeyFound() {
        if(isKeyFound = false) {
            isKeyFound = true;
        }
    }
    public String getSpaceDescription() {
        if (!isKeyFound) {
            return getDescribeSpace();
        } else {
            return getDescribeSpaceWithoutItem();
        }
    }

    private void setIsDoorOpen() {
        if(isDoorOpen = false) {
            isDoorOpen = true;
        }
    }
    public Item take(String noun, Player player, Inventory inventory) {
        if (noun.toUpperCase().equals(secretItem.name()) && player.getHasHungRug() && !inventory.hasItem(Item.KEY)) {
            return secretItem;
        } else {
            return Item.EMPTY;
        }
    }
    public void use(Inventory inventory, String noun, Player player) {
        switch(noun.toUpperCase()) {
            case "KEY": useKey(inventory, player);
                break;
            case "SWORD": useSword(inventory, player);
                break;
            case "DOOR": useDoor(inventory, player);
                break;
            default: super.use(inventory, noun, player);
        }
    }
    public void useKey(Inventory inventory, Player player) {
        if (inventory.hasItem(Item.KEY)) {
            setIsDoorOpen();
            Random random = new Random();
            System.out.println(SystemMessages.door_opened);
            String answer = Jork.CONSOLE.next();
            Jork.CONSOLE.nextLine();
            switch (answer.toUpperCase()) {
                case "FIGHT":
                    if (random.nextInt(20) + 1 + player.getStrength() > 20) {
                        System.out.println(SystemMessages.door_fight);
                    } else {
                        System.out.println("\tYou stab grue in the chest, but apparently Half-Orc hearts aren't located in the same place as yours.\n" + "\tYour gambit is unsuccessful, you are eaten by Grue.");
                    }
                    break;
                case "OUTWIT":
                    if (random.nextInt(20) + 1 + player.getIntelligence() > 20) {
                        System.out.println(SystemMessages.door_wit);
                    } else {
                        System.out.println("\tYour ruse is unsuccessful, you are eaten by Grue.");
                        //TODO end game
                    }
                    break;
                default:
                    System.out.println("You've chosen death.\n\n");
            }
        }
    }
    public void useSword(Inventory inventory, Player player) {
        if(inventory.hasItem(Item.SWORD)) {
            Random random = new Random();
            if(random.nextInt(20) + player.getStrength() > 35) {
                setIsDoorOpen();
                System.out.println("\tYour teacher in primary school always said you could do anything you put your mind to, though you always thought is was much easier to put your sword to it.\n" +
                        "\tYou drive your trusty blade through the wooden panels of the door again and again, until there's enough space to fit your head through.\n" +
                        "\tShouting, \"HERE\'S" + player.getName().toUpperCase() + "!!!\n" +
                        "\tWhoever was knocking at the door, probably started running away as soon as your sword started coming through the door.\n" +
                        "\tIn all the commotion, it seems a little brass key fell off the door jam and onto the floor, though you feel less compeled to use it now that the door will need to be replaced.\n");
                //TODO end game
            }
        }
    }
    public void useDoor(Inventory inventory, Player player) {
        if(inventory.hasItem(Item.KEY)) {
            useKey(inventory, player);
        } else {
            System.out.println(SystemMessages.door_locked);
        }
    }
    public static class Builder extends Space.Builder{

        public Builder(String describeSpace) {
            super(false, describeSpace);
        }

        public Door build() {
            return new Door(this);
        }
    }
}
