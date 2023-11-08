import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World{
    private long startTime;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(720,800, 1);
        startTime = System.currentTimeMillis();
        showText("Game Programming 1",250,500);
        showName("Nicholas Roy, Nicholas Marijon and Daniel Perrotta",100,550);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act()
    {
    if (System.currentTimeMillis() - startTime >= 3000) { // splash screen 3 seconds
         Greenfoot.setWorld(new startScreen());
            }
    }
    public void showText(String message,int x, int y)
    {
        GreenfootImage ch = getBackground();
        Font font= new Font(25);
        ch.setFont(font); 
        ch.setColor(Color.WHITE);
        ch.drawString(message,x,y);
    }
    public void showName(String message, int x, int y)
    {
        GreenfootImage nsh = getBackground();
        Font font= new Font(25);
        nsh.setFont(font);
        nsh.setColor(Color.WHITE);
        nsh.drawString(message,x,y);
    }
}

