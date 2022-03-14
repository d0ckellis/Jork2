
/**
 * A class for our {@link Setup} of the {@link Jork jork} game
 * @author andyh
 * @author alexb
 * @version 1.3
 */
public class Setup {
    /**
     * Instantiates the Space[] to be size = 9
     * calls the method to build the spaces within the Space[]
     * @returns the Map built to the specifications for chapter one
     */
    public Map gameBuilder() {
        Space[] spacesChapOne = new Space[9];
        buildChapterOneSpaces(spacesChapOne);
        return new Map.Builder( 0, 3, 3, spacesChapOne).build();
    }
    /**
     * Builds the spaces that go in the chapter one space[].
     * @param spaces is the array set to a predetermined size.
     * @returns Space[] for use by the game.
     */
    public Space[] buildChapterOneSpaces(Space[] spaces) {
        Description chapterOne = new Description();

        spaces[0] = new Space.Builder(chapterOne.getDescribe_0_With_Item())
                        .Describe_Space_Without_Item(chapterOne.getDescribe_0_No_Item())
                        .nonInvItem(Item.BED)
                        .item(Item.NAILS)
                        .build();
        spaces[1] = new Space.Builder( chapterOne.getDescribe_1_With_Item())
                        .Describe_Space_Without_Item(chapterOne.getDescribe_1_No_Item())
                        .nonInvItem(Item.NIGHTSTAND)
                        .item(Item.SWORD)
                        .build();
        spaces[2] = new Window.Builder( chapterOne.getDescribe_2_No_Item())
                        .nonInvItem(Item.WINDOW)
                        .build();
        spaces[3] = new Space.Builder(chapterOne.getDescribe_3_With_Item())
                        .Describe_Space_Without_Item(chapterOne.getDescribe_3_No_Item())
                        .nonInvItem(Item.BOOKSHELF)
                        .item(Item.MARKER)
                        .build();
        spaces[4] = new TrapDoor.Builder(chapterOne.getDescribe_4_With_Item())
                        .Describe_Space_Without_Item(chapterOne.getDescribe_4_Open_Trapdoor())
                        .nonInvItem(Item.TRAPDOOR)
                        .item(Item.RUG)
                        .build();
        spaces[5] = new Space.Builder(chapterOne.getDescribe_5_With_Item())
                        .Describe_Space_Without_Item(chapterOne.getDescribe_5_No_Item())
                        .nonInvItem(Item.DESK)
                        .item(Item.POTION)
                        .build();
        spaces[6] = new Space.Builder(chapterOne.getDescribe_6_With_Item())
                        .Describe_Space_Without_Item(chapterOne.getDescribe_6_No_Item())
                        .nonInvItem(Item.BOOKSHELF)
                        .item(Item.PARCHMENT)
                        .build();
        spaces[7] = new Space.Builder(chapterOne.getDescribe_7_With_Item())
                        .Describe_Space_Without_Item(chapterOne.getDescribe_7_No_Item())
                        .nonInvItem(Item.DOOR)
                        .item(Item.KEY)
                        .build();
        spaces[8] = new Space.Builder(chapterOne.getDescribe_8_With_Item())
                        .Describe_Space_Without_Item(chapterOne.getDescribe_8_No_Item())
                        .nonInvItem(Item.LATRINE)
                        .item(Item.CLOAK)
                        .build();
        return spaces;
    }
    public Player buildPlayer(Inventory inventory) {
        System.out.print(SystemMessages.namePrompt);
        String name = Jork.CONSOLE.next().toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        Jork.CONSOLE.nextLine();
        System.out.println("\nHello, " + name + SystemMessages.welcomePlayer);
        System.out.print(SystemMessages.perkPrompt);
        String attribute = Jork.CONSOLE.next();
        Jork.CONSOLE.nextLine();
        verifyAttribute(attribute);
        return new Player.Builder(name, 1, 1, 1, inventory).build();
    }
    public String verifyAttribute(String attribute) {
        if (attribute.equalsIgnoreCase("strong")) {
            System.out.println("...I'm sure you are.\n");
        } else if (attribute.equalsIgnoreCase("smart")) {
            System.out.println("...we'll see about that.\n");
        } else {
            System.out.println("Well, you clearly aren't smart. Let's hope you are strong then.\n");
        }
        return  attribute;
    }
}
