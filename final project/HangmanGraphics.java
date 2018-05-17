import gpdraw.*;
import java.io.*;
/**import gpdraw.*;
/**
 * Write a description of class Hangman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HangmanGraphics
{
    private DrawingTool myPen;
    private SketchPad myPaper;
    public int attempts;
    public int attemptsEasy = 6;
    public int attemptsMed = 4;
    public int attemptsHard = 2;
    /**
     * Constructor for objects of class Hangman
     */
    public HangmanGraphics() throws IOException
    {
        myPaper = new SketchPad(1500,1500);
        myPen = new DrawingTool(myPaper);
        
        
        
    }//end of constructor
    public int attemptSelect(int menuChoice)
    {
        if(menuChoice == 1)
        {
            attempts = attemptsEasy;
        }
        else if (menuChoice == 2)
        {
            attempts = attemptsMed;
        }
        else if (menuChoice == 3)
        {
            attempts = attemptsHard;
        }
        return attempts;
    }
    public void man()
    {
        for (int x = 0; x < attempts; attempts++){
        if(x == 1)
        {
            myPen.forward(500);
            myPen.turnRight(90);
            myPen.forward(100);
            myPen.turnRight(90);
            myPen.forward(50);
            //head
        }
        else if (x == 2)
        {
            myPen.forward(500);
            myPen.turnRight(90);
            myPen.forward(100);
            myPen.turnRight(90);
            myPen.forward(50);
            //head
            myPen.up();
            myPen.forward(50);
            myPen.down();
            myPen.drawOval(100.0,100.0);
            //body
        }
        else if(x == 3)
        {
            myPen.forward(500);
            myPen.turnRight(90);
            myPen.forward(100);
            myPen.turnRight(90);
            myPen.forward(50);
            //head
            myPen.up();
            myPen.forward(50);
            myPen.down();
            myPen.drawOval(100.0,100.0);
            //body
            myPen.up();
            myPen.forward(50);
            myPen.down();
            myPen.forward(225);
            //left leg
        }
         else if(x == 4)
        {
            myPen.forward(500);
            myPen.turnRight(90);
            myPen.forward(100);
            myPen.turnRight(90);
            myPen.forward(50);
            //head
            myPen.up();
            myPen.forward(50);
            myPen.down();
            myPen.drawOval(100.0,100.0);
            //body
            myPen.up();
            myPen.forward(50);
            myPen.down();
            myPen.forward(225);
            //left leg
            myPen.turnRight(30);
            myPen.forward(50);
            //right leg
            myPen.up();
            myPen.turnRight(180);
            myPen.forward(50);
            myPen.down();
            myPen.turnRight(110);
            myPen.forward(50);
        }
        else if(x == 5)
        {
            myPen.forward(500);
            myPen.turnRight(90);
            myPen.forward(100);
            myPen.turnRight(90);
            myPen.forward(50);
            //head
            myPen.up();
            myPen.forward(50);
            myPen.down();
            myPen.drawOval(100.0,100.0);
            //body
            myPen.up();
            myPen.forward(50);
            myPen.down();
            myPen.forward(225);
            //left leg
            myPen.turnRight(30);
            myPen.forward(50);
            //right leg
            myPen.up();
            myPen.turnRight(180);
            myPen.forward(50);
            myPen.down();
            myPen.turnRight(110);
            myPen.forward(50);
            //right arm
            myPen.up();
            myPen.turnRight(180);
            myPen.turnRight(30);
            myPen.forward(180);
            myPen.turnRight(90);
            myPen.down();
            myPen.forward(50);
        }
        else if(x == 6)
        {
            myPen.forward(500);
            myPen.turnRight(90);
            myPen.forward(100);
            myPen.turnRight(90);
            myPen.forward(50);
            //head
            myPen.up();
            myPen.forward(50);
            myPen.down();
            myPen.drawOval(100.0,100.0);
            //body
            myPen.up();
            myPen.forward(50);
            myPen.down();
            myPen.forward(225);
            //left leg
            myPen.turnRight(30);
            myPen.forward(50);
            //right leg
            myPen.up();
            myPen.turnRight(180);
            myPen.forward(50);
            myPen.down();
            myPen.turnRight(110);
            myPen.forward(50);
            //right arm
            myPen.up();
            myPen.turnRight(180);
            myPen.turnRight(30);
            myPen.forward(180);
            myPen.turnRight(90);
            myPen.down();
            myPen.forward(50);
            //left arm
            myPen.up();
            myPen.turnRight(180);
            myPen.forward(50);
            myPen.turnRight(30);
            myPen.down();
            myPen.forward(50);
        }
     }
    }//end of man
}//end of Hangman

