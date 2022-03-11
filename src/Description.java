/**
 * Collection of strings describing items and spaces.
 * @author alexb
 * @author allyv
 * @version 1.1
 */
public class Description {

    //TODO: Add boolean for if describing inv item, as well as multiple states of said items, i.e. open, closed, etc
    //test

    //we are almost certainly going to need to read these from a file to make this readable.
    //going to sleep on it and see if I can come up with an alt solution


    //Item: Nails
    String descriptSpace0WithNoInvItems =
            "\tYou stub your toe on two nails protruding from the floorboards,\n" +
            "\tDid you do this last night too or is it just deja vu?\n" +
            "\tIt seems you're doomed to keep repeating this misfortune.\n" +
            "\tYour bed awaits your fated return.";
    String descriptSpace0WithInvItem1 = "\tYour bed awaits your fated return.";
    //background items cannot pick up
    String descriptSpace0NonInvItem1 = "";
    String descriptSpace0NonInvItem2 = "";

    //Item: Sword
    String descriptSpace1WithNoInvItems =
            "\tYou swear you left your sword here on the nightstand.\n" +
            "\tOh, wait, you've already sheathed it.";
    String descriptSpace1WithInvItem1 =
            "\tOn the nightstand lay your unsheathed sword.\n" +
            "\tIt's not particularly menacing or large, but everyone says size doesn't matter, right? \n" +
            "\tDon't forget it on your way out!";
    String descriptSpace1WithoutInvItem1 = "";
    String descriptSpace1WithInvItem2 = "";
    String descriptSpace1WithoutInvItem2 = "";
    String descriptSpace1NonInvItem1 = "";
    String descriptSpace1NonInvItem2 = "";

    //Window: Option: Jump/No Jump
    String descriptSpace2WithNoInvItems =
            "\tThe window looks out to the courtyard behind the inn.\n" +
            "\tEither the sun is closer to the Earth than normal or your eyes are overly sensitive due to you hangover.\\n\" +\n" +
            "\tI'll let you decide which is the case.\n" +
            "\tYou can barely make out a horse pen across from your window if you squint.\n" +
            "\tMight be a good escape if your knees can handle the fall!\");";
    String descriptSpace2WithInvItem1 = "";
    String descriptSpace2WithoutInvItem1 = "";
    String descriptSpace2WithInvItem2 = "";
    String descriptSpace2WithoutInvItem2 = "";
    String descriptSpace2NonInvItem1 = "";
    String descriptSpace2NonInvItem2 = "";

    //Item: Marker
    String descriptSpace3WithNoInvItems =
            "\tYou approach the armoire. The wood looks worn out and the mirror faded.\n" +
            "\tYour paranoia makes you wonder if anyone has spied on you through this mirror while you were asleep.";
    String descriptSpace3WithInvItem1 =
            "\tYou approach the armoire. The wood looks worn out and the mirror faded.\n" +
            "\tYour paranoia makes you wonder if anyone has spied on you through this mirror while you were asleep.\n" +
            "\tA box with a magic marker sits open on the bench.";
    String descriptSpace3WithoutInvItem1 = "";
    String descriptSpace3WithInvItem2 = "";
    String descriptSpace3WithoutInvItem2 = "";
    String descriptSpace3NonInvItem1 = "";
    String descriptSpace3NonInvItem2 = "";

    String descriptSpace4WithNoInvItems =
            "\tThere is a trapdoor hidden underneath the rug.\n" +
            "\tSomehow you hadn't noticed it before.\n";
    String descriptSpace4WithInvItem1 =
            "\tThe trapdoor remains open, as you left it.\n" +
            "\tEmpty of its contents.\");";
    String descriptSpace4WithoutInvItem1 =
            "\tThe rug on the floor, that is embroidered to look like the night sky, looks like it has been moved recently.\n" +
            "\tMaybe the last guest who stayed in this room hid treasures underneath the floorboards!\n" +
            "\tOr maybe that sound you hear at night is just the beating of the previous tenant's hideous heart.\n";
    String descriptSpace4WithInvItem2 = "";
    String descriptSpace4WithoutInvItem2 = "";
    String descriptSpace4NonInvItem1 = "";
    String descriptSpace4NonInvItem2 = "";

    String descriptSpace5WithNoInvItems = "";
    String descriptSpace5WithInvItem1 = "";
    String descriptSpace5WithoutInvItem1 = "";
    String descriptSpace5WithInvItem2 = "";
    String descriptSpace5WithoutInvItem2 = "";
    String descriptSpace5NonInvItem1 = "";
    String descriptSpace5NonInvItem2 = "";

