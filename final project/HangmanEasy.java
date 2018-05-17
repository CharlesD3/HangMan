import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/**
 * game of hangman, easy mode
 *
 * @author Hope Freebourn, Charles Dunn, Evan Hadley. 
 * @version 5/4/18 
 */
public class HangmanEasy implements Hintable 
{ 
    char[] enteredLettersEasy = new char[]{};
    
    String winningWord;

    boolean wordGuessed;

    int triesCount;

    private static final String[] easyWords = new String[] {"dog", "cat"};

    /**
     * Constructor for objects of class Hangman
     */
    public HangmanEasy()
    {
        // initialise instance variables
        winningWord = easyWords[ThreadLocalRandom.current().nextInt(easyWords.length)];//holds word chosen by random

        wordGuessed = false;

        triesCount = 0;

        onePlayerEasy();
    }
    /**
     *checks if user input is correct
     *Param: none
     *Return: true/false
     */
    public boolean enterLetterEasy()  
    {
        System.out.println("Guess a letter:");
        Scanner input = new Scanner(System.in);
        char userInput = input.nextLine().charAt(0);

        hint(userInput);
        if (isLetterInWord(userInput)) 
        {
            enteredLettersEasy[findEmptyPos()] = userInput;
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
            }//prints character if it is in the word
            else 
            {
                System.out.print("?");
            }//prints out ?
        }//if character is entered, it will run this
    }//end of print
    /**
     *One player game, easy mode
     *Param: none
     *Return: if letter was right or wrong/counts how many times word was guessed
     */
    public void onePlayerEasy()
    {
        print();//prints screen
        
        while (!wordGuessed)
        {
            if (enterLetterEasy())
            {
                System.out.println("That letter is in it");
            }//prints if letter is in it
            else
            {
                System.out.println("That letter is not in it");
            }//prints out if letter is not in it
            print();
            triesCount++;
        }//runs until word is guessed
        System.out.println("\nThe word is " + winningWord + "! It took you " + triesCount + " to guess that!");
    }//end of one player game/easy 
    /**
     * checks if letter is in the word
     * 
     *Param:
     *Return:
     */
    public boolean isLetterInWord(char letter) 
    {
        for (char c : winningWord.toCharArray()) 
        {
            if (c == letter) 
            {
                return true;
            }//if the character is the word, returns true
        }//checks if letter is in the word
        return false;
    }//end of isLetterInWord
    /**
     * Check if letter is in enteredLetters array
     *Param:
     *Return:
     */
    public boolean inEnteredLetters(char letter) 
    {
        for (char c : enteredLettersEasy)
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
     * 
     *Param:
     *Return:
     */
    public int findEmptyPos() 
    {
       
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
        if(userInput == '?' && triesCount < 10 )
        {
            System.out.println("\nOne letter is " + winningWord.charAt(giveLetter));
        }//prints out a letter in the word
    }//end of hint
}