package com.jork.space;
import com.jork.items.Inventory;
import com.jork.items.Item;

public class Door extends Space {
    public Boolean isDoorOpen;


    public Door(Builder builder) {
        super(builder);
    }

    private void setIsDoorOpen() {
        if(isDoorOpen = false) {
            isDoorOpen = true;
        }
    }
    public void use(Inventory inventory) {
        //code goes here
    }
    public static class Builder extends Space.Builder{
        private String describeSpace;
        private Item item;
        private Item nonInvItem;

        public Builder(String describe_Space_With_Item) {
            super(describe_Space_With_Item);
        }

        public Door.Builder describeSpaceWithoutItem(String describeSpaceWithoutItem) {
            this.describeSpace = describeSpaceWithoutItem;
            return this;
        }

        public Door.Builder item(Item item) {
            this.item = item;
            return this;
        }

        public Door.Builder nonInvItem(Item nonInvItem) {
            this.nonInvItem = nonInvItem;
            return this;
        }

        public Door build() {
            return new Door(this);
        }
    }
}
