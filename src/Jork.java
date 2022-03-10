import java.util.Scanner;

/**
 * The main program that runs the {@link GameManager}
 * @author andyh
 * @author alexl
 * @version 1.1
 */
public class Jork {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Starting Jork...");
        Setup setup = new Setup();
        setup.gameBuilder(console);

    }
}
