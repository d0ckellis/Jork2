/**
 * Space class for creation of space objects which make up the Map array, and consist of the game spaces.
 * Inspired by Joshua Blochs builder design pattern @blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java
 * @author alexl
 * @version 1.2
 */
public class Space{
    private boolean hasItem = true;
    private final String description;
    private final String descriptHasItem;
    private final String descriptNoSecondItem;
    private final String descriptHasSecondItem;
    private final String descriptNoThirdItem;
    private final String descriptHasThirdItem;
    private final String descriptNonInventoryItem;
    private final String descriptSecondNonInventoryItem;
    private final String descriptThirdNonInventoryItem;
    private final String descriptUsingItem;
    private final String descripteUsingSecondItem;
    public final Item item;
    public final Item nonInvItem;

    private Space(Builder builder) {
        this.description = builder.description;
        this.descriptHasItem = builder.descriptHasItem;
        this.descriptNoSecondItem = builder.descriptNoSecondItem;
        this.descriptHasSecondItem = builder.descriptHasSecondItem;
        this.descriptNoThirdItem = builder.descriptNoThirdItem;
        this.descriptHasThirdItem = builder.descriptHasThirdItem;
        this.descriptNonInventoryItem = builder.descriptNonInventoryItem;
        this.descriptSecondNonInventoryItem = builder.descriptSecondNonInventoryItem;
        this.descriptThirdNonInventoryItem = builder.descriptThirdNonInventoryItem;
        this.descriptUsingItem = builder.descriptUsingItem;
        this.descripteUsingSecondItem = builder.descriptUsingSecondItem;
        this.item = builder.item;
        this.nonInvItem = builder.nonInvItem;
    }

    public boolean getHasItem() {return hasItem;}

    public void setHasItem() {hasItem = !hasItem;}

    public String getDescription() {return description;}

    public String getDescriptHasItem() {return descriptHasItem;}

    public String getDescriptNoSecondItem() {return descriptNoSecondItem;}

    public String getDescriptHasSecondItem() {return descriptHasSecondItem;}

    public String getDescriptNoThirdItem() {return descriptNoThirdItem;}

    public String getDescriptHasThirdItem() {return descriptHasThirdItem;}

    public String getDescriptNonInventoryItem() {return descriptNonInventoryItem;}

    public String getDescriptSecondNonInventoryItem() {return descriptSecondNonInventoryItem;}

    public String getDescriptThirdNonInventoryItem() {return descriptThirdNonInventoryItem;}

    public String getDescriptUsingItem() {return descriptUsingItem;}

    public String getDescripteUsingSecondItem() {return descripteUsingSecondItem;}

    public Item getItem() {return item;}

    public Item getNonInvItem() {return nonInvItem;}

    public static class Builder {
        private final String description;
        private String descriptHasItem;
        private String descriptNoSecondItem;
        private String descriptHasSecondItem;
        private String descriptNoThirdItem;
        private String descriptHasThirdItem;
        private String descriptNonInventoryItem;
        private String descriptSecondNonInventoryItem;
        private String descriptThirdNonInventoryItem;
        private String descriptUsingItem;
        private String descriptUsingSecondItem;
        private Item item;
        private Item nonInvItem;

        public Builder(String description) {
            this.description = description;
        }

        public Builder descriptHasItem(String descriptHasItem) {
            this.descriptHasItem = descriptHasItem;
            return this;
        }

        public Builder descriptNoSecondItem(String descriptNoSecondItem) {
            this.descriptNoSecondItem = descriptNoSecondItem;
            return this;
        }

        public Builder descriptHasSecondItem(String descriptHasSecondItem) {
            this.descriptHasSecondItem = descriptHasSecondItem;
            return this;
        }

        public Builder descriptNoThirdItem(String descriptNoThirdItem) {
            this.descriptNoThirdItem = descriptNoThirdItem;
            return this;
        }

        public Builder descriptHasThirdItem(String descriptHasThirdItem) {
            this.descriptHasThirdItem = descriptHasThirdItem;
            return this;
        }

        public Builder descriptNonInventoryItem(String descriptNonInventoryItem) {
            this.descriptNonInventoryItem = descriptNonInventoryItem;
            return this;
        }

        public Builder descriptSecondNonInventoryItem(String descriptSecondNonInventoryItem) {
            this.descriptSecondNonInventoryItem = descriptSecondNonInventoryItem;
            return this;
        }

        public Builder descriptThirdNonInventoryItem(String descriptThirdNonInventoryItem) {
            this.descriptThirdNonInventoryItem = descriptThirdNonInventoryItem;
            return this;
        }

        public Builder descriptUsingItem(String descriptUsingItem) {
            this.descriptUsingItem = descriptUsingItem;
            return this;
        }

        public Builder descriptUsingSecondItem(String descriptUsingSecondItem) {
            this.descriptUsingSecondItem = descriptUsingSecondItem;
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

    public String getDescript() {
        if (hasItem)  {return description;}
        else {return descriptHasItem;}
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
