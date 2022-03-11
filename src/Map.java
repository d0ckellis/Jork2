import java.util.Scanner;

/**
 * A class for mapBuilder and using the Map object. Home for move().
 * @author alexb
 * @version 1.2
 */
public class Map {
    private final Scanner console;
    private final int startPosition;
    private final int width;
    private final int height;
    private int currentPos;
    Space[] map;

    private Map(Builder builder) {
        this.console = builder.console;
        this.startPosition = builder.startPosition;
        this.width = builder.width;
        this.height = builder.height;
        this.map = builder.map;
    }

    public int getStartPosition() {return startPosition;}

    public int getWidth() {return width;}

    public int getHeight() {return height;}

    public int getCurrentPos() {return currentPos;}

    public Space getSpace(int position) {return map[position];}

    public Space getCurrentSpace() {return map[currentPos];}

    public static class Builder {
        private final Scanner console;
        private final int startPosition;
        private final int width;
        private final int height;
        Space[] map;

        public Builder (int startPosition, int width, int height, Space[] map) {
            this.console = GameManager.CONSOLE;
            this.startPosition = startPosition;
            this.width = width;
            this.height = height;
            this.map = map;
        }
        public Map build() {
            return new Map(this);
        }
    }

    public String moveRight() {
        if (currentPos + 1 % getWidth() == 0) return "invalid";
        else currentPos++;
        return map[currentPos].getDescript();
    }
    public String moveLeft() {
        if(currentPos % getWidth() == 0) return "invalid";
        else currentPos--;
        return map[currentPos].getDescript();
    }
    public String moveUp() {
        if(currentPos - getWidth() < 0) return "invalid";
        else currentPos -= getWidth();
        return map[currentPos].getDescript();
    }
    public String moveDown() {
        if(currentPos + getWidth() >= getWidth() * getHeight()) return "invalid";
        else currentPos += getWidth();
        return map[currentPos].getDescript();
    }

}
