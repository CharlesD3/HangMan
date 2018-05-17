import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * menu for hangman classes
 *
 * @author Hope Freebourn, Charles Dunn, Evan Hadley. 
 * @version 5/4/18 
 */
public class ChoiceMenu
{
    /**
     * displays choice menu 
     *
     * @param  none
     * @return none
     */
    public void menuOption()
    {   
        ArrayList<Integer> options = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));

        System.out.println("Welcome to the game Hangman!");
        System.out.println("Choose which game you want to play");
        Scanner reader = new Scanner(System.in);  
        System.out.println("1. one player,easy level");
        System.out.println("2. one player,medium level");
        System.out.println("3. one player,hard level");
        System.out.println("4. two players,easy level");
        System.out.println("5. two players,medium level");
        System.out.println("6. two players,hard level");
        int menuChoice = reader.nextInt();

        Iterator<Integer> it = options.iterator();
        while (it.hasNext()) 
        {
            int value = it.next();
            if (value == 1 && menuChoice == 1)
            {  
                HangmanEasy theGameEasy = new HangmanEasy();
            } //end of if for choice one
            else if (value == 2 && menuChoice == 2)
            {    
                HangmanMedium theGameMedium = new HangmanMedium();
            }//end of else if for choice 2
            else if (value == 3 && menuChoice == 3)
            {
                HangmanHard theGameHard = new HangmanHard();
            }///end of else if for choice 3
            else 
            {
                System.out.println("sorry! what you entered is not a choice");
            }
        }//end of while loop that runs menu
    }//end of menu choice
}//end of class choiceMenu
