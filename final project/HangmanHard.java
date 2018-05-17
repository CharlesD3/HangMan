import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * game of hangman
 *
 * @author Hope Freebourn, Charles Dunn, Evan Hadley. 
 * @version 5/4/18 
 */
public class HangmanHard implements Hintable
{ 
    char[] enteredLettersHard = new char[]{};
    String winningWord;

    boolean wordGuessed;
    
    int triesCount;

    private static final String[] hardWords = new String[] {"cat", "tree", "dog"};

    /**
     * Constructor for objects of class Hangman
     */
    public HangmanHard()
    {
        // initialise instance variables
        winningWord = hardWords[ThreadLocalRandom.current().nextInt(hardWords.length)];
        
        triesCount = 0;
        
        wordGuessed = false;

        onePlayerHard();
    }

    /**
     * checks if user input is correct
     *Param: none
     *Return: true/false
     */
    public boolean enterLetterEasy()  
    {
        System.out.println("Guess a letter pls > ");
        Scanner input = new Scanner(System.in);
        char userInput = input.nextLine().charAt(0);
        
        hint(userInput);
        if (isLetterInWord(userInput)) 
        {
            enteredLettersHard[findEmptyPos()] = userInput;
            return true;
        } //checks if the character entered is correct
        else
        {
            return false;
        }//end of if-else
    }//end of enterLetterEasy
    /**
     * Print questionmarks for hidden letters
     * 
     *Param: none
     *Return: ?? or letter
     */
    public void print() 
    {
        // Iterate through all letters in word
        System.out.println();
        for (char ch : winningWord.toCharArray()) 
        {
            if (inEnteredLetters(ch)) 
            {
                System.out.print(ch);
            } 
            else 
            {
                System.out.print("?");
            }
        }
    }//end of print
    /**
     * One player game
     *Param: none
     *Return: if letter was right or wrong/ counts how many times word was guessed
     */
    public void onePlayerHard()
    {
        int triesCount = 0;
        print();
        while (!wordGuessed)
        {
            if (enterLetterEasy())
            {
                System.out.println("That letter is in it");
            } else
            {
                System.out.println("That letter is not in it");
            }
            print();
            triesCount++;
        }
        System.out.println("\nThe word is " + winningWord + "! It took you " + triesCount + " to guess that!");
    }//end of one player game/easy 
    /**
     * 
     *Param:
     *Return:
     */
    public boolean isLetterInWord(char letter) {
        for (char c : winningWord.toCharArray()) 
        {
            if (c == letter) 
            {
                return true;
            }
        }
        return false;
    }//end of isLetterInWord

    /**
     * Check if letter is in enteredLetters array
     *Param:
     *Return:
     */
    public boolean inEnteredLetters(char letter) 
    {
        for (char c : enteredLettersHard)
        {
            if(c == letter)
            {
                return true;
            }//end of if

        }//end of for each loop
        return false;
    }//end of inEnteredLetters
    /**
     * Find first empty position in array of entered letters
     *Param:
     *Return:
     */
    public int findEmptyPos() 
    {
        int i = 0;
        while (enteredLettersHard[i] != '\u0000') 
        {
            i++;
        }//end of findEmptyPos
        return i;
    }//end of findEmptyPos
    /**
     * gives user hint
     *
     *Param:
     *Return:
     */
    public void hint (int userInput)
    {   
        System.out.println("Press ? for a hint");
        int giveLetter = 0;
        if(userInput == '?' && triesCount < 2)
        {
            System.out.println("\nOne letter is " + winningWord.charAt(giveLetter));
            
        }//prints out a letter in the word
    }//end of hint
}
