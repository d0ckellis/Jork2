import java.util.HashMap;

/**
 * A class for our {@link Setup#gameBuilder}
 * @author andyh
 * @author alexb
 * @version 1.1
 */
public class Setup {

    /**
     * A boolean responsible for determining whether our game has started
     */
    private boolean startGame;
    /**
     * A boolean responsible for determining if the game has ended
     */
    private boolean endGame;
    /**
     * An int that holds the chapter number to play
     */
    private int gameCh;
    /**
     * A builder class for our game
     */
    public Map gameBuilder() {
        Space[] spacesChapOne = new Space[9];
        buildChapterOneSpaces(spacesChapOne);
        Map chOneMap = new Map.Builder( 0, 3, 3, spacesChapOne).build();
        System.out.println(spacesChapOne[chOneMap.getCurrentPos()].item);
        return chOneMap;
    }

    public Space[] buildChapterOneSpaces(Space[] spaces) {
        Description chapterOne = new Description();

        spaces[0] = new Space.Builder(chapterOne.getDescribe_0_With_Item())
                        .descriptHasItem(chapterOne.getDescribe_0_No_Item())
                        .nonInvItem(Item.BED)
                        .item(Item.NAILS)
                        .build();
        spaces[1] = new Space.Builder( chapterOne.getDescribe_1_With_Item())
                        .descriptHasItem(chapterOne.getDescribe_1_No_Item())
                        .nonInvItem(Item.NIGHTSTAND)
                        .item(Item.SWORD)
                        .build();
        spaces[2] = new Space.Builder( chapterOne.getDescribe_2_No_Item())
                        .nonInvItem(Item.WINDOW)
                        .build();
        spaces[3] = new Space.Builder(chapterOne.getDescribe_3_With_Item())
                        .descriptHasItem(chapterOne.getDescribe_3_No_Item())
                        .nonInvItem(Item.BOOKSHELF)
                        .item(Item.MARKER)
                        .build();
        spaces[4] = new Space.Builder(chapterOne.getDescribe_4_With_Item())
                        .descriptHasItem(chapterOne.getDescribe_4_Open_Trapdoor())
                        .nonInvItem(Item.TRAPDOOR)
                        .item(Item.RUG)
                        .build();
        spaces[5] = new Space.Builder(chapterOne.getDescribe_5_With_Item())
                        .descriptHasItem(chapterOne.getDescribe_5_No_Item())
                        .nonInvItem(Item.DESK)
                        .item(Item.POTION)
                        .build();
        spaces[6] = new Space.Builder(chapterOne.getDescribe_6_With_Item())
                        .descriptHasItem(chapterOne.getDescribe_6_No_Item())
                        .nonInvItem(Item.BOOKSHELF)
                        .item(Item.PARCHMENT)
                        .build();
        spaces[7] = new Space.Builder(chapterOne.getDescribe_7_With_Item())
                        .descriptHasItem(chapterOne.getDescribe_7_No_Item())
                        .nonInvItem(Item.DOOR)
                        .item(Item.KEY)
                        .build();
        spaces[8] = new Space.Builder(chapterOne.getDescribe_8_With_Item())
                        .descriptHasItem(chapterOne.getDescribe_8_No_Item())
                        .nonInvItem(Item.LATRINE)
                        .item(Item.CLOAK)
                        .build();
        return spaces;
    }
}
