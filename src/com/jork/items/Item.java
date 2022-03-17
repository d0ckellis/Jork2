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
    SWORD(false,"\tA family heirloom that never loses it's edge.\n" +
            "\tIt's gotten you out of a few tricky situations, best not sell it.", "\tA family heirloom that never looses it's edge.\n" +
            "\tIt's gotten you out of a few tricky situations, best not sell it.", "\tMother always said never to play with swords inside."),
    /**
     * Rug
     */
    RUG(false, "\tIt's a shabby rug, that is embroidered to look like the night sky,\n" +
            "\tThe realism is striking in fact.\n" +
            "\tWould probably block out the sun well enough, ironically.\n" +
            "\tIs that what ironic means? You probably don't know either.", "\tIt's a shabby rug, that is embroidered to look like the night sky,\n" +
            "\tThe realism is striking in fact.\n" +
            "\tWould probably block out the sun well enough, ironically.\n" +
            "\tIs that what ironic means? You probably don't know either.", "\tYou picked this up for some reason, and I don't think it was to redecorate."),
    /**
     * Nails
     */
    NAILS(false,"\tTwo nails have been protruding out from a floorboard, just begging for you to fix them.\n" +
            "\tOr at the very least, pull them up.", "\tThese rusty nails have wreaked havoc on your shoes for the last time, now they'll just wreak havoc on your pockets.",
            "\tYou don't need to put nails here."),
    /**
     * Potion
     */
    POTION(false,"\tYou're pretty sure you left one somewhere in here.", "\tIt's a potion of infinite enhancement.\n" +
            "\tYou won it in a game of chance last night, or was it the night before?\n" +
            "\tEither way, it's probably not FDA approved, but it could be useful later on!", "\tYou have to have something, to use something. C'mon, this is pretty basic game mechanics."),
    /**
     * Key
     */
    KEY(false,"\tWhere the hell did you put it?", "\tIf you need me to explain to you what this does, we have real problems,\n" +
            "\tbigger than this game.", "\tEvery key needs a door."),
    /**
     * Parchment
     */
    PARCHMENT(false,"\tYou'll have to get closer to examine that,\n" +
            "\tyou haven't had vision in the two digits since grade school.", "\tThe parchment is blank as far as you can tell\n" +
            "\tYou wonder if it might serve you in future.", "\tYou have a weird feeling that this paper is important,\n"),
    /**
     * Cloak
     */
    CLOAK(false,"\tIt's haphazardly thrown on the chair, exactly where you left it,\n" +
            "\tlike all the things in this pigsty of a room.", "\tIt's full of holes, but for some reason this town has a no cloak, no boots, no service policy, so you keep wearing it.",
            "\tYou could hang the cloak over the window, but there are too many holes in it to be of any use."),
    /**
     * Marker
     */
    MARKER(false,"\tWhat marker? It's too bright to see that far away.", "\tThere are instructions on the back of the box.\n" +
            "\t\"Write secret invisible messages that can only be seen when wet!\"\n" +
            "\t\"A perfect gift for ages 4-12.\"\n" +
            "\tYou're 30, and this was a stocking stuffer your mom gave you last year.", "\tYou would like your deposit back, better not."),
    /**
     * Necklace
     */
    NECKLACE(false,"\tYou haven't owned a necklace since Puka shell necklaces went out of style.", "\tAn antique neckless bejewled and made of silver.\n" +
            "\tSomething about it feels magical.", "You don't want to do that."),
    /**
     * Item value when there is no item.
     *
     */
    EMPTY(false,"empty", "empty", "empty"),
    /**
     * Window
     */
    WINDOW(false, "\tThe window is painted shut, it would likely take a good deal of strength to open.", "\tThe window is painted shut, it would likely take a good deal of strength to open.",
            "\tYou need to be closer to defenestrate."),
    /**
     * Room
     */
    ROOM(false, "\tThe room is quaint, just what you can afford.\n" +
            "\tFrom here it looks like everything is as you left it...dirty.", "\tThe room is quaint, just what you can afford.\n" +
            "\tFrom here it looks like everything is as you left it...dirty.", "\tThat seems like an existential request, I don't do those."),
    /**
     * Bed
     */
    BED(false,  "\tYour bedsheets haven't been washed in awhile,\n" +
            "\tthe help at the inn was laid off last month, you keep reminding yourself.\n" +
            "\tEven though when there was help, you were still responsible for tidying up on your own.\n" +
            "\tAlas, you've nested atop a pile of your own clothing.\n" +
            "\tYou should count your blessings you have more than one set of clothes.",  "\tYour bedsheets haven't been washed in awhile,\n" +
            "\tthe help at the inn was laid off last month, you keep reminding yourself.\n" +
            "\tEven though when there was help, you were still responsible for tidying up on your own.\n" +
            "\tAlas, you've nested atop a pile of your own clothing.\n" +
            "\tYou should count your blessings you have more than one set of clothes.", "\tYou tried sleeping through the knocks already, and that didn't seem to work."),
    /**
     * Door
     */
    DOOR(false, "\tThe wooden door to you room seems so far away from here.\n" +
            "\tYet the knocking, you swear, could be coming from inside your head.", "\tThe wooden door to you room seems so far away from here.\n" +
            "\tYet the knocking, you swear, could be coming from inside your head.", "\tYou're not close enough to do that."),
    /**
     * Nightstand
     */
    NIGHTSTAND(false,"\tIt's old and made of wood. What more is there to know?", "\tIt's old and made of wood. What more is there to know?",
            "\tGoing to write the person at your door a nicely written request to #@$! off?" ),
    /**
     * Desk
     */
    DESK(false, "Let's just say you never won any superlatives for \"Best Organized\".", "Let's just say you never won any superlatives for \"Best Organized\".",
            "\tLet's just say you never won any superlatives for \"Best Organized\"."),
    /**
     * Bookshelf
     */
    BOOKSHELF(false, "", "", ""),
    /**
     * Latrine
     */
    LATRINE(false, "Gross", "Holding it didn't make it any less gross", "\tNot while everyone is watching."),
    /**
     * Trapdoor
     */
    TRAPDOOR(false, "You don't see that.","\tThe trapdoor that was underneath the rug looks mighty heavy.\n" +
            "\tMaybe if you hadn't skipped leg day and arm day for the last few years, you could open it.", "\tI beg your pardon?"),
    /**
     * Mirror
     */
    MIRROR(false, "\tThe mirror across the room on the armoire has always point in an odd direction.\n\tAnd it has a tendency of putting a few extra pounds on your reflection.",
            "\tYour reflection doesn't look right. You weren't this ugly the last time you checked.\n", "\tThe mirror across the room on the armoire has always point in an odd direction.\n" +
            "\tAnd it has a tendency of putting a few extra pounds on your reflection."),
    /**
     * Wetparchment
     */
    WETPARCHMENT(false, "", "", "");


    /**
     * The {@code String} corresponding to a particular value of the enumeration.
     */
    private Boolean itemInInventory;
    private final String description;
    private final String descriptionUpClose;
    private final String descriptionWhenUsed;

    /**
     * Constructs a new {@link Item} with the specified {@code String}.
     */
    Item(Boolean itemInInventory, String description, String descriptionUpClose, String descriptionWhenUsed) {
        this.itemInInventory = itemInInventory;
        this.description = description;
        this.descriptionUpClose = descriptionUpClose;
        this.descriptionWhenUsed = descriptionWhenUsed;
    }

    /**
     * Returns the {@code String} corresponding to a particular value of the enumeration.
     * @return the {@code String} corresponding to a particular value of the enumeration.
     */
    public String getValidDescription() {
        if(!getItemInInventory()) {
            return description;
        } else { return descriptionUpClose;
        }
    }
    public String getDescriptionUpClose() {
        return descriptionUpClose;
    }

    public String getDescriptionWhenUsed() {
        return descriptionWhenUsed;
    }
    public Boolean getItemInInventory() {return itemInInventory;}
    public Boolean setItemInInventory() {return itemInInventory = true;}
}
