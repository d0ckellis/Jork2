package com.jork.space;
import com.jork.items.Inventory;
import com.jork.items.Item;
import com.jork.main.Jork;
import com.jork.model.Player;

/**
 * com.jork.space class for creation of space objects which make up the com.jork.main.Map array, and consist of the game spaces.
 * Inspired by Joshua Blochs builder design pattern @blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java
 * @author alexl
 * @version 1.2
 */
public class Space {
    private boolean itemAvailable = true;
    private final String describeSpace;
    private final String describeSpaceWithoutItem;
    public final Item item;
    public final Item nonInvItem;


    public Space(Builder builder) {
        this.describeSpace = builder.describeSpace;
        this.describeSpaceWithoutItem = builder.describeSpaceWithoutItem;
        this.item = builder.item;
        this.nonInvItem = builder.nonInvItem;
    }


    public boolean isItemAvailable() {return itemAvailable;}

    public void setHasItem() {
        itemAvailable = !itemAvailable;}

    public String getDescribeSpace() {return describeSpace;}

    public String getDescribeSpaceWithoutItem() {return describeSpaceWithoutItem;}

    public Item getItem() {return item;}

    public Item getNonInvItem() {return nonInvItem;}

    public static class Builder {
        private final String describeSpace;
        private String describeSpaceWithoutItem;
        private Item item;
        private Item nonInvItem;

        public Builder(String describeSpace) {
            this.describeSpace = describeSpace;
        }

        public Builder describeSpaceWithoutItem(String describeSpaceWithoutItem) {
            this.describeSpaceWithoutItem = describeSpaceWithoutItem;
            return this;
        }

        public Builder item(Item item) {
            this.item = item;
            return this;
        }

        public Builder nonInvItem(Item nonInvItem) {
            this.nonInvItem = nonInvItem;
            return this;
        }

        public Space build() {
            return new Space(this);
        }
    }

    public String getSpaceDescription() {
        if (itemAvailable)  {return describeSpace;}
        else {return describeSpaceWithoutItem;}
    }

    public Item take(String noun) {
        if (noun.toUpperCase().equals(item.name()) && itemAvailable) {
            itemAvailable = false;
            return item;
        } else {
            return Item.EMPTY;
        }
    }
    public String look(String noun) {
        if (noun.toUpperCase().equals(item.name())) {
            return item.getValidDescription();
        } else if (noun.toUpperCase().equals(nonInvItem.name())) {
            return nonInvItem.getValidDescription();
        } else return "\tNot much more to that.";
    }
    //placeholder for use method
    public void use(Inventory inventory, String noun, Player player) {
        System.out.println("failed");
    }
    public Boolean yesOrNo() {
        String answer = Jork.CONSOLE.next();
        Jork.CONSOLE.nextLine();
        return answer.toUpperCase().charAt(0) == 'Y';
    }
}
