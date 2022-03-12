import java.util.Scanner;

/**
 * A class to store the various methods responsible for game management
 * @author andyh
 * @author alexb
 * @version 1.1
 */
public class Jork {
    private static Map map;
    private Space space;
    private Player player;
    private static String verb  = "";
    private static String noun = "";
    private static final String MOVE = "move";
    private static final String TAKE = "take";
    private static final String USE = "use";
    private static final String LOOK = "look";


    protected static final Scanner CONSOLE = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Starting Jork...");
        Setup setup = new Setup();
        map = setup.gameBuilder();
        action();

    }
    /**
     * Empties the visible {@code Console} after every action
     */
    public static void consoleWipe() {
        System.out.println("Console cleared!");
    }
    public static void action() {
        noun = "";
        verb = "";
        String answer = "";
        do {
            System.out.println("\nEnter action:\n> ");
            answer = CONSOLE.nextLine();
            String[] inputs = answer.split(" ");
            //TODO:make varied entries for different outcomes, ie array size 1, 3, etc.
            if (inputs.length != 2) {
                System.out.print("You must specify only an action and target/direction.");
                action();
            } else {
                verb = inputs[0];
                noun = inputs[1];
            }
            System.out.println(verb);
            System.out.println(noun);
            switch (verb.toLowerCase()) {
                case MOVE: map.move(verb);
                case USE:
                case TAKE:
                case LOOK: break;
                default:
                    System.out.println("You can't do that.");
                    action();
            }
        } while (true);
    }
}
