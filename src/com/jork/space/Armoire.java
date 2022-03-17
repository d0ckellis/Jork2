package com.jork.space;
import com.jork.items.Inventory;
import com.jork.model.Player;

import java.util.Random;

public class Armoire extends Space {

    public Armoire(Space.Builder builder) {
        super(builder);
    }

    public void use(Inventory inventory, String noun, Player player) {
        switch (noun.toUpperCase()) {
            case "MIRROR":
            case "ARMOIRE": useMirror(player);
                break;
            default: super.use(inventory, noun, player);
        }
    }

    public void useMirror(Player player) {
        if (!player.getHasSeenGlint()) {
            int result = new Random().nextInt(20) + 1 + player.getIntelligence();
            if (result > 14) {
                player.setHasSeenGlint();
                System.out.println("\tYou see a glint of gold in the mirror.\n" +
                        "\tThere is something on the desk behind you,\n" +
                        "\tthat you couldn't have noticed without looking through the mirror.");
            } else {
                System.out.println("\tYour reflection doesn't look right. You weren't this ugly the last time you checked.");
            }
        } else {
            System.out.println("\tYou still see a glint of gold in the mirror.\n" +
                    "\tPerhaps your spatial awareness isn't all that great after a night of drinking, \n" +
                    "\tbut I'll give you a hint. It's on the desk.");
        }
    }

    public static class Builder extends Space.Builder{
        public Builder(String describeSpace) {
            super(true, describeSpace);
        }

        public Armoire build() {
            return new Armoire(this);
        }
    }
}
