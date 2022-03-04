public class Space {

    private boolean hasItem;
    private final String descriptNoItem;
    private final String descriptHasItem;

    public Space(Boolean hasItem, String descriptNoItem, String descriptHasItem) {
        this.hasItem = hasItem;
        this.descriptNoItem = descriptNoItem;
        this.descriptHasItem = descriptHasItem;
    }

    public boolean getHasItem() {return hasItem;}

    public String getDescriptNoItem() {return descriptNoItem;}

    public String getDescriptHasItem() {return descriptHasItem;}

    //placeholder for take method
    public String take()  {
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
