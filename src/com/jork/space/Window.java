package com.jork.space;
import com.jork.items.Inventory;
import com.jork.items.Item;

public class Window extends Space {
    private Boolean isWindowOpen = false;

    public Window(Builder builder) {
        super(builder);
    }
    public void use(Inventory inventory, String noun) {
        switch (noun.toUpperCase()) {
            case "WINDOW": useWindow(inventory);
                break;
            case "NAILS": useNails(inventory);
                break;
            case "RUG":
                break;
            case "SWORD":
                break;
            default:
                super.use();
        }
        //code goes here
        /*if(noun.toUpperCase().equals(nonInvItem.name())) {
            if (inventory.hasItem(Item.SWORD)) {
                System.out.println("\tThe window is painted shut,\n" +
                        "\tYou could try prying it open with your sword.\n" +
                        "\tWould you like to do that?");
                String answer = Jork.CONSOLE.next();


            } else {
                System.out.println("\tThe window is painted shut,\n" +
                        "\tit hasn't opened once in the four months you've been at the extended stay Grumpy Tavern & Inn.");
                        */
    }
    private void setIsWindowOpen() {
        if(isWindowOpen = false) {
            isWindowOpen = true;
        }
    }
    public void useWindow(Inventory inventory) {
        if (!isWindowOpen) {
            System.out.println("\tThe window is painted shut.\n");
            if (inventory.hasItem(Item.SWORD)) {
                System.out.println("\tYou could try prying it open with your sword.\n" +
                        "\tWould you like to do that?");
                setIsWindowOpen();
                if (yesOrNo()) {
                    System.out.println("\tYou take the sword from its sheath and place its pointed edge on the sill.\n" +
                            "\tPutting your weight against it, you wedge the blade underneath the window.\n" +
                            "\tIt opens, finally making this room up to fire code.\n" +
                            "\tDo you jump out the window?");
                    if (yesOrNo()) {
                        System.out.println("Your pants get caught on the latch, you fall to your death.");
                        //end game somehow
                    }
                }
            }
        }
    }
    public void useNails(Inventory inventory) {
        if(inventory.hasItem(Item.RUG)) {
            if(inventory.hasItem(Item.SWORD)) {
                inventory.remove(Item.NAILS);
                inventory.remove(Item.RUG);
                System.out.println("\tYou drape the rug across the window, pinning it with nails, hammering them into the wall with the hilt of your sword.\n" +
                        "\tNothing like a little renovation to ease your headache.\n" +
                        "\tYou can see things in the room much better now.");
            } else {
                System.out.println("\tYou need something to hammer them with. You're hard-headed, but not that hard.");
            }
        } else {
            System.out.println("\tYou need something to nail down.");
        }
    }
    public void useRug(Inventory inventory) {

    }
}

