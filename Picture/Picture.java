
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square sky;
    private Square wall;
    private Square wall1;
    private Square window;
    private Square window2;
    private Square grass;
    private Square doorTop;
    private Square doorBottom;
    private Triangle roof;
    private Circle sun;
    private Square towerTop;
    private Square towerMiddle;
    private Square towerBottom;
  

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
        this.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        //background sky
        sky = new Square(); 
        sky.moveVertical(-60);
        sky.moveHorizontal(-60);
        sky.changeSize(500);   
        sky.makeVisible();
        sky.changeColor("blue");
        
        //Base Wall left
        wall1 = new Square(); 
        wall1.moveVertical(80);
        wall1.changeSize(100);
        wall1.makeVisible();
        wall1.changeColor("black");
        
        //Base wall right
        wall = new Square(); 
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
        wall.changeColor("black");
        wall.moveHorizontal(100);
        
        //Grass
        grass = new Square(); 
        grass.moveVertical(160);
        grass.changeSize(300);
        grass.makeVisible();
        grass.changeColor("green");
        grass.moveHorizontal(-60);
        
        
        //Right upper window
        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        
        //left upper window
        
        window2 = new Square();
        window2.changeColor("white");
        window2.moveHorizontal(150);
        window2.moveVertical(100);
        window2.makeVisible();
        
        //Door top
        doorTop = new Square();
        doorTop.changeColor("white");
        doorTop.moveHorizontal(85);
        doorTop.moveVertical(100);
        doorTop.makeVisible();
        
        //Door Bottom
        doorBottom = new Square();
        doorBottom.changeColor("white");
        doorBottom.moveHorizontal(85);
        doorBottom.moveVertical(130);
        doorBottom.makeVisible();
        
        
        //Tower
        towerTop = new Square(); 
        towerTop.moveVertical(-10);
        towerTop.changeSize(50);
        towerTop.makeVisible();
        towerTop.changeColor("black");
        towerTop.moveHorizontal(23);
        
        towerMiddle = new Square(); 
        towerMiddle.moveVertical(0);
        towerMiddle.changeSize(50);
        towerMiddle.makeVisible();
        towerMiddle.changeColor("black");
        towerMiddle.moveHorizontal(23);
        
        towerBottom = new Square(); 
        towerBottom.moveVertical(30);
        towerBottom.changeSize(50);
        towerBottom.makeVisible();
        towerBottom.changeColor("black");
        towerBottom.moveHorizontal(23);
        
        
        //Roof 
        roof = new Triangle();
        roof.changeSize(50, 100);
        roof.moveHorizontal(60);
        roof.moveVertical(-10);
        roof.makeVisible();
        roof.changeColor("red");

        
        //Sun
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-50);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
