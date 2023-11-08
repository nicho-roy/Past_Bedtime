import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Endings2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endings2 extends World
{

    /**
     * Constructor for objects of class Endings2.
     * 
     */
    public Endings2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 480, 1);
        showMessage2("Press b to go to next page of the collection", 200,460);
        showMessage2("Press v to go to the previous page",100,430);

    }
    
    public void showMessage2(String message,int x, int y){
        GreenfootImage cheese = getBackground();
        Font font= new Font(25);
        cheese.setFont(font); 
        cheese.setColor(Color.WHITE);
        cheese.drawString(message,x,y);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("b")){
            Greenfoot.setWorld(new Endings3());
        }
        else if (Greenfoot.isKeyDown("v")){
            Greenfoot.setWorld(new Endings());
        }
    }
}
