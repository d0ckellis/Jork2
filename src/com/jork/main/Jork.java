package com.jork.main;

import com.jork.items.Inventory;
import com.jork.items.Item;
import com.jork.model.Player;
import com.jork.model.SystemMessages;
import com.jork.space.Space;

import java.io.IOException;
import java.util.Scanner;
/**
 * A class to store the various methods responsible for game management
 * @author andyh
 * @author alexb
 * @version 1.5
 */
public class Jork {
    private Player player;
    private Map map;
    private Space space;
    private Inventory inventory;
    private int counter = 0;
    private static final String MOVE = "move";
    private static final String TAKE = "take";
    private static final String USE = "use";
    private static final String LOOK = "look";
    private static final String CHECK = "check";
    public static final Scanner CONSOLE = new Scanner(System.in);
/**
 * Constructor for com.jork.main.Jork
 */
    public Jork() {
    }
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Starting com.jork.main.Jork...");
        Jork jork = new Jork();
        jork.jorkRun();
    }
    /**
     * Creates {@link Setup} object,  the {@link Inventory} object and calls the gameBuilder method within
     *  as well as places the player in the starting space and begins the action() loop.
     */
    private void jorkRun () {
        System.out.println(SystemMessages.startUpTitle);
        inventory = new Inventory();
        Setup setup = new Setup();
        player = setup.buildPlayer(inventory);
        map = setup.gameBuilder();
        space = map.getCurrentSpace();
        startChapterOne();
        action(player);
    }

    private void startChapterOne() {
        System.out.println(SystemMessages.chapterOneTitle);
        System.out.println("\t" + player.name + SystemMessages.harshKnocks);
        String answer;
        do {
            System.out.print("Do you get out of bed? (Y/N)\n> ");
            answer = CONSOLE.next();
            CONSOLE.nextLine();
            if(answer.toUpperCase().charAt(0) == 'Y') {
                System.out.println(SystemMessages.outOfBed);
                System.out.println(SystemMessages.pressEnterPrompt);
                CONSOLE.nextLine();
            } else if(counter == 0){
                counter++;
                System.out.println(SystemMessages.ignoreKnocks1part1 + player.name + SystemMessages.ignoreKnocks1part2);
            } else if(counter == 1) {
                counter++;
                System.out.println(SystemMessages.ignoreKnocks2);
            } else if(counter == 2){
                System.out.println(SystemMessages.ignoreKnocks3);
                answer = "yes";
            }
        } while (answer.toUpperCase().charAt(0) != 'Y');
        System.out.println(SystemMessages.actionHelperPrompt);
    }
    /**
     * Method that asks user for game input and branches to other behavior in {@link Space} and {@link Map}
     */
    private void action(Player player) {
        String noun = "";
        String verb = "";
        String answer = "";
        do {
            System.out.print("\nEnter action:\n> ");
            answer = CONSOLE.nextLine();
            String[] inputs = answer.split(" ");
            //TODO:make varied entries for different outcomes, ie array size 1, 3, etc.
            if (inputs.length != 2) {
                System.out.print("You must specify an action and target/direction.");
                action(player);
            } else {
                verb = inputs[0];
                noun = inputs[1];
            }
            switch (verb.toLowerCase()) {
                case MOVE: space = map.move(noun);
                    if (space.getNonInvItem().equals(Item.DOOR)) {
                        if(space.yesOrNo() && inventory.hasItem(Item.KEY)) {
                            space.use(inventory, "key", player);
                        }
                    }
                    break;
                case USE: space.use(inventory, noun, player);
                    break;
                case TAKE: inventory.add(space.take(noun, player, inventory));
                    break;
                case LOOK: System.out.println(space.look(noun));
                    break;
                case CHECK: inventory.printInventory();
                    break;
                default:
                    System.out.println("You can't do that.");
            }
        } while (true);
    }
    /**
     * Empties the visible {@code Console} after every action
     * Must change command depending on os system
     */
    public void consoleWipe() throws IOException, InterruptedException {
        String systemName = System.getProperty("os.name");
        // Windows code: cls
        // Linux code: reset
        // Mac code:
        if(systemName.equals("Linux")) {
            new ProcessBuilder("reset").inheritIO().start().waitFor();
        } else if (systemName.equals("Windows")) {
            new ProcessBuilder("cls").inheritIO().start().waitFor();
        }
        //new ProcessBuilder("reset").inheritIO().start().waitFor();

        System.out.println("Console cleared!");
    }
}
