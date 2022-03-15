package com.jork.items;

/**
 * An enumeration for items to be stored in the {@link Inventory#inventory} {@code HashMap}.
 * @author jaspersn
 * @author alexb
 * @version 1.2
 */
public enum Item {

    /**
     * Sword
     */
    SWORD("SWORD", false,"\tA family heirloom that never looses it's edge.\n" +
            "\tIt's gotten you out of a few tricky situations, best not sell it.", "\tA family heirloom that never looses it's edge.\n" +
            "\tIt's gotten you out of a few tricky situations, best not sell it."),
    /**
     * Rug
     */
    RUG("RUG", false, "\tIt's a shabby rug, that is embroidered to look like the night sky,\n" +
            "\tThe realism is striking in fact.\n" +
            "\tWould probably block out the sun well enough, ironically.", "\tIt's a shabby rug, that is embroidered to look like the night sky,\n" +
            "\tThe realism is striking in fact.\n" +
            "\tWould probably block out the sun well enough, ironically."),
    /**
     * Nails
     */
    NAILS("NAILS", false,"\tTwo nails have been protruding out from a floorboard, just begging for you to fix them.\n" +
            "\tOr at the very least, pull them up.", "\tThese rusty nails have wreaked havoc on your shoes for the last time, now they'll just wreak havoc on your pockets."),
    /**
     * Potion
     */
    POTION("POTION", false,"\tYou're pretty sure you left one somewhere in here.", "\tIt's a potion of infinite enhancement.\n" +
            "\tYou won it in a game of chance last night, or was it the night before?\n" +
            "\tEither way, it's probably not FDA approved, but it could be useful later on!"),
    /**
     * Key
     */
    KEY("KEY", false,"\tWhere the hell did you put it?", "\tIf you need me to explain to you what this does, we have real problems,\n" +
            "\tbigger than this game."),
    /**
     * Parchment
     */
    PARCHMENT("PARCHMENT", false,"\tYou'll have to get closer to examine that,\n" +
            "\tyou haven't had vision in the two digits since grade school.", "\tThe parchment is blank as far as you can tell\n" +
            "\tYou wonder if it might serve you in future."),
    /**
     * Cloak
     */
    CLOAK("CLOAK", false,"\tIt's haphazardly thrown on the chair, exactly where you left it,\n" +
            "\tlike all the things in this pigsty of a room.", "\tIt's full of holes, but for some reason this town has a no cloak, no boots, no service policy, so you keep wearing it."),
    /**
     * Marker
     */
    MARKER("MARKER", false,"\tWhat marker? It's too bright to see that far away.", "\tThere are instructions on the back of the box.\n" +
            "\t\"Write secret invisible messages that can only be seen when wet!\"\n" +
            "\t\"A perfect gift for ages 4-12.\"\n" +
            "\tYou're 30, and this was a stocking stuffer your mom gave you last year."),
    /**
     * Necklace
     */
    NECKLACE("NECKLACE", false,"\tYou haven't owned a necklace since Puka shell necklaces went out of style.", "\tAn antique neckless bejewled and made of silver.\n" +
            "\tSomething about it feels magical."),
    /**
     * com.jork.items.Item value when there is no item.
     *
     */
    EMPTY("EMPTY", false,"empty", "empty"),
    /**
     * com.jork.space.Window
     */
    WINDOW("WINDOW", false, "\tThe window is painted shut, it would likely take a good deal of strength to open.", "\tThe window is painted shut, it would likely take a good deal of strength to open."),
    /**
     * Room
     */
    ROOM("ROOM", false, "\tThe room is quaint, just what you can afford.\n" +
            "\tFrom here it looks like everything is as you left it...dirty.", "\tThe room is quaint, just what you can afford.\n" +
            "\tFrom here it looks like everything is as you left it...dirty."),
    /**
     * Bed
     */
    BED("BED", false,  "\tYour bedsheets haven't been washed in awhile,\n" +
            "\tthe help at the inn was laid off last month, you keep reminding yourself.\n" +
            "\tEven though when there was help, you were still responsible for tidying up on your own.\n" +
            "\tAlas, you've nested atop a pile of your own clothing.\n" +
            "\tYou should count your blessings you have more than one set of clothes.",  "\tYour bedsheets haven't been washed in awhile,\n" +
            "\tthe help at the inn was laid off last month, you keep reminding yourself.\n" +
            "\tEven though when there was help, you were still responsible for tidying up on your own.\n" +
            "\tAlas, you've nested atop a pile of your own clothing.\n" +
            "\tYou should count your blessings you have more than one set of clothes."),
    /**
     * com.jork.space.Door
     */
    DOOR("DOOR", false, "\tThe wooden door to you room seems so far away from here.\n" +
            "\tYet the knocking, you swear, could be coming from inside your head.", "\tThe wooden door to you room seems so far away from here.\n" +
            "\tYet the knocking, you swear, could be coming from inside your head."),
    /**
     * Nightstand
     */
    NIGHTSTAND("NIGHTSTAND", false,"\tIt's old and made of wood. What more is there to know?", "\tIt's old and made of wood. What more is there to know?" ),
    /**
     * Desk
     */
    DESK("DESK", false, "Let's just say you never won any superlatives for \"Best Organized\".", "Let's just say you never won any superlatives for \"Best Organized\"."),
    /**
     * Bookshelf
     */
    BOOKSHELF("BOOKSHELF", false, "", ""),
    /**
     * com.jork.space.Latrine
     */
    LATRINE("LATRINE", false, "Gross", "Holding it didn't make it any less gross"),
    /**
     * Trapdoor
     */
    TRAPDOOR("TRAPDOOR", false, "You don't see that.","\tThe trapdoor that was underneath the rug looks mighty heavy.\n" +
            "\tMaybe if you hadn't skipped leg day and arm day for the last few years, you could open it.");

    /**
     * The {@code String} corresponding to a particular value of the enumeration.
     */
    private final String name;
    private Boolean itemInInventory;
    private final String description;
    private final String description_In_Inv;

    /**
     * Constructs a new {@link Item} with the specified {@code String}.
     * @param name The {@code String}.
     */
    Item(String name, Boolean itemInInventory, String description, String description_In_Inv) {
        this.name = name;
        this.itemInInventory = false;
        this.description = description;
        this.description_In_Inv = description_In_Inv;
    }

    /**
     * Returns the {@code String} corresponding to a particular value of the enumeration.
     * @return the {@code String} corresponding to a particular value of the enumeration.
     */
    public String getName() {
        return name;
    }
    public String getValidDescription() {
        if(!getItemInInventory()) {
            return description;
        } else { return description_In_Inv;
        }
    }
    public Boolean getItemInInventory() {return itemInInventory;}
    public Boolean setItemInInventory() {return itemInInventory = true;}
}
