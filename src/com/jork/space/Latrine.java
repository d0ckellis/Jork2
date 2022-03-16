package com.jork.space;
import com.jork.items.Inventory;
import com.jork.model.Player;

public class Latrine extends Space {
    public Latrine(Builder builder) {
        super(builder);
    }
    public void use(Inventory inventory, String noun, Player player) {
        switch (noun.toUpperCase()) {
            case "JAR":
            case "LATRINE": useLatrine(player);
                break;
            default:
                super.use(inventory, noun, player);
        }
    }
    public void useLatrine(Player player) {
        if(player.getHasWetParchment()) {
            System.out.println("\tNo...no...\n" +
                    "\tYou're kidding right?\n" +
                    "\tOkay, fine.\n" +
                    "\tYou dip the parchment in the latrine. It's wet. Are you happy with yourself?\n" +
                    "\tThere had to be a better way.");
        } else {
            System.out.println("\tNot while everyone is watching.");
        }
    }
    public static class Builder extends Space.Builder{
        public Builder(String describeSpace) {
            super(describeSpace);
        }

        public Latrine build() {
            return new Latrine(this);
        }
    }
}
