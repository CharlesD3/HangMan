
import gpdraw.*;
/**
 * Write a description of class Hangman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hangman
{
    private DrawingTool myPen;
    private SketchPad myPaper;
    /**
     * Constructor for objects of class Hangman
     */
    public Hangman()
    {
       myPaper = new SketchPad(1500,1500);
       myPen = new DrawingTool(myPaper);
    }
    public void man()
    {
        myPen.forward(500);
        myPen.turnRight(90);
        myPen.forward(100);
        myPen.turnRight(90);
        myPen.forward(50);
        myPen.up();
        myPen.forward(50);
        myPen.down();
        myPen.drawOval(100.0,100.0);
        myPen.up();
        myPen.forward(50);
        myPen.down();
        myPen.forward(225);
        myPen.turnRight(30);
        myPen.forward(50);
        myPen.up();

    }
}
