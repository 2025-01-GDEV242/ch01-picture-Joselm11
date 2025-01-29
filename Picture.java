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
    private Square frame2;
    private Square glass2;
    private Triangle T1;
    private Triangle T2;
    private Circle sand1;
    private Circle sand2;
    private Circle sand3;
    private Circle sand4;
    private Person stuck;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        frame = new Square();
        glass = new Square();
        frame2 = new Square();
        glass2 = new Square();
        T1 = new Triangle(); 
        T2 = new Triangle();
        sand1 = new Circle();
        sand2 = new Circle();
        sand3 = new Circle();
        sand4 = new Circle();
        stuck = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            frame.moveHorizontal(-130);
            frame.moveVertical(90);
            frame.changeSize(100);
            frame.makeVisible();
            
            glass.changeColor("green");
            glass.moveHorizontal(-120);
            glass.moveVertical(90);
            glass.changeSize(80);
            glass.makeVisible();
            
            
            frame2.moveHorizontal(-130);
            frame2.moveVertical(-130);
            frame2.changeSize(100);
            frame2.makeVisible();
            
            glass2.changeColor("green");
            glass2.moveHorizontal(-120);
            glass2.moveVertical(-110);
            glass2.changeSize(80);
            glass2.makeVisible();
    

            T1.changeSize(-60, 100);
            T1.moveHorizontal(20);
            T1.moveVertical(10);
            T1.makeVisible();
            
            
            T2.changeSize(60, 100);
            T2.moveHorizontal(20);
            T2.moveVertical(10);
            T2.makeVisible();
    
            
            sand1.moveHorizontal(0);
            sand1.moveVertical(-40);
            sand1.changeSize(40);
            sand1.makeVisible();
            
            
            sand2.moveHorizontal(-25);
            sand2.moveVertical(-10);
            sand2.changeSize(40);
            sand2.makeVisible();
            
            
            sand3.moveHorizontal(-25);
            sand3.moveVertical(80);
            sand3.changeSize(40);
            sand3.makeVisible();
            
            
            sand4.moveHorizontal(-25);
            sand4.moveVertical(130);
            sand4.changeSize(40);
            sand4.makeVisible();
            
            
            stuck.moveHorizontal(-20);
            stuck.moveVertical(80);
            stuck.changeSize(40,20);
            stuck.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        frame.changeColor("black");
        frame2.changeColor("black");
        glass.changeColor("white");
        glass2.changeColor("white");
        T1.changeColor("black");
        T2.changeColor("black");
        sand1.changeColor("black");
        sand2.changeColor("black");
        sand3.changeColor("black");
        sand4.changeColor("black");
        stuck.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        frame.changeColor("black");
        frame2.changeColor("black");
        glass.changeColor("blue");
        glass2.changeColor("blue");
        T1.changeColor("blue");
        T2.changeColor("blue");
        sand1.changeColor("yellow");
        sand2.changeColor("yellow");
        sand3.changeColor("yellow");
        sand4.changeColor("yellow");
        stuck.changeColor("magenta");
    }
}
