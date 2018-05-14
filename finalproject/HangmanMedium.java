import java.util.Arrays;
import java.util.Scanner;
/**
 * game of hangman
 *
 * @author Hope Freebourn, Charles Dunn, Evan Hadley. 
 * @version 5/4/18 
 */
public class HangmanMedium
{ 
    int RandomWordMedium;

    char[] enteredLettersMedium;

    boolean wordGuessed;

    String[] mediumWords;

    /**
     * Constructor for objects of class Hangman
     */
    public HangmanMedium()
    {
        // initialise instance variables
        mediumWords = new String[] {"cat", "tree","dog"}; 

        RandomWordMedium = (int) (Math.random() * mediumWords.length); 

        enteredLettersMedium = new char[mediumWords[RandomWordMedium].length()];

        wordGuessed = false;
        
        onePlayerMedium(RandomWordMedium, enteredLettersMedium);
    }

    /**
     * One player game
     *Param: choice
     *Return:
     */
    public void onePlayerMedium(int RandomWordMedium, char[] enteredLettersMedium )
    {
        int triesCount = 0;
            do
            {
                switch (enterLetterMedium(mediumWords[RandomWordMedium], enteredLettersMedium)) 
                {
                    case 0:
                    triesCount++;
                    break;
                    case 1:
                    triesCount++;
                    break;
                    case 2:
                    break;
                    case 3:
                    wordGuessed = true;
                    break;
                }
            }
            while(wordGuessed != false);
         
        System.out.println("\nThe word is " + mediumWords[RandomWordMedium] + " You missed " + (triesCount -EmptyPosition(enteredLettersMedium)) + " time(s)");
        }
        //end of one player game/ easy 
        /**
         *  Hint user to enter a guess letter,
         *returns 0 if letter entered is not in the word (counts as try),
         *returns 1 if letter were entered 1st time (counts as try),
         *returns 2 if already guessed letter was REentered,
         *returns 3 if all letters were guessed
         *Param:
         *Return:
         */
        public static int enterLetterMedium(String mediumWords, char[] enteredLettersMedium)  
        {
        System.out.print("Guess a letter pls ");

        if (! print(mediumWords, enteredLettersMedium))
        {
            return 3;
        }
        System.out.print(" > ");
        Scanner input = new Scanner(System.in);
        int emptyPosition = EmptyPosition(enteredLettersMedium);
        char userInput = input.nextLine().charAt(0);

        if (inEnteredLetters(userInput, enteredLettersMedium)) 
        {
            System.out.println(userInput + " is already in the word");
            return 2;
        }
        else if (mediumWords.contains(String.valueOf(userInput))) 
        {
            enteredLettersMedium[emptyPosition] = userInput;
            return 1;
        }
        else {
            System.out.println(userInput + " is not in the word");
            return 0;
        }
    }

    /* Print word with asterisks for hidden letters, returns true if
    asterisks were printed, otherwise return false */

    public static boolean print(String word, char[] enteredLetters) {
        // Iterate through all letters in word
        boolean asteriskPrinted = false;
        for (int i = 0; i < word.length(); i++) 
        {
            char letter = word.charAt(i);
            // Check if letter already have been entered bu user before
            if (inEnteredLetters(letter, enteredLetters))
                System.out.print(letter); // If yes - print it
            else {
                System.out.print('?');
                asteriskPrinted = true;
            }
        }
        return asteriskPrinted;
    }//end of print
    /**
     * Check if letter is in enteredLetters array
     *Param:
     *Return:
     */
    public static boolean inEnteredLetters(char letter, char[] enteredLetters) 
    {
        return new String(enteredLetters).contains(String.valueOf(letter));
    }//end of inEnteredLetters
    /**
     * Find first empty position in array of entered letters
     *Param:
     *Return:
     */
    public static int EmptyPosition(char[] enteredLetters) 
    {
        int i = 0;
        while (enteredLetters[i] != '\u0000') i++;
        return i;
    }//end of EmptyPosition
}