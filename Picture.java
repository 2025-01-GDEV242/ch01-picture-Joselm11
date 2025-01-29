/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square frame;
    private Square glass;
    private Triangle T1;
    private Triangle T2;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        frame = new Square();
        glass = new Square();
        T1 = new Triangle(); 
        T2 = new Triangle();
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            frame.moveHorizontal(-130);
            frame.moveVertical(80);
            frame.changeSize(100);
            frame.makeVisible();
            
            glass.changeColor("blue");
            glass.moveHorizontal(-120);
            glass.moveVertical(40);
            glass.changeSize(40);
            glass.makeVisible();
    
            T1.changeSize(-60, 100);
            T1.moveHorizontal(20);
            T1.moveVertical(0);
            T1.makeVisible();
            
            T2.changeSize(60, 100);
            T2.moveHorizontal(20);
            T2.moveVertical(0);
            T2.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        frame.changeColor("white");
        glass.changeColor("black");
        T1.changeColor("black");
        T1.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        frame.changeColor("black");
        glass.changeColor("black");
        T1.changeColor("green");
        T1.changeColor("green");
        sun.changeColor("yellow");
    }
}
