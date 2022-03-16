package com.jork.main;

import com.jork.items.Inventory;
import com.jork.items.Item;
import com.jork.model.Description;
import com.jork.model.Player;
import com.jork.model.SystemMessages;
import com.jork.space.Space;
import com.jork.space.TrapDoor;
import com.jork.space.Window;

/**
 * A class for our {@link Setup} of the {@link Jork jork} game
 * @author andyh
 * @author alexb
 * @version 1.3
 */
public class Setup {
    /**
     * Instantiates the com.jork.space.Space[] to be size = 9
     * calls the method to build the spaces within the com.jork.space.Space[]
     * @returns the com.jork.main.Map built to the specifications for chapter one
     */
    public Map gameBuilder() {
        Space[] spacesChapOne = new Space[9];
        buildChapterOneSpaces(spacesChapOne);
        return new Map.Builder( 0, 3, 3, spacesChapOne).build();
    }
    /**
     * Builds the spaces that go in the chapter one space[].
     * @param spaces is the array set to a predetermined size.
     * @returns com.jork.space.Space[] for use by the game.
     */
    public Space[] buildChapterOneSpaces(Space[] spaces) {
        Description chapterOne = new Description();

        spaces[0] = new Space.Builder(chapterOne.getS0Description())
                        .describeSpaceWithoutItem(chapterOne.getS0AltDescription())
                        .nonInvItem(Item.BED)
                        .item(Item.NAILS)
                        .build();
        spaces[1] = new Space.Builder( chapterOne.getS1Description())
                        .describeSpaceWithoutItem(chapterOne.getS1AltDescription())
                        .nonInvItem(Item.NIGHTSTAND)
                        .item(Item.SWORD)
                        .build();
        spaces[2] = new Window.Builder( chapterOne.getS2Description())
                        .nonInvItem(Item.WINDOW)
                        .build();
        spaces[3] = new Space.Builder(chapterOne.getS3Description())
                        .describeSpaceWithoutItem(chapterOne.getS3AltDescription())
                        .nonInvItem(Item.BOOKSHELF)
                        .item(Item.MARKER)
                        .build();
        spaces[4] = new TrapDoor.Builder(chapterOne.getS4Description())
                        .describeSpaceWithoutItem(chapterOne.getS4SubDescription())
                        .nonInvItem(Item.TRAPDOOR)
                        .item(Item.RUG)
                        .build();
        spaces[5] = new Space.Builder(chapterOne.getS5Description())
                        .describeSpaceWithoutItem(chapterOne.getS5AltDescription())
                        .nonInvItem(Item.DESK)
                        .item(Item.POTION)
                        .build();
        spaces[6] = new Space.Builder(chapterOne.getS6Description())
                        .describeSpaceWithoutItem(chapterOne.getS6AltDescription())
                        .nonInvItem(Item.BOOKSHELF)
                        .item(Item.PARCHMENT)
                        .build();
        spaces[7] = new Space.Builder(chapterOne.getS7Description())
                        .describeSpaceWithoutItem(chapterOne.getS7AltDescription())
                        .nonInvItem(Item.DOOR)
                        .item(Item.KEY)
                        .build();
        spaces[8] = new Space.Builder(chapterOne.getS8Description())
                        .describeSpaceWithoutItem(chapterOne.getS8AltDescription())
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
