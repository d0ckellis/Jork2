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
    private int curPosition;
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

    public int getCurPosition() {return curPosition;}

    public static class Builder {
        private final Scanner console;
        private final int startPosition;
        private final int width;
        private final int height;
        Space[] map;

        public Builder (int startPosition, int width, int height, Space[] map) {
            this.console = Jork.CONSOLE;
            this.startPosition = startPosition;
            this.width = width;
            this.height = height;
            this.map = map;
        }
        public Map build() {
            return new Map(this);
        }
    }
    public void move() {
        System.out.println("\nWhich direction would you like to move? ");
        String direction = console.next();
        console.nextLine();
            switch(direction.toUpperCase()) {
                case "NORTH":
                case "N":
                case "UP":
                    System.out.println(moveUp());
                    break;
                case "SOUTH":
                case "S":
                case "DOWN":
                    System.out.println(moveDown());
                    break;
                case "EAST":
                case "E":
                case "RIGHT":
                    System.out.println(moveRight());
                    break;
                case "WEST":
                case "W":
                case "LEFT":
                    System.out.println(moveLeft());
                    break;
                default:
                    System.out.println("\tYou confuse yourself and wander in a circle.\n\tTry again. ");
                    move();
            }
    }
    private String moveRight() {
        if (curPosition + 1 % getWidth() == 0) invalidMove();
        else curPosition++;
        return map[curPosition].getDescript();
    }
    private String moveLeft() {
        if(curPosition % getWidth() == 0) invalidMove();
        else curPosition--;
        return map[curPosition].getDescript();
    }
    private String moveUp() {
        if(curPosition - getWidth() < 0) invalidMove();
        else curPosition-= getWidth();
        return map[curPosition].getDescript();
    }
    private String moveDown() {
        if(curPosition + getWidth() >= getWidth() * getHeight()) invalidMove();
        else curPosition+= getWidth();
        return map[curPosition].getDescript();
    }
    private void invalidMove() {
        System.out.println("\tYou run headfirst into the wall.\n\tTry Again.");
        move();
    }
}
