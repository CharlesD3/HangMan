import gpdraw.*;

/**
 * draws hangman
 * 
 * @author Hope F, Evan H, Charles D.
 * @version 5/7/18
 */
public class HangmanGraphics 
{
    private DrawingTool myPen;
    private SketchPad myPaper;
    private int triesCount; 
    private final int SCALE = 1; 
    /**
     * Constructor for objects of class Hangman
     */
    public HangmanGraphics()
    {
        myPaper = new SketchPad(1000,1000);
        myPen = new DrawingTool(myPaper);
        triesCount = 6;
        man(); 
    }//end of constructor
    /**
 * draws hangman
 * 
 * @author Hope F, Evan H, Charles D.
 * @version 5/7/18
 */
    public void man()
    {   

        //This draws the stool 
        myPen.setDirection(0);
        myPen.forward(300*SCALE);  
        resetPos(); 
        for(int x=10; x <=300*SCALE; x+=10)
        {
            myPen.up();
            myPen.move(x, 0);
            myPen.down();
            myPen.setDirection(270);
            myPen.forward(50*SCALE);       
        }//end of for loop

        //This draws the post
        resetPos(); 
        myPen.setDirection(90);
        myPen.forward(300*SCALE);
        myPen.setDirection(0);
        myPen.forward(150*SCALE);
        myPen.setDirection(270);
        myPen.forward((300*SCALE)/3);
        if(triesCount == 1)
        {
            head(); 
        }//end of if
        if(triesCount == 2)
        {
            head(); 
            torso(); 

        }//end of if
        if(triesCount == 3)
        {
            head(); 
            torso(); 
            leftArm();

        }//end of if
        if(triesCount == 4)
        {
            head(); 
            torso(); 
            leftArm(); 
            rightArm(); 

        }//end of if
        if(triesCount == 5)
        {
            head(); 
            torso(); 
            leftArm(); 
            rightArm(); 
            leftLeg(); 
        }//end of if
        if(triesCount == 6)
        {
            head(); 
            torso(); 
            leftArm(); 
            rightArm();
            leftLeg(); 
            rightLeg();           
        }//end of if
        else
        {
            System.out.println("NO TRIES! AMAZING JOB!");
        }//end of else
    }//end of mano
    public void resetPos()
    {
        myPen.up();
        myPen.move(0,0);
        myPen.down(); 
    }//end of restPos

    public void head()
    {
        //DrawsTheHead
        myPen.up();
        myPen.forward(20*SCALE);
        myPen.down(); 
        myPen.drawCircle(20*SCALE);
    }//end of head

    public void torso()
    {
        //draws the Torso
        myPen.up();
        myPen.setDirection(270);
        myPen.forward(20*SCALE);
        myPen.down();
        myPen.forward(60*SCALE);
    }//enf of torso

    public void leftArm()
    {
        //draws left arm
        myPen.up();
        myPen.setDirection(90);
        myPen.forward(30*SCALE);
        myPen.down(); 
        myPen.setDirection(135);
        myPen.forward(30*SCALE);
        myPen.setDirection(315);
        myPen.forward(30*SCALE);
    }//end of leftArm

    public void rightArm()
    {
        //draws right arm
        myPen.setDirection(45);
        myPen.forward(30*SCALE);
        myPen.setDirection(225);
        myPen.forward(30*SCALE);
        myPen.setDirection(270);
        myPen.forward(30*SCALE);
    }//end of rightArm

    public void leftLeg()
    {
        //draws left leg
        myPen.setDirection(225);
        myPen.forward(30*SCALE);
        myPen.setDirection(45);
        myPen.forward(30*SCALE);
    }//end of leftLeg

    public void rightLeg()
    {
        //right leg
        myPen.setDirection(315);
        myPen.forward(30*SCALE);
    }//end of rightLeg
}//end of Hangman


