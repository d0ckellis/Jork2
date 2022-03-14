/**
 * Space class for creation of space objects which make up the Map array, and consist of the game spaces.
 * Inspired by Joshua Blochs builder design pattern @blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java
 * @author alexl
 * @version 1.2
 */
public class Space{
    private boolean hasItem = true;
    private final String describe_Space_With_Item;
    private final String describe_Space_Without_Item;
    public final Item item;
    public final Item nonInvItem;


    public Space(Builder builder) {
        this.describe_Space_With_Item = builder.describe_Space_With_Item;
        this.describe_Space_Without_Item = builder.describe_Space_Without_Item;
        this.item = builder.item;
        this.nonInvItem = builder.nonInvItem;
    }

    public boolean getHasItem() {return hasItem;}

    public void setHasItem() {hasItem = !hasItem;}

    public String getDescribe_Space_With_Item() {return describe_Space_With_Item;}

    public String getDescribe_Space_Without_Item() {return describe_Space_Without_Item;}

    public Item getItem() {return item;}

    public Item getNonInvItem() {return nonInvItem;}

    public static class Builder {
        private final String describe_Space_With_Item;
        private String describe_Space_Without_Item;
        private Item item;
        private Item nonInvItem;

        public Builder(String describe_Space_With_Item) {
            this.describe_Space_With_Item = describe_Space_With_Item;

        }

        public Builder Describe_Space_Without_Item(String describe_Space_Without_Item) {
            this.describe_Space_Without_Item = describe_Space_Without_Item;
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
        if (hasItem)  {return describe_Space_With_Item;}
        else {return describe_Space_Without_Item;}
    }

    public Item take(String noun) {
        if (noun.toUpperCase().equals(item.name()) && hasItem) {
            hasItem = false;
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
    /*
    //placeholder for use method
    public String use() {
        String string = "";
        return string;
    }
*/

}
