import java.util.Scanner;

/**
 * A class for mapBuilder and using the Map object. Home for move().
 * @author alexb
 * @version 1.2
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
        Space[] map;

        public Builder (int startPosition, int width, int height, Space[] map) {
            this.startPosition = startPosition;
            this.width = width;
            this.height = height;
            this.map = map;
        }
    }
    public void move() {
    }
    public int moveRight() {
        if (curPosition + 1 % width == 0) invalidMove();
        else curPosition++;
        return curPosition;
    }
    public int moveLeft() {
        if(curPosition % width == 0) invalidMove();
        else curPosition--;
        return curPosition;
    }
    public int moveUp() {
        if(curPosition - width < 0) invalidMove();
        else curPosition-= width;
        return curPosition;
    }
    public int moveDown() {
        if(curPosition + width >= width * height) invalidMove();
        else curPosition+= width;
        return curPosition;
    }
    public void invalidMove() {
        System.out.println("\tYou run headfirst into the wall.\n\tTry Again.");
        move();
    }
}
