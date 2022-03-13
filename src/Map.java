import java.util.Scanner;

import static java.awt.desktop.UserSessionEvent.Reason.CONSOLE;

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
    public void move(String verb) {
        switch(verb.toUpperCase()) {
            case "NORTH":
            case "N":
            case "UP":
                System.out.println(moveUp(verb));
                break;
            case "SOUTH":
            case "S":
            case "DOWN":
                System.out.println(moveDown(verb));
                break;
            case "EAST":
            case "E":
            case "RIGHT":
                System.out.println(moveRight(verb));
                break;
            case "WEST":
            case "W":
            case "LEFT":
                System.out.println(moveLeft(verb));
                break;
            default:
                System.out.println("\tYou confuse yourself and wander in a circle.\n\tTry again. ");
                System.out.println("\nWhich direction would you like to move? ");
                verb = Jork.CONSOLE.next();
                Jork.CONSOLE.nextLine();
                move(verb);
        }
    }
    //TODO: Fix bug in move right expression. It isnt preventing teleporting as it should, and allows arrayindexoutofbounds exception
    private String moveRight(String verb) {
        if (currentPos + 1 % getWidth() == 0) return invalidMove(verb);
        else currentPos++;
        System.out.println(currentPos);
        return map[currentPos].getDescript();
    }
    private String moveLeft(String verb) {
        if(currentPos % getWidth() == 0) return invalidMove(verb);
        else currentPos--;
        System.out.println(currentPos);
        return map[currentPos].getDescript();
    }
    private String moveUp(String verb) {
        if(currentPos - getWidth() < 0) return invalidMove(verb);
        else currentPos -= getWidth();
        System.out.println(currentPos);
        return map[currentPos].getDescript();
    }
    private String moveDown(String verb) {
        if(currentPos + getWidth() >= getWidth() * getHeight()) return invalidMove(verb);
        else currentPos += getWidth();
        System.out.println(currentPos);
        return map[currentPos].getDescript();
    }
    private String invalidMove(String verb) {
        return "\tYou run headfirst into the wall.\n\tTry Again.";
    }
}
