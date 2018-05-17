import gpdraw.*;
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
    /**
     * Constructor for objects of class Hangman
     */
    public HangmanGraphics()
    {
        myPaper = new SketchPad(1500,1500);
        myPen = new DrawingTool(myPaper);
        
        
        
    }//end of constructor
    public void man(int triescount)
    {   
        if(triesCount == 1)
        {
            myPen.forward(500);
            myPen.turnRight(90);
            myPen.forward(100);
            myPen.turnRight(90);
            myPen.forward(50);
            //head
        }
        else if (triesCount == 2)
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
        else if(triesCount == 3)
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
        else if(triesCount == 4)
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
        else if(triesCount == 5)
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
        else if(triesCount == 6)
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
    }//end of man
}//end of Hangman

