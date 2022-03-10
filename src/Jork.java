import java.util.Scanner;

/**
 * The main program that runs the {@link GameManager}
 * @author andyh
 * @author alexl
 * @version 1.1
 */
public class Jork {
    protected static final Scanner CONSOLE = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Starting Jork...");
        GameManager gameManager = new GameManager();
    }
}
