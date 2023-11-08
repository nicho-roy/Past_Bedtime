import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class startScreen here.
 * @author (your name) @version (a version number or a date)
 */
public class startScreen extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class startScreen.
     */
    public startScreen()
    {
        super(600, 800, 1);
        showBox1(180,620,275,40);
        showBox2(180,675,275,40);
        showBox3(180,730,275,40);
    }
    
    public void act()
    {
        transitionToGame();
        transitionToControls();
        transitionToEndings();
    }

    /**
     * 
     */
    public void showFontWithBigBlackText(String message,int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font= new Font(25);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message,x,y);
    }
    
    public void showBox1(int x, int y, int width, int height)
    {
        GreenfootImage box = getBackground();
        box.setColor(Color.RED);
        box.fillRect(x,y,width,height);
        box.drawRect(x,y,width,height);
        showFontWithBigBlackText("Press Enter to start",220,650);
    }
    
    public void transitionToGame()
    {
        if (Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new basementSpawn());
        }

    }
    
    public void transitionToControls()
    {
        if (Greenfoot.isKeyDown("c")){
            Greenfoot.setWorld(new controls());
        }
    }
    
    public void transitionToEndings()
    {
        if (Greenfoot.isKeyDown("e")){
            Greenfoot.setWorld(new Endings());
        }
    }
    
    public void showBox2(int x, int y, int width, int height)
    {
        GreenfootImage box2 = getBackground();
        box2.setColor(Color.RED);
        box2.fillRect(x,y,width,height);
        box2.drawRect(x,y,width,height);
        showFontWithBigBlackText("Press c to see controls",200,710);
    }
    
    public void showBox3(int x, int y, int width, int height)
    {
        GreenfootImage box3 = getBackground();
        box3.setColor(Color.RED);
        box3.fillRect(x,y,width,height);
        box3.drawRect(x,y,width,height);
        showFontWithBigBlackText("Press e to see endings",200,765);
    }
}