import java.util.Arrays;
import java.util.Scanner;
/**
 * Write a description of class HangmanTwoPlayers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HangmanTwoPlayers
{
    // instance variables - replace the example below with your own
    public String word;
    /**
     * Constructor for objects of class HangmanTwoPlayers
     */
    public HangmanTwoPlayers()
    {
        // initialise instance variables
        
    } 
    
     /**
     * gets user input
     * param: none 
     * return: user input statement
     */
    public String userInput()
    { 
        Scanner input = new Scanner(System.in);  
        System.out.println("Player one please enter the word you want the opponent to guess up to 6 letters");
        String word = input.nextLine();
        int nameLength = word.length();
        if (nameLength > 6){
            System.out.println("Your word is too long, please enter a number up to 6 characters.");
            word = input.nextLine();
           }
        return word;
    }//end of void userInput
}


