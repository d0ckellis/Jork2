import java.util.Scanner;

/**
 * A class to store the various strings to be printed into the console.
 * @author andyh
 * @author alexb
 * @version 1.1
 */
public class GameManager {
    private final Scanner console;
    private final Map map;
    private final Player player;
    private final Space space;
    public String startUp = "Booting...\nWelcome to Jork!\nA text-based Role-Playing game where you choose your journey!";
    public String gameOver = "Your journey has now come to an end...";
    public String namePrompt = "What's our hero's name?";
    public String perkPrompt = "";

    public GameManager(Scanner console, Map map, Player player, Space space) {
        this.console = console;
        this.map = map;
        this.player = player;
        this.space = space;
    }

    /**
     * Empties the visible {@code Console} after every action
     */
    public static void consoleWipe() {
        System.out.println("Console cleared!");
    }
    public void action() {
        String verb;
        String noun;
        do{
            System.out.println("\nEnter action:\n> ");
            verb = console.next();
            noun = console.next();
            console.nextLine();
            switch (verb.toLowerCase()) {
                case "move":


            }
        } while(true);
    }
    public Setup startSetup() {
        Setup setup = new Setup();
        setup.gameBuilder(console);
        return setup;
    }
}
