import java.util.Arrays;
import java.util.Scanner;
/**
 * game of hangman
 *
 * @author Hope Freebourn, Charles Dunn, Evan Hadley. 
 * @version 5/4/18 
 */
public class HangmanHard
{ 
    int RandomWordHard;

    char[] enteredLettersHard;

    boolean wordGuessed;

    String[] hardWords;

    /**
     * Constructor for objects of class Hangman
     */
    public HangmanHard()
    {
        // initialise instance variables
        hardWords = new String[] {"cat", "tree","dog"}; 

        RandomWordHard = (int) (Math.random() * hardWords.length); 

        enteredLettersHard = new char[hardWords[RandomWordHard].length()];

        wordGuessed = false;
        
        onePlayerHard(RandomWordHard, enteredLettersHard);
    }

    /**
     * One player game
     *Param: choice
     *Return:
     */
    public void onePlayerHard(int RandomWordHard, char[] enteredLettersHard )
    {
        int triesCount = 0;
            do
            {
                switch (enterLetterHard(hardWords[RandomWordHard], enteredLettersHard)) 
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
         
        System.out.println("\nThe word is " + hardWords[RandomWordHard] + " You missed " + (triesCount -EmptyPosition(enteredLettersHard)) + " time(s)");
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
        public static int enterLetterHard(String hardWords, char[] enteredLettersHard)  
        {
        System.out.print("Guess a letter pls ");

        if (! print(hardWords, enteredLettersHard))
        {
            return 3;
        }
        System.out.print(" > ");
        Scanner input = new Scanner(System.in);
        int emptyPosition = EmptyPosition(enteredLettersHard);
        char userInput = input.nextLine().charAt(0);

        if (inEnteredLetters(userInput, enteredLettersHard)) 
        {
            System.out.println(userInput + " is already in the word");
            return 2;
        }
        else if (hardWords.contains(String.valueOf(userInput))) 
        {
            enteredLettersHard[emptyPosition] = userInput;
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
