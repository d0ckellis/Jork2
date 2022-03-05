/**
 * A class for mapbuilder and using the Map object. Home for move().
 * @author alexb
 * @version 1.0
 */
public class Map {
    private final int startPosition;
    private final int width;
    private final int height;
    private int curPosition;
    Space[] map;

    private Map(Builder builder) {
        this.startPosition = builder.startPosition;
        this.width = builder.width;
        this.height = builder.height;
        this.curPosition = builder.curPosition;
        this.map = builder.map;
    }

    public int getStartPosition() {return startPosition;}

    public int getWidth() {return width;}

    public int getHeight() {return height;}

    public int getCurPosition() {return curPosition;}

    public static class Builder {
        private final int startPosition;
        private final int width;
        private final int height;
        private int curPosition;
        Space[] map;

        public Builder (int startPosition, int width, int height, int curPosition, Space[] map) {
            this.startPosition = startPosition;
            this.width = width;
            this.height = height;
            this.curPosition = curPosition;
            this.map = map;
        }
    }
    public void move() {

    }
    public int moveRight() {
        if (curPosition + 1 % width == 0) {
            invalidMove();
        } else curPosition++;
        return curPosition;
    }
    public void invalidMove() {
        System.out.println("\tYou run headfirst into the wall.\n\tTry Again.");
    }
}
