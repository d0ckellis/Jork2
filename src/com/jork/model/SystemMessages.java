package com.jork.model;

/**
 * A collection to hold all string objects used in game.
 * @author andyh
 * @author alexb
 * @version 1.2
 */
public class SystemMessages {
    /**
     * Strings used outside the story
     */
    public static final String startUpTitle = "Booting...\n\n\nWelcome to... \n\n\n" +
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
            "       created by Alex Black, Andy Han, Anh Ngoc Vu, and Trevor Parker\n\n";
    public static final String chapterOneTitle = "\n\n" +
            "▄████████    ▄█    █▄       ▄████████    ▄███████▄     ███        ▄████████    ▄████████       ▄██████▄  ███▄▄▄▄      ▄████████ \n" +
            "███    ███   ███    ███     ███    ███   ███    ███ ▀█████████▄   ███    ███   ███    ███      ███    ███ ███▀▀▀██▄   ███    ███ \n" +
            "███    █▀    ███    ███     ███    ███   ███    ███    ▀███▀▀██   ███    █▀    ███    ███      ███    ███ ███   ███   ███    █▀  \n" +
            "███         ▄███▄▄▄▄███▄▄   ███    ███   ███    ███     ███   ▀  ▄███▄▄▄      ▄███▄▄▄▄██▀      ███    ███ ███   ███  ▄███▄▄▄     \n" +
            "███        ▀▀███▀▀▀▀███▀  ▀███████████ ▀█████████▀      ███     ▀▀███▀▀▀     ▀▀███▀▀▀▀▀        ███    ███ ███   ███ ▀▀███▀▀▀     \n" +
            "███    █▄    ███    ███     ███    ███   ███            ███       ███    █▄  ▀███████████      ███    ███ ███   ███   ███    █▄  \n" +
            "███    ███   ███    ███     ███    ███   ███            ███       ███    ███   ███    ███      ███    ███ ███   ███   ███    ███ \n" +
            "████████▀    ███    █▀      ███    █▀   ▄████▀         ▄████▀     ██████████   ███    ███       ▀██████▀   ▀█   █▀    ██████████ \n" +
            "                                                                               ███    ███                                        \n" +
            "...the Tax Man.\n" +
            "(sometimes stories only have one chapter)\n\n";
    public static final String harshKnocks = ", after a long night of drinking at the Grumpy Tavern, \n\tyou wake up to some harsh knocks at your door.\n";
    public static final String outOfBed = "\tYou get out of bed and start looking around the room.\tYour head aches from the previous night's merriment,\n" +
        "\tIt's far too bright, you asked the innkeeper for a curtain to block the window weeks ago,\n\tbut they told you you need to pay your back rent first.\n" +
        "\tThe knocking continues...\n";
    public static final String pressEnterPrompt = "Press Enter to continue.";
    public static final String ignoreKnocks1part1 = "\tYou try and drown out the sound by burying your head under some dirty clothes you're using as a pillow.\n" +
        "\tYou tell yourself that whatever is knocking is a problem for future ";
    public static final String ignoreKnocks1part2 = ".\n\tNevertheless...the knocking persists.";
    public static final String ignoreKnocks2 = "\tUnfortunately, your tactic of merely ignoring your life's problems continues its losing streak.\n\tThe knocking persists.\n";
    public static final String ignoreKnocks3 = "\tYou must still be drunk.\n\tYou fall out of bed, despite your protestations.\n";
    public static final String actionHelperPrompt = "To act, type and enter one of the following verbs below, followed by what you want to do with that action.\n" +
            "If you have to write this down, don't worry, I'm the only one judging you.\nYou should be happy I'm even telling you this much!\n\n\tmove (Makes you move either north, south, east, or west.)\n" +
        "\tlook (Look at an object.)\n\ttake (Interact with an object.)\n\tuse (Use an item in your inventory.)\n\tcheck (Checks all items within your inventory.)\n\thelp (Brings this message back up.)\n" +
        "\tquit (Quits the game.)\n";
    public static final String welcomePlayer = ", welcome  to Jork!\nA text-based Role-Playing game\nwhere you choose your journey!\n";
    public static final String gameOver = "Your journey has now come to an end...";
    public static final String replayPrompt = "Would you like to play again? (Y/N)";
    public static final String namePrompt = "What's our hero's name?\n> ";
    public static final String perkPrompt = "Are you strong, smart, or swift?\n> ";
    public static final String quitMessage = "" +
            "  ▄██████▄     ▄████████   ▄▄▄▄███▄▄▄▄      ▄████████       ▄██████▄   ▄█    █▄     ▄████████    ▄████████\n" +
            "  ███    ███   ███    ███ ▄██▀▀▀███▀▀▀██▄   ███    ███      ███    ███ ███    ███   ███    ███   ███    ███\n" +
            " ▄███          ███    ███ ███   ███   ███  ▄███▄▄▄          ███    ███ ███    ███  ▄███▄▄▄      ▄███▄▄▄▄██▀\n" +
            "▀▀███ ████▄  ▀███████████ ███   ███   ███ ▀▀███▀▀▀          ███    ███ ███    ███ ▀▀███▀▀▀     ▀▀███▀▀▀▀▀  \n" +
            "  ███    ███   ███    ███ ███   ███   ███   ███    █▄       ███    ███ ███    ███   ███    █▄  ▀███████████\n" +
            "  ███    ███   ███    ███ ███   ███   ███   ███    ███      ███    ███ ███    ███   ███    ███   ███    ███\n" +
            "  ████████▀    ███    █▀   ▀█   ███   █▀    ██████████       ▀██████▀   ▀██████▀    ██████████   ███    ███\n" +
            "                                                                                                 ███    ███";