    String descriptSpace6WithNoInvItems =
            "\tThe bookshelf is mostly dusty, but for the outline of the parchment that now is in your pocket.\n";
    String descriptSpace6WithInvItem1 =
            "\tBehind the armoire is a tall bookshelf covered in a thick layer of dust.\n" +
            "\tYou see some old piece of parchment.\n" +
            "\tIt might be useful, or it might be rubbish.\n";
    String descriptSpace6WithoutInvItem1 = "";
    String descriptSpace6WithInvItem2 = "";
    String descriptSpace6WithoutInvItem2 = "";
    String descriptSpace6NonInvItem1 = "";
    String descriptSpace6NonInvItem2 = "";

    String descriptSpace7WithNoInvItems =
        "\tYou can see the edge of the brass key, hanging over the edge of the door jam.\n" +
        "\tIt's almost fallen off from all the knocking.";
    String descriptSpace7WithInvItem1 = "";
    String descriptSpace7WithoutInvItem1 = "";
    String descriptSpace7WithInvItem2 = "";
    String descriptSpace7WithoutInvItem2 = "";
    String descriptSpace7NonInvItem1 = "";
    String descriptSpace7NonInvItem2 = "";

    String descriptSpace8WithNoInvItems =
            "\tThe chair, that once had your cloak upon it, sits in the corner.\n" +
            "\tAs does the jar. Ew.\n";
    String descriptSpace8WithInvItem1 = "\tYou pick up your cloak from the chair.\n" +
            "\tIt's full of holes, but for some reason this town has a no cloak, no boots, no service policy, so you keep wearing it.\n" +
            "\tYou should really find a job soon as winter is coming and this cloak won't hold out much longer\n" +
            "\tIs something you keep telling yourself.\n" +
            "\tThere's a jar you've used as a latrine in the corner. It's filled with...liquid. Gross.\n";
    String descriptSpace8WithoutInvItem1 = "";
    String descriptSpace8WithInvItem2 = "";
    String descriptSpace8WithoutInvItem2 = "";
    String descriptSpace8NonInvItem1 = "";
    String descriptSpace8NonInvItem2 = "";


    public String getDescriptSpace0WithNoInvItems() {
        return descriptSpace0WithNoInvItems;
    }

    public String getDescriptSpace0WithInvItem1() {
        return descriptSpace0WithInvItem1;
    }

    public String getDescriptSpace0NonInvItem1() {
        return descriptSpace0NonInvItem1;
    }

    public String getDescriptSpace0NonInvItem2() {
        return descriptSpace0NonInvItem2;
    }

    public String getDescriptSpace1WithNoInvItems() {
        return descriptSpace1WithNoInvItems;
    }

    public String getDescriptSpace1WithInvItem1() {
        return descriptSpace1WithInvItem1;
    }

    public String getDescriptSpace1WithoutInvItem1() {
        return descriptSpace1WithoutInvItem1;
    }

    public String getDescriptSpace1WithInvItem2() {
        return descriptSpace1WithInvItem2;
    }

    public String getDescriptSpace1WithoutInvItem2() {
        return descriptSpace1WithoutInvItem2;
    }

    public String getDescriptSpace1NonInvItem1() {
        return descriptSpace1NonInvItem1;
    }

    public String getDescriptSpace1NonInvItem2() {
        return descriptSpace1NonInvItem2;
    }

    public String getDescriptSpace2WithNoInvItems() {
        return descriptSpace2WithNoInvItems;
    }

    public String getDescriptSpace2WithInvItem1() {
        return descriptSpace2WithInvItem1;
    }

    public String getDescriptSpace2WithoutInvItem1() {
        return descriptSpace2WithoutInvItem1;
    }

    public String getDescriptSpace2WithInvItem2() {
        return descriptSpace2WithInvItem2;
    }

    public String getDescriptSpace2WithoutInvItem2() {
        return descriptSpace2WithoutInvItem2;
    }

    public String getDescriptSpace2NonInvItem1() {
        return descriptSpace2NonInvItem1;
    }

    public String getDescriptSpace2NonInvItem2() {
        return descriptSpace2NonInvItem2;
    }

    public String getDescriptSpace3WithNoInvItems() {
        return descriptSpace3WithNoInvItems;
    }

    public String getDescriptSpace3WithInvItem1() {
        return descriptSpace3WithInvItem1;
    }

