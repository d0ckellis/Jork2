public class Map {
    private int spaceID;
    Space[] spaces;
    private Map(Builder builder) {
        this.spaceID = builder.spaceID;
        this.spaces = builder.spaces;
    }

    public int getSpaceID() {return spaceID;}

    public static class Builder {
        private int spaceID;
        Space[] spaces;

        public Builder (int spaceID, Space[] spaces) {
            this.spaceID = spaceID;
            this.spaces = spaces;
        }
    }
    public int move() {

        return spaceID;
    }
}
