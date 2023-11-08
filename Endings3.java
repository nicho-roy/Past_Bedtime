import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Endings3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endings3 extends World
{

    /**
     * Constructor for objects of class Endings3.
     * 
     */
    public Endings3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 480, 1); 
        showMessage3("Press enter to start game", 200,460);
        showMessage3("Press m to go to the previous page",100,430);
    }
    
    public void showMessage3(String message,int x, int y){
        GreenfootImage cheese = getBackground();
        Font font= new Font(25);
        cheese.setFont(font); 
        cheese.setColor(Color.WHITE);
        cheese.drawString(message,x,y);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("Enter")){
            Greenfoot.setWorld(new basementSpawn());
        }
        else if (Greenfoot.isKeyDown("m")){
            Greenfoot.setWorld(new Endings2());
        }
    }
}