    public String getDescriptSpace3WithoutInvItem1() {
        return descriptSpace3WithoutInvItem1;
    }

    public String getDescriptSpace3WithInvItem2() {
        return descriptSpace3WithInvItem2;
    }

    public String getDescriptSpace3WithoutInvItem2() {
        return descriptSpace3WithoutInvItem2;
    }

    public String getDescriptSpace3NonInvItem1() {
        return descriptSpace3NonInvItem1;
    }

    public String getDescriptSpace3NonInvItem2() {
        return descriptSpace3NonInvItem2;
    }

    public String getDescriptSpace4WithNoInvItems() {
        return descriptSpace4WithNoInvItems;
    }

    public String getDescriptSpace4WithInvItem1() {
        return descriptSpace4WithInvItem1;
    }

    public String getDescriptSpace4WithoutInvItem1() {
        return descriptSpace4WithoutInvItem1;
    }

    public String getDescriptSpace4WithInvItem2() {
        return descriptSpace4WithInvItem2;
    }

    public String getDescriptSpace4WithoutInvItem2() {
        return descriptSpace4WithoutInvItem2;
    }

    public String getDescriptSpace4NonInvItem1() {
        return descriptSpace4NonInvItem1;
    }

    public String getDescriptSpace4NonInvItem2() {
        return descriptSpace4NonInvItem2;
    }

    public String getDescriptSpace5WithNoInvItems() {
        return descriptSpace5WithNoInvItems;
    }

    public String getDescriptSpace5WithInvItem1() {
        return descriptSpace5WithInvItem1;
    }

    public String getDescriptSpace5WithoutInvItem1() {
        return descriptSpace5WithoutInvItem1;
    }

    public String getDescriptSpace5WithInvItem2() {
        return descriptSpace5WithInvItem2;
    }

    public String getDescriptSpace5WithoutInvItem2() {
        return descriptSpace5WithoutInvItem2;
    }

    public String getDescriptSpace5NonInvItem1() {
        return descriptSpace5NonInvItem1;
    }

    public String getDescriptSpace5NonInvItem2() {
        return descriptSpace5NonInvItem2;
    }

    public String getDescriptSpace6WithNoInvItems() {
        return descriptSpace6WithNoInvItems;
    }

    public String getDescriptSpace6WithInvItem1() {
        return descriptSpace6WithInvItem1;
    }

    public String getDescriptSpace6WithoutInvItem1() {
        return descriptSpace6WithoutInvItem1;
    }

    public String getDescriptSpace6WithInvItem2() {
        return descriptSpace6WithInvItem2;
    }

    public String getDescriptSpace6WithoutInvItem2() {
        return descriptSpace6WithoutInvItem2;
    }

    public String getDescriptSpace6NonInvItem1() {
        return descriptSpace6NonInvItem1;
    }

    public String getDescriptSpace6NonInvItem2() {
        return descriptSpace6NonInvItem2;
    }

    public String getDescriptSpace7WithNoInvItems() {
        return descriptSpace7WithNoInvItems;
    }

    public String getDescriptSpace7WithInvItem1() {
        return descriptSpace7WithInvItem1;
    }

    public String getDescriptSpace7WithoutInvItem1() {
        return descriptSpace7WithoutInvItem1;
    }

    public String getDescriptSpace7WithInvItem2() {
        return descriptSpace7WithInvItem2;
    }

    public String getDescriptSpace7WithoutInvItem2() {
        return descriptSpace7WithoutInvItem2;
    }

    public String getDescriptSpace7NonInvItem1() {
        return descriptSpace7NonInvItem1;
    }

    public String getDescriptSpace7NonInvItem2() {
        return descriptSpace7NonInvItem2;
    }

    public String getDescriptSpace8WithNoInvItems() {
        return descriptSpace8WithNoInvItems;
    }

    public String getDescriptSpace8WithInvItem1() {
        return descriptSpace8WithInvItem1;
    }

    public String getDescriptSpace8WithoutInvItem1() {
        return descriptSpace8WithoutInvItem1;
    }

    public String getDescriptSpace8WithInvItem2() {
        return descriptSpace8WithInvItem2;
    }

    public String getDescriptSpace8WithoutInvItem2() {
        return descriptSpace8WithoutInvItem2;
    }

    public String getDescriptSpace8NonInvItem1() {
        return descriptSpace8NonInvItem1;
    }

    public String getDescriptSpace8NonInvItem2() {
        return descriptSpace8NonInvItem2;
    }


}
