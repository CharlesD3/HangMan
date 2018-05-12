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
    private int x;

    /**
     * Constructor for objects of class HangmanTwoPlayers
     */
    public HangmanTwoPlayers()
    {
        // initialise instance variables
        x = 0;
    } 
    
      /**
     * gets user input
     * param: none 
     * return: user input statement
     */
    public void userInput()
    { 
        Scanner reader = new Scanner(System.in);  
        System.out.println("Enter a word you want the opponent to guess:(NO CAPS)");
        String wordUsed = reader.nextLine();
    }//end of void userInput

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
