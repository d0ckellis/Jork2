/**
 * Space class for creation of space objects which make up the Map array, and consist of the game spaces.
 * @author alexl
 * @version 1.1
 */
public class Space{

    private boolean hasItem;
    private final String descriptNoItem;
    private final String descriptHasItem;
    private final Item item;

    public Space(Boolean hasItem, String descriptNoItem, String descriptHasItem, Item item) {
        this.hasItem = hasItem;
        this.descriptNoItem = descriptNoItem;
        this.descriptHasItem = descriptHasItem;
        this.item = item;

    }

    public boolean getHasItem() {return hasItem;}

    public void setHasItem() {hasItem = !hasItem;}

    public String getDescriptNoItem() {return descriptNoItem;}

    public String getDescriptHasItem() {return descriptHasItem;}

    //placeholder for take method
    public String take() {
        String string = "";
        return string;

    }
    //placeholder for use method
    public String use() {
        String string = "";
        return string;
    }

    //placeholder for look method
    public String look() {
        String string = "";
        return string;
    }
}
