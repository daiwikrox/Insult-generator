
/**
 * Write a description of class Discard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Insult
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main (String [] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("choose a number from one to ten and your insult will be generated");
        String f = c.nextLine();
        if(f.equals("1")){
            System.out.print("you are a numbskull");
        }
        else if(f.equals("2")){
            System.out.print("you are a farting chickenheaded monster");
        }
        else  if(f.equals("3")){
            System.out.print("you are a dumbheaded boar");
        }
        else   if(f.equals("4")){
            System.out.print("you smell like a skunk's poop");
        }
        else if(f.equals("5")){
            System.out.print("you are a big hairy gorilla");
        }
        else if(f.equals("6")) {
            System.out.print("you are the pride of a pig sty.which is not a good thing") ;  
        }
        else if(f.equals("7")) {
            System.out.print("you are the smallest,most stinkiest,and most pooping pooper baby ever");
        }
        else if (f.equals("8")) {
            System.out.print("you have no sense of personal hygiene");
        }
        else if (f.equals("9")) {
            System.out.print("you are born to die");
        }
        else if (f.equals("10")) {
            System.out.print("you are the kid of troll doll and rupert grint");  
        }
    }

}     

        
        
        
