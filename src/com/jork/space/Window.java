package com.jork.space;
import com.jork.items.Inventory;
import com.jork.items.Item;
import com.jork.model.Player;
import com.jork.model.SystemMessages;

public class Window extends Space {

    private Boolean isWindowOpen = false;

    public Boolean isRugHung = false;

    public Window(Builder builder) {
        super(builder);
    }

    private Boolean getWindowOpen() {
        return isWindowOpen;
    }

    private void setIsWindowOpen() {
        if(isWindowOpen = false) {
            isWindowOpen = true;
        }
    }

    public Boolean getRugHung() {
        return isRugHung;
    }

    public void setIsRugHung() {
        if(isRugHung = false) {
            isRugHung = true;
        }
    }

    public void use(Inventory inventory, String noun, Player player) {
        switch (noun.toUpperCase()) {
            //TODO: change to enums
            case "WINDOW":
            case "SWORD": useWindow(inventory);
                break;
            case "NAILS": useNails(inventory);
                break;
            case "RUG": useRug(inventory);
                break;
            default:
                super.use(inventory, noun, player);
        }
    }

    public void useWindow(Inventory inventory) {
        if (!isWindowOpen) {
            System.out.println("\tThe window is painted shut.\n");
            if (inventory.hasItem(Item.SWORD)) {
                System.out.println(SystemMessages.window_swordPrompt);
                setIsWindowOpen();
                if (yesOrNo()) {
                    System.out.println(SystemMessages.window_opened);
                    if (yesOrNo()) {
                        System.out.println(SystemMessages.window_death);
                        //end game somehow
                        System.out.println(SystemMessages.quitMessage);
                        System.exit(0);
                    }
                }
            }
        }
    }
    public void useNails(Inventory inventory) {
        if(inventory.hasItem(Item.RUG) && inventory.hasItem(Item.NAILS)) {
            if(inventory.hasItem(Item.SWORD)) {
                inventory.remove(Item.NAILS);
                inventory.remove(Item.RUG);
                setIsRugHung();
                System.out.println(SystemMessages.window_hangedRug);
            } else {
                System.out.println("\tYou need something to hammer them with. You're hard-headed, but not that hard.");
            }
        } else {
            System.out.println("\tYou need something to nail down.");
        }
    }
    public void useRug(Inventory inventory) {
        if(inventory.hasItem(Item.SWORD) && inventory.hasItem(Item.NAILS) && inventory.hasItem(Item.SWORD)) {
            inventory.remove(Item.NAILS);
            inventory.remove(Item.RUG);
            setIsRugHung();
            System.out.println(SystemMessages.window_hangedRug);
        }
    }

    public static class Builder extends Space.Builder{
        public Builder(String describeSpace) {
            super(false, describeSpace);
        }

        public Window build() {
            return new Window(this);
        }
    }
}

