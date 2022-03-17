package com.jork.space;
import com.jork.items.Inventory;
import com.jork.items.Item;
import com.jork.main.Jork;
import com.jork.model.Player;

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
            System.out.println("\tYou open the door to see a tall serious Half-Orc standing before you.\n" + "\tHe introduces himself as Grue. You don't like Grue.\n\n" + "\t\"I'm the Count's tax collector\" he says, with a toothsome smile.\n" + "\tYou wonder if you might be eaten by Grue. He does look hungry.\n" + "\tHe informs you that your tax evasion escapade has now come to an end.\n" + "\tYou owe the Count some (many) coin and he wants your debts paid in full.\n\n" + "\tYou regret opening the door. You wish you could crawl back into bed and return to your hangover,\n" + "\tbut you can't. Realty is staring you in the face, and it hasn't brushed it's teeth in some time.\n\n" + "\tWhat will you do? You could fight him, or perhaps outwit him.\n" + "\t(Enter fight or outwit):");
            String answer = Jork.CONSOLE.next();
            Jork.CONSOLE.nextLine();
            switch (answer.toUpperCase()) {
                case "FIGHT":
                    if (random.nextInt(20) + 1 + player.getStrength() > 20) {
                        System.out.println("\tYou feint adjusting your cloak, and instead draw your family sword.\n" + "\tThe sword doesn't have a name, but you figure you'll name it 'Grue' in memoriam.\n" + "\tYou plunge 'Grue' into Grue's chest, confirming that it is indeed all about HOW you use it.\n" + "\tThe blow strikes true, and Grue, is through.\n" + "\t\uD835\uDE1A\uD835\uDE26\uD835\uDE33\uD835\uDE2A\uD835\uDE30\uD835\uDE36\uD835\uDE34\uD835\uDE2D\uD835\uDE3A, " + "\uD835\uDE33\uD835\uDE29\uD835\uDE3A\uD835\uDE2E\uD835\uDE2A\uD835\uDE2F\uD835\uDE28 \uD835\uDE22\uD835\uDE35 \uD835\uDE22 " + "\uD835\uDE35\uD835\uDE2A\uD835\uDE2E\uD835\uDE26 \uD835\uDE2D\uD835\uDE2A\uD835\uDE2C\uD835\uDE26 \uD835\uDE35\uD835\uDE29\uD835\uDE2A\uD835\uDE34?\n" + "\tYou don't have time to grab your things, you scramble out the door, and furthermore the Grumpy Inn,\n" + "\tliving to fight another day.\n\n");
                    } else {
                        System.out.println("\tYou stab grue in the chest, but apparently Half-Orc hearts aren't located in the same place as yours.\n" + "\tYour gambit is unsuccessful, you are eaten by Grue.");
                    }
                    break;
                case "OUTWIT":
                    if (random.nextInt(20) + 1 + player.getIntelligence() > 20) {
                        System.out.println("\n\tYou don't think you'll manage trying to kill Grue in combat,\n" + "\ta fair assumption seeing as he's a Half-Orc and you're, well, you're you.\n" + "\tHowever, Grue is definitely a few clowns short of a circus. Not that you've ever been.\n\n" + "\tInstead, remembering that Half-Orcs are some of the most gullible people with opposable thumbs, you lie to him.\n" + "\tHe's about to drag you out by your neck, when you point to the window and exclaim,\n" + "\t\"Hark, night has fallen and it is but the morn! A sorcerer has bewitched us, this whole town is doomed!\"\n" + "\tGrue is dumbfounded by the realism on the rug you've hung in the window, he falls to his knees and cries out \"I don't want to die!!!\"\n" + "\tYou take this opportunity to slip through the door and out of the Grumpy Tavern,\n" + "\tliving to fight another day.\n\n");
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
            System.out.println("\tThe door is locked, you must have locked it in a drunken stupor.\n" +
                    "\tYou will need to find the key to unlock it.\n" +
                    "\tIs this what hell is like?");
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
