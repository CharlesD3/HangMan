import java.util.Arrays;
import java.util.Scanner;
/**
 * game of hangman
 *
 * @author Hope Freebourn, Charles Dunn, Evan Hadley. 
 * @version 5/4/18 
 */
public class HangmanEasy
{ 
    int RandomWordEasy;

    char[] enteredLettersEasy;

    boolean wordGuessed;

    String[] easyWords;

    /**
     * Constructor for objects of class Hangman
     */
    public HangmanEasy()
    {
        // initialise instance variables
        String[] easyWords = {"cat", "tree","dog"}; 

        RandomWordEasy = (int) (Math.random() * easyWords.length); 

        enteredLettersEasy = new char[easyWords[RandomWordEasy].length()];

        wordGuessed = false;
    }

    /**
     * One player game
     *Param: choice
     *Return:
     */
    public void onePlayerEasy(int RandomWordEasy, char[] enteredLettersEasy )
    {
        int triesCount = 0;
            do
            {
                switch (enterLettereasy(easyWords[RandomWordEasy], enteredLettersEasy)) 
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
         
        System.out.println("\nThe word is " + easyWords[RandomWordEasy] + " You missed " + (triesCount -EmptyPosition(enteredLettersEasy)) + " time(s)");
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
        public static int enterLettereasy(String easyWords, char[] enteredLettersEasy)  
        {
        System.out.print("Guess a letter pls ");

        if (! print(easyWords, enteredLettersEasy))
        {
            return 3;
        }
        System.out.print(" > ");
        Scanner input = new Scanner(System.in);
        int emptyPosition = EmptyPosition(enteredLettersEasy);
        char userInput = input.nextLine().charAt(0);

        if (inEnteredLetters(userInput, enteredLettersEasy)) 
        {
            System.out.println(userInput + " is already in the word");
            return 2;
        }
        else if (easyWords.contains(String.valueOf(userInput))) 
        {
            enteredLettersEasy[emptyPosition] = userInput;
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