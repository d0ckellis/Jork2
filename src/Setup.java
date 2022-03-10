import java.util.Scanner;
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
        //build an array of Space objects equal to the chapter
        Space[] spacesChapOne = new Space[9];
        //Space space0 = new Space(false, space0Description, "", Item.NAILS);
        //there has to be a better way to do this
        buildChapterOneSpaces(spacesChapOne);
        //build the map
        Map chOneMap = new Map.Builder( 0, 3, 3, spacesChapOne).build();
        chOneMap.move();
        return chOneMap;

        //GameManager gm = new GameManager(console, chOneMap, player, spacesChapOne);
    }

    public Space[] buildChapterOneSpaces(Space[] spaces) {
        Description chapterOne = new Description();

        spaces[0] = new Space.Builder(false, chapterOne.getDescriptSpace0WithNoInvItems())
                        .descriptHasItem(chapterOne.getDescriptSpace0WithInvItem1())
                        .descriptNonInventoryItem(chapterOne.getDescriptSpace0NonInvItem1())
                        .descriptSecondNonInventoryItem(chapterOne.getDescriptSpace0NonInvItem2())
                        .item(Item.NAILS)
                        .build();
        spaces[1] = new Space.Builder(false, chapterOne.getDescriptSpace1WithNoInvItems())
                        .descriptHasItem(chapterOne.getDescriptSpace1WithoutInvItem1())
                        .descriptNonInventoryItem(chapterOne.getDescriptSpace1NonInvItem1())
                        .item(Item.SWORD)
                        .build();
        spaces[2] = new Space.Builder(false, chapterOne.getDescriptSpace2WithNoInvItems())
                        .build();
        spaces[3] = new Space.Builder(false, chapterOne.getDescriptSpace3WithNoInvItems())
                        .descriptHasItem(chapterOne.getDescriptSpace3WithoutInvItem1())
                        .descriptNonInventoryItem(chapterOne.getDescriptSpace3NonInvItem1())
                        .item(Item.MARKER)
                        .build();
        spaces[4] = new Space.Builder(false, chapterOne.getDescriptSpace4WithNoInvItems())
                        .descriptHasItem(chapterOne.getDescriptSpace4WithoutInvItem1())
                        .item(Item.RUG)
                        .build();
        spaces[5] = new Space.Builder(false, chapterOne.getDescriptSpace5WithNoInvItems())
                        .descriptHasItem(chapterOne.getDescriptSpace5WithoutInvItem1())
                        .descriptNonInventoryItem(chapterOne.getDescriptSpace5NonInvItem1())
                        .item(Item.POTION)
                        .build();
        spaces[6] = new Space.Builder(false, chapterOne.getDescriptSpace6WithNoInvItems())
                        .descriptHasItem(chapterOne.getDescriptSpace6WithoutInvItem1())
                        .descriptNonInventoryItem(chapterOne.getDescriptSpace6NonInvItem1())
                        .item(Item.PARCHMENT)
                        .build();
        spaces[7] = new Space.Builder(false, chapterOne.getDescriptSpace7WithNoInvItems())
                        .descriptHasItem(chapterOne.getDescriptSpace7WithoutInvItem1())
                        .descriptNonInventoryItem(chapterOne.getDescriptSpace7NonInvItem1())
                        .item(Item.KEY)
                        .build();
        spaces[8] = new Space.Builder(false, chapterOne.getDescriptSpace8WithNoInvItems())
                        .descriptHasItem(chapterOne.getDescriptSpace8WithoutInvItem1())
                        .descriptNonInventoryItem(chapterOne.getDescriptSpace8NonInvItem1())
                        .descriptSecondNonInventoryItem(chapterOne.getDescriptSpace8NonInvItem2())
                        .item(Item.CLOAK)
                        .build();
        return spaces;
    }
}
