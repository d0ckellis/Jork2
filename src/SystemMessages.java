/**
 * A collection to hold all string objects used in game.
 * @author andyh
 * @author alexb
 * @version 1.1
 */
public class SystemMessages {
    /**
     * Strings used outside the story
     */
    public String startUp = "Booting...\n\n\nWelcome to \n\n\n" +
            "    ▄█  ▄██████▄     ▄████████    ▄█   ▄█▄\n" +
            "    ███ ███    ███   ███    ███   ███ ▄███▀\n" +
            "    ███ ███    ███   ███    ███   ███▐██▀  \n" +
            "    ███ ███    ███  ▄███▄▄▄▄██▀  ▄█████▀   \n" +
            "    ███ ███    ███ ▀▀███▀▀▀▀▀   ▀▀█████▄   \n" +
            "    ███ ███    ███ ▀███████████   ███▐██▄  \n" +
            "    ███ ███    ███   ███    ███   ███ ▀███▄\n" +
            "█▄ ▄███  ▀██████▀    ███    ███   ███   ▀█▀\n" +
            "▀▀▀▀▀▀               ███    ███   ▀        \n" +
            "                \n" +
            "       created by Alex Black, Andy Han, Anh Ngoc Vu, and Trevor Parker\n\n" +
            "       A text-based Role-Playing game where you choose your journey!";
    public String gameOver = "Your journey has now come to an end...";
    public String replayPrompt = "Would you like to play again? (Y/N)";

    public String namePrompt = "What's our hero's name?";
    public String perkPrompt = /*Player name*/ ", are you string, smart, or swift?";
    public String perk_noAnswer = "Surely, you're good at ONE thing?";

    /**
     * Strings used in response to actions
     */
    public String actionInvalid = "\t> You can't do that.";

    public String observeResult = "\t> You look around and see that you are in room " + /*Room id*/ ".";

    public String helpPrompt = "\t> To act, type and enter one of the following: \n"; //Add list of actions later

    public String invCheck = "\t> You check your inventory.\nInventory: ";
    public String invAdd = "\t> You add the " + /*Item name*/ " to your inventory";
    public String invUse = "\t> You use the " + /*Item name*/ ".\n";

    public String movePrompt = "\t> To move, enter a direction (N, S, E, or W): ";
    public String directInvalid = "\t> You confuse yourself and wander in a circle.\nTry again: ";
    public String moveInvalid = "\t> You run headfirst into a wall.\nTry again: ";
    /**
     * Messages used in the storyline
     */
    public String prologue_Start = /*Player name*/ ", after a long night of drinking at the Grumpy Tavern, \n" +
            "you wake up to some harsh knocks at your door.\n\n\n";
    public String prologue_bedChoice = "Get out of bed? (Y/N)";
    public String prologue_bedChoice_Y = "\nYou get out of bed and start looking around the room.\n" +
            "Your head aches from the previous night's merriment,\n" +
            "the knocking continues...\n";
    public String prologue_N = "The knocking persists. ";
    public String prologue_endChoice = "At the door, you see a tall serious man\n" +
            "who introduces himself as the King’s tax collector.\n" +
            "He informs you that your tax evasion escapade has now come to an end.\n" +
            "You owe the King some (many) coin and he wants your debts paid in full.\n" +
            "Knowing that you can’t pay them, the man offers you some work for the King\n" +
            "so you can earn back what you owe.\n" +
            "Do you accept his offer? \n";
    public String prologue_endChoice_Y = "";
    public String prologue_endChoice_N = "Refusing his offer means you will go to jail for your debts.\n" +
            "You could try to fight for your freedom";

}
