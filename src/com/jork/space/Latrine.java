package com.jork.space;
import com.jork.items.Inventory;
import com.jork.model.Player;
import com.jork.model.SystemMessages;

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
            System.out.println(SystemMessages.latrineDip);
        } else {
            System.out.println("\tNot while everyone is watching.");
        }
    }
    public static class Builder extends Space.Builder{
        public Builder(String describeSpace) {
            super(true, describeSpace);
        }

        public Latrine build() {
            return new Latrine(this);
        }
    }
}