    /**
     * Strings used in response to actions
     */
    public static final String actionInvalid = "\t> You can't do that.";

    public static final String observeResult = "\t> You look around and see that you are in room " + /*Room id*/ ".";

    public static final String helpPrompt = "\t> To act, type and enter one of the following: \n"; //Add list of actions later

    public static final String invCheck = "\t> You check your inventory.\ncom.jork.items.Inventory: ";
    public static final String invAdd = "\t> You add the " + /*com.jork.items.Item name*/ " to your inventory";
    public static final String invUse = "\t> You use the " + /*com.jork.items.Item name*/ ".\n";

    public static final String movePrompt = "\t> To move, enter a direction (N, S, E, or W): ";
    public static final String directInvalid = "\t> You confuse yourself and wander in a circle.\nTry again: ";
    public static final String moveInvalid = "\t> You run headfirst into a wall.\nTry again: ";
    /**
     * Strings used for specific spaces
     */
    public static final String window_swordPrompt = "\tYou could try prying it open with your sword.\n" +
            "\tWould you like to do that?";
    public static final String window_opened = "\tYou take the sword from its sheath and place its pointed edge on the sill.\n" +
            "\tPutting your weight against it, you wedge the blade underneath the window.\n" +
            "\tIt opens, finally making this room up to fire code.\n" +
            "\tDo you jump out the window?";
    public static final String window_death = "Your pants get caught on the latch, you fall to your death.";
    public static final String window_hangedRug = "\tYou drape the rug across the window, pinning it with nails, hammering them into the wall with the hilt of your sword.\n" +
            "\tNothing like a little renovation to ease your headache.\n" +
            "\tYou can see things in the room much better now.";
    public static final String armoire_glintSeen = "\tYou see a glint of gold in the mirror.\n" +
            "\tThere is something on the desk behind you,\n" +
            "\tthat you couldn't have noticed without looking through the mirror.";
    public static final String td_open = "\tYour strength allows you to lift the heavy door open\n" +
            "\trevealing a small compartment underneath.\n" +
            "\tYou wipe away the cobwebs to reveal an antique neckless bejewled and made of silver.\n" +
            "\tSomething about it feels magical.";
    public static final String latrine_dip = "\tNo...no...\n" +
            "\tYou're kidding right?\n" +
            "\tOkay, fine.\n" +
            "\tYou dip the parchment in the latrine. It's wet. Are you happy with yourself?\n" +
            "\tThere had to be a better way.";
    public static final String door_opened = "\tYou open the door to see a tall serious Half-Orc standing before you.\n" +
            "\tHe introduces himself as Grue. You don't like Grue.\n\n" + "\t\"I'm the Count's tax collector\" he says, with a toothsome smile.\n" +
            "\tYou wonder if you might be eaten by Grue. He does look hungry.\n" + "\tHe informs you that your tax evasion escapade has now come to an end.\n" +
            "\tYou owe the Count some (many) coin and he wants your debts paid in full.\n\n" + "\tYou regret opening the door. You wish you could crawl back into bed and return to your hangover,\n" +
            "\tbut you can't. Realty is staring you in the face, and it hasn't brushed it's teeth in some time.\n\n" + "\tWhat will you do? You could fight him, or perhaps outwit him.\n" +
            "\t(Enter fight or outwit):";
    public static final String door_fight = "\tYou feint adjusting your cloak, and instead draw your family sword.\n" +
            "\tThe sword doesn't have a name, but you figure you'll name it 'Grue' in memoriam.\n" +
            "\tYou plunge 'Grue' into Grue's chest, confirming that it is indeed all about HOW you use it.\n" + "\tThe blow strikes true, and Grue, is through.\n" +
            "\t\uD835\uDE1A\uD835\uDE26\uD835\uDE33\uD835\uDE2A\uD835\uDE30\uD835\uDE36\uD835\uDE34\uD835\uDE2D\uD835\uDE3A, " +
            "\uD835\uDE33\uD835\uDE29\uD835\uDE3A\uD835\uDE2E\uD835\uDE2A\uD835\uDE2F\uD835\uDE28 \uD835\uDE22\uD835\uDE35 \uD835\uDE22 " +
            "\uD835\uDE35\uD835\uDE2A\uD835\uDE2E\uD835\uDE26 \uD835\uDE2D\uD835\uDE2A\uD835\uDE2C\uD835\uDE26 \uD835\uDE35\uD835\uDE29\uD835\uDE2A\uD835\uDE34?\n" +
            "\tYou don't have time to grab your things, you scramble out the door, and furthermore the Grumpy Inn,\n" + "\tliving to fight another day.\n\n";
    public static final String door_wit = "\n\tYou don't think you'll manage trying to kill Grue in combat,\n" + "\ta fair assumption seeing as he's a Half-Orc and you're, well, you're you.\n" +
            "\tHowever, Grue is definitely a few clowns short of a circus. Not that you've ever been.\n\n" +
            "\tInstead, remembering that Half-Orcs are some of the most gullible people with opposable thumbs, you lie to him.\n" +
            "\tHe's about to drag you out by your neck, when you point to the window and exclaim,\n" + "\t\"Hark, night has fallen and it is but the morn! A sorcerer has bewitched us, this whole town is doomed!\"\n" +
            "\tGrue is dumbfounded by the realism on the rug you've hung in the window, he falls to his knees and cries out \"I don't want to die!!!\"\n" +
            "\tYou take this opportunity to slip through the door and out of the Grumpy Tavern,\n" + "\tliving to fight another day.\n\n";
    public static final String door_locked = "\tThe door is locked, you must have locked it in a drunken stupor.\n" +
            "\tYou will need to find the key to unlock it.\n\tIs this what hell is like?";
    /**
     * Messages used in the storyline
     */
    public static final String prologue_Start = /*com.jork.model.Player name*/ ", after a long night of drinking at the Grumpy Tavern, \n" +
            "you wake up to some harsh knocks at your door.\n\n\n";
    public static final String prologue_bedChoice = "Get out of bed? (Y/N)";
    public static final String prologue_bedChoice_Y = "\nYou get out of bed and start looking around the room.\n" +
            "Your head aches from the previous night's merriment,\n" +
            "the knocking continues...\n";
    public static final String prologue_N = "The knocking persists. ";
    public static final String prologue_endChoice = "At the door, you see a tall serious man\n" +
            "who introduces himself as the King’s tax collector.\n" +
            "He informs you that your tax evasion escapade has now come to an end.\n" +
            "You owe the King some (many) coin and he wants your debts paid in full.\n" +
            "Knowing that you can’t pay them, the man offers you some work for the King\n" +
            "so you can earn back what you owe.\n" +
            "Do you accept his offer? \n";
    public static final String prologue_endChoice_Y = "";
    public static final String prologue_endChoice_N = "Refusing his offer means you will go to jail for your debts.\n" +
            "You could try to fight for your freedom";

}
