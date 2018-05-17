import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/**
 * game of hangman
 *
 * @author Hope Freebourn, Charles Dunn, Evan Hadley. 
 * @version 5/4/18 
 */
public class HangmanMedium implements Hintable 
{ 
    char[] enteredLettersMedium = new char[]{};
    String winningWord;

    boolean wordGuessed;
    
    int triesCount;

    private static final String[] mediumWords = new String[] {"interesting", "computer", "program"};

    /**
     * Constructor for objects of class Hangman
     */
    public HangmanMedium()
    {
        // initialise instance variables
        winningWord = mediumWords[ThreadLocalRandom.current().nextInt(mediumWords.length)];//gets random word
        
        wordGuessed = false;
        triesCount = 0;
     
        onePlayerMedium();
    }//end of constructor
     /**
     * checks if user input is correct
     *
     *Param: none
     *Return: if the user guessed the answer right or wrong
     */
    public boolean enterLetterMedium()  
    {
        System.out.println("Guess a letter: ");
        Scanner input = new Scanner(System.in);
        char userInput = input.nextLine().charAt(0);
        if (isLetterInWord(userInput)) 
        {
            enteredLettersMedium[findEmptyPos()] = userInput;
            return true;
        }//checks if the character entered is correct
        else
        {
            return false;
        }//end of if- else
    }//end of enterLetterMedium
    /**
     * Print questionmarks for hidden letters 
     *Param: none
     *Return: ?? or letter in word
     */
    public void print() 
    {
        // Iterate through all letters in word
        System.out.println();
        for (char ch : winningWord.toCharArray()) 
        {
            if (inEnteredLetters(ch)) //if entered letter is in the word, then print the letter
            {
                System.out.print(ch);
            } 
            else //prints out questionmarks for hidden word
            {
                System.out.print("?");
            }//end of if-else
        }//end of for loop
    }//end of print
    /**
     * counts how many tries
     *Param: none
     *Return: if letter was right or wrong/ counts how many times word was guessed
     */
    public void onePlayerMedium()
    {
        int triesCount = 0;
        print();//prints results
        while (!wordGuessed) 
        {
            if (enterLetterMedium()) 
            {
                System.out.println("That letter is in it");
            }//prints if letter is found in word
            else
            {
                System.out.println("That letter is not in it");
            }//end of if-else
            print();
            triesCount++;
        }
        System.out.println("\nThe word is " + winningWord + "! It took you " + triesCount + " to guess that!");
    }//end of one player game/easy 
   
    public boolean isLetterInWord(char letter) 
    {
        for (char c : winningWord.toCharArray()) {
            if (c == letter) {
                return true;
            }
        }
        return false;
    }   
    /**
     * Check if letter is in enteredLetters array
     *Param:
     *Return:
     */
    public boolean inEnteredLetters(char letter) 
    {
        for (char c : enteredLettersMedium)
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
        while (enteredLettersMedium[i] != '\u0000') 
        {
            i++;
        }//end of whiele
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
        if(userInput == '?' && triesCount < 4 )
        {
            System.out.println("\nOne letter is " + winningWord.charAt(giveLetter));
        }//prints out a letter in the word
    }//end of hint
}