import java.util.Scanner;
/**
 * menu for hangman
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

        if (menuChoice == 1 )
        {
            HangmanEasy theGameEasy = new HangmanEasy();
            theGameEasy.onePlayerEasy();
        } 
        else if (menuChoice == 2)
        {
          HangmanMedium theGameMedium = new HangmanMedium();
          theGameMedium.onePlayerMedium();  
        }
        else if (menuChoice == 3)
        {
         HangmanHard theGameHard = new HangmanHard();
         theGameHard.onePlayerHard();
        }
        else 
        {
           System.out.println("sorry! The number you entered is not a choice");
        }
    }
}
