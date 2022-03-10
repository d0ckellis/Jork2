/**
 * Space class for creation of space objects which make up the Map array, and consist of the game spaces.
 * Inspired by Joshua Blochs builder design pattern @blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java
 * @author alexl
 * @version 1.2
 */
public class Space{
    private boolean hasItem;
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
    private final Item item;

    private Space(Builder builder) {
        this.hasItem = builder.hasItem;
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

    public static class Builder {
        private final boolean hasItem;
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

        public Builder(Boolean hasItem, String description) {
            this.hasItem = hasItem;
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
        public Space build() {
            return new Space(this);
        }
    }

    public String printDescript() {
        if (!hasItem)  return description;
        else return descriptHasItem;
    }

    //placeholder for take method
    /*public String take() {
        String string = "";
        return string;

    }
    //placeholder for use method
    public String use() {
        String string = "";
        return string;
    }

    //placeholder for look method
    public String look() {
        String string = "";
        return string;
    }
    */
}
