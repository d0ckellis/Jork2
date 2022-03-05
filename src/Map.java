/**
 * A class for mapbuilder and using the Map object. Home for move().
 * @author alexb
 * @version 1.0
 */
public class Map {
    private int spaceID;
    Space[] map;
    private Map(Builder builder) {
        this.spaceID = builder.startPosition;
        this.map = builder.map;
    }

    public int getSpaceID() {return spaceID;}

    public static class Builder {
        private int startPosition;
        Space[] map;

        public Builder (int spaceID, Space[] spaces) {
            this.startPosition = spaceID;
            this.map = spaces;
        }
    }
    public int move() {

        return spaceID;
    }
}
