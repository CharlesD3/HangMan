import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * game of hangman, easy mode
 *
 * @author Hope Freebourn, Charles Dunn, Evan Hadley. 
 * @version 5/4/18 
 */
public class HangmanMedium implements Hintable 
{ 
    char[] enteredLettersMedium = new char[100];
    char userInput;

    String winningWord;

    boolean wordGuessed;

    int triesCount;
    int position = mediumWords.length;

    private static final String[] mediumWords = new String[] {"Program", "computer", "advanced"};
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

    }
    /**
     *checks if user input is correct
     *Param: none
     *Return: true/false
     */
    public boolean enterLetterMedium()  
    {
        System.out.println("Guess a letter:");
        Scanner input = new Scanner(System.in);
        userInput = input.nextLine().charAt(0);

        hint(userInput);


        if (isLetterInWord(userInput)) 
        {
            enteredLettersMedium[findEmptyPos()] = userInput;
            return true;
        }

        else
        {
            return false;
        }//end of if-el
    } //checks if the character entered is correct
    /**
     * Print questionmarks or hidden letters
     * 
     *Param: none
     *Return: ?? or letter
     */
    public void print() 
    {
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
    public void onePlayerMedium()
    {
        print();//prints screen
        while (!wordGuessed)
        {
            if (enterLetterMedium())
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
        int empty = 0;
        //System.out.println(mediumWords[i]);
        //winningWord
        while (enteredLettersMedium[i] == '*') 
        {
           if (winningWord.charAt(i) == userInput)
            {
              return i;
           }//ends the if
           i++;
        }//end of while
        return empty;
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
        if(userInput == '?' && triesCount < 6 )
        {
            System.out.println("\nOne letter is " + winningWord.charAt(giveLetter));
        }//prints out a letter in the word
    }//end of hint
}
