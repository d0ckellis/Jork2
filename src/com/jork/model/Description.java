package com.jork.model;

/**
 * Collection of strings describing items and spaces.
 * @author alexb
 * @author allyv
 * @version 1.3
 */
public class Description {

    String s0Description =
            "\tYou stub your toe on two nails protruding from the floorboards,\n" +
            "\tDid you do this last night too or is it just deja vu?\n" +
            "\tIt seems you're doomed to keep repeating this misfortune.\n" +
            "\tYour bed awaits your fated return.";
    String s0AltDescription =
            "\tYour bed awaits your fated return.";

    String s1Description =
            "\tOn the nightstand lay your unsheathed sword.\n" +
            "\tIt's not particularly menacing or large, but everyone says size doesn't matter, right? \n" +
            "\tDon't forget it on your way out!";
    String s1AltDescription =
            "\tYou swear you left your sword here on the nightstand.\n" +
            "\tOh, wait, you've already sheathed it.";
    //TODO add altDescription for when the window is open.
    String s2Description =
            "\tThe window looks out to the courtyard behind the inn.\n" +
            "\tEither the sun is closer to the Earth than normal or your eyes are overly sensitive due to you hangover.\\n\" +\n" +
            "\tI'll let you decide which is the case.\n" +
            "\tYou can barely make out a horse pen across from your window if you squint.\n" +
            "\tMight be a good escape if your knees can handle the fall!";
    String s2AltDescription = "test";

    String s3Description =
            "\tYou approach the armoire. The wood looks worn out and the mirror faded.\n" +
            "\tYour paranoia makes you wonder if anyone has spied on you through this mirror while you were asleep.\n" +
            "\tA box with a magic marker sits open on the bench.";
    String s3AltDescription =
            "\tYou approach the armoire. The wood looks worn out and the mirror faded.\n" +
            "\tYour paranoia makes you wonder if anyone has spied on you through this mirror while you were asleep.";

    String s4Description =
            "\tThe rug on the floor, that is embroidered to look like the night sky, looks like it has been moved recently.\n" +
            "\tMaybe the last guest who stayed in this room hid treasures underneath the floorboards!\n" +
            "\tOr maybe that sound you hear at night is just the beating of the previous tenant's hideous heart.";
    String s4AltDescription =
            "\tThere is a trapdoor hidden underneath the rug.\n" +
            "\tSomehow you hadn't noticed it before.";
    String s4SubDescription =
            "\tThe trapdoor remains open, as you left it,\n" +
            "\tempty of its contents.";

    String s5Description =
            "\tA potion of infinite enhancement sits on the desk.\n" +
            "\tYou won it in a game of chance last night, or was it the night before?\n" +
            "\tEither way, it's probably not FDA approved, but it could be useful later on!\n" +
            "\tOn the ground is your empty coin pouch,\n" +
            "\twhich you emptied after several rounds of drinking last night.";
    String s5AltDescription =
            "\tOn the ground is your empty coin pouch,\n" +
            "\twhich you emptied after several rounds of drinking last night.";

    String s6Description =
            "\tBehind the armoire is a tall bookshelf covered in a thick layer of dust.\n" +
            "\tYou see an old piece of parchment.\n" +
            "\tIt might be useful, or it might be rubbish.\n";
    String s6AltDescription =
            "\tThe bookshelf is mostly dusty, but for the outline of the parchment that now is in your pocket.";

    String s7Description =
            "\tThe wooden door to your room, Room 141, is before you.\n" +
            "\tYou always found it weird that Room 141 was on the second floor.\n" +
            "\tThere isn't a peep hole or a viewing window out of it, it could be anyone on the other side.\n" +
            "\tThe knocking is as loud and fervent as ever. It's honestly impressive at this point.\n" +
            "\tBut, you just want it to stop.\n\n" +
            "\tDo you open it?";
    String s7AltDescription =
            "\tThe knocking is as loud and fervent as ever. It's honestly impressive at this point.\n" +
            "\tBut, you just want it to stop. Do you open it?";

    String s8Description =
            "\tYour holy cloak sits on the chair. You aren't religious, it just has holes in it.\n" +
            "\tFor some reason this town has a no cloak, no boots, no service policy, so you keep wearing it.\n" +
            "\tYou should really find a job soon as winter is coming and this cloak won't hold out much longer\n" +
            "\tIs something you keep telling yourself." +
            "\tThere's a jar you've used as a latrine in the corner. It's filled with...liquid. Gross.\n";
    String s8AltDescription =
            "\tThe chair, that once had your cloak upon it, sits in the corner.\n" +
            "\tAs does the jar. Ew.";

    public String getS0Description() {
        return s0Description;
    }

    public String getS0AltDescription() {
        return s0AltDescription;
    }

    public String getS1Description() {
        return s1Description;
    }

    public String getS1AltDescription() {
        return s1AltDescription;
    }

    public String getS2Description() {
        return s2Description;
    }

    public String getS3Description() {
        return s3Description;
    }

    public String getS3AltDescription() {
        return s3AltDescription;
    }

    public String getS4Description() {
        return s4Description;
    }

    public String getS4AltDescription() {
        return s4AltDescription;
    }

    public String getS4SubDescription() {
        return s4SubDescription;
    }

    public String getS5Description() {
        return s5Description;
    }

    public String getS5AltDescription() {
        return s5AltDescription;
    }

    public String getS6Description() {
        return s6Description;
    }

    public String getS6AltDescription() {
        return s6AltDescription;
    }

    public String getS7Description() {
        return s7Description;
    }

    public String getS7AltDescription() {return s7AltDescription;}

    public String getS8Description() {
        return s8Description;
    }

    public String getS8AltDescription() {
        return s8AltDescription;
    }
}
