package com.jork.model;

/**
 * Collection of strings describing items and spaces.
 * @author alexb
 * @author allyv
 * @version 1.1
 */
public class Description {
    //TODO: Make class an @Enum instead.
    //TODO: Add boolean for if describing inv item, as well as multiple states of said items, i.e. open, closed, etc

    //we are almost certainly going to need to read these from a file to make this readable.
    //going to sleep on it and see if I can come up with an alt solution


    //com.jork.items.Item: Nails
    String describe_0_With_Item =
            "\tYou stub your toe on two nails protruding from the floorboards,\n" +
            "\tDid you do this last night too or is it just deja vu?\n" +
            "\tIt seems you're doomed to keep repeating this misfortune.\n" +
            "\tYour bed awaits your fated return.";
    String describe_0_No_Item = "\tYour bed awaits your fated return.";


    //com.jork.items.Item: Sword
    String describe_1_With_Item =
            "\tOn the nightstand lay your unsheathed sword.\n" +
            "\tIt's not particularly menacing or large, but everyone says size doesn't matter, right? \n" +
            "\tDon't forget it on your way out!";
    String describe_1_No_Item =
            "\tYou swear you left your sword here on the nightstand.\n" +
            "\tOh, wait, you've already sheathed it.";


    //com.jork.space.Window: Option: Jump/No Jump
    String describe_2_No_Item =
            "\tThe window looks out to the courtyard behind the inn.\n" +
            "\tEither the sun is closer to the Earth than normal or your eyes are overly sensitive due to you hangover.\\n\" +\n" +
            "\tI'll let you decide which is the case.\n" +
            "\tYou can barely make out a horse pen across from your window if you squint.\n" +
            "\tMight be a good escape if your knees can handle the fall!\");";


    //com.jork.items.Item: Marker
    String describe_3_With_Item =
            "\tYou approach the armoire. The wood looks worn out and the mirror faded.\n" +
            "\tYour paranoia makes you wonder if anyone has spied on you through this mirror while you were asleep.\n" +
            "\tA box with a magic marker sits open on the bench.";
    String describe_3_No_Item =
            "\tYou approach the armoire. The wood looks worn out and the mirror faded.\n" +
            "\tYour paranoia makes you wonder if anyone has spied on you through this mirror while you were asleep.";


    String describe_4_With_Item =
            "\tThe rug on the floor, that is embroidered to look like the night sky, looks like it has been moved recently.\n" +
            "\tMaybe the last guest who stayed in this room hid treasures underneath the floorboards!\n" +
            "\tOr maybe that sound you hear at night is just the beating of the previous tenant's hideous heart.\n";
    String describe_4_No_Item =
            "\tThere is a trapdoor hidden underneath the rug.\n" +
            "\tSomehow you hadn't noticed it before.\n";
    String describe_4_Open_Trapdoor =
            "\tThe trapdoor remains open, as you left it.\n" +
            "\tEmpty of its contents.\");";


    String describe_5_With_Item = "\tA potion of infinite enhancement sits on the desk.\n" +
            "\tYou won it in a game of chance last night, or was it the night before?\n" +
            "\tEither way, it's probably not FDA approved, but it could be useful later on!" +
            "\tOn the ground is your empty coin pouch,\n" +
            "\twhich you emptied after several rounds of drinking last night.";
    String describe_5_No_Item = "\tOn the ground is your empty coin pouch,\n" +
            "\twhich you emptied after several rounds of drinking last night.";;


    String describe_6_With_Item = "\tBehind the armoire is a tall bookshelf covered in a thick layer of dust.\n" +
                    "\tYou see some old piece of parchment.\n" +
                    "\tIt might be useful, or it might be rubbish.\n";
    String describe_6_No_Item = "\tThe bookshelf is mostly dusty, but for the outline of the parchment that now is in your pocket.\n";

    String describe_7_With_Item =
            "\tThe wooden door to your room, Room 141, is before you.\n" +
                    "\tYou always found it weird that Room 141 was on the second floor.\n" +
                    "\tThere isn't a peep hole or a viewing window out of it, it could be anyone on the other side.\n" +
                    "\tThe knocking is as loud and fervent as ever. It's honestly impressive at this point.\n" +
                    "\tBut, you just want it to stop.\n\n" +
                    "\tDo you open it?";



    String describe_7_No_Item = "\tThe knocking is as loud and fervent as ever. It's honestly impressive at this point.\n" +
            "\tBut, you just want it to stop. Do you open it?\n";

    String describe_8_With_Item = "\tYou pick up your cloak from the chair.\n" +
            "\tIt's full of holes, but for some reason this town has a no cloak, no boots, no service policy, so you keep wearing it.\n" +
            "\tYou should really find a job soon as winter is coming and this cloak won't hold out much longer\n" +
            "\tIs something you keep telling yourself.\n" +
            "\tThere's a jar you've used as a latrine in the corner. It's filled with...liquid. Gross.\n";

    String describe_8_No_Item = "\tThe chair, that once had your cloak upon it, sits in the corner.\n" +
            "\tAs does the jar. Ew.\n";



    public String getDescribe_0_With_Item() {
        return describe_0_With_Item;
    }

    public String getDescribe_0_No_Item() {
        return describe_0_No_Item;
    }



    public String getDescribe_1_With_Item() {
        return describe_1_With_Item;
    }

    public String getDescribe_1_No_Item() {
        return describe_1_No_Item;
    }


    public String getDescribe_2_No_Item() {
        return describe_2_No_Item;
    }



    public String getDescribe_3_With_Item() {
        return describe_3_With_Item;
    }

    public String getDescribe_3_No_Item() {
        return describe_3_No_Item;
    }





    public String getDescribe_4_With_Item() {
        return describe_4_With_Item;
    }

    public String getDescribe_4_No_Item() {
        return describe_4_No_Item;
    }

    public String getDescribe_4_Open_Trapdoor() {
        return describe_4_Open_Trapdoor;
    }



    public String getDescribe_5_With_Item() {
        return describe_5_With_Item;
    }

    public String getDescribe_5_No_Item() {
        return describe_5_No_Item;
    }




    public String getDescribe_6_With_Item() {
        return describe_6_With_Item;
    }

    public String getDescribe_6_No_Item() {
        return describe_6_No_Item;
    }



    public String getDescribe_7_With_Item() {
        return describe_7_With_Item;
    }

    public String getDescribe_7_No_Item() {return describe_7_No_Item;}

    public String getDescribe_8_With_Item() {
        return describe_8_With_Item;
    }

    public String getDescribe_8_No_Item() {
        return describe_8_No_Item;
    }




}
