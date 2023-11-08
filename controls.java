import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class controls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class controls extends World
{

    /**
     * Constructor for objects of class controls.
     * 
     */
    public controls()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 400, 1); 
        showControls("Green for player perspective",5,30);
        showControls("Press w to go up",5,90);
        showControls("Press a to go left",5,120);
        showControls("Press s to go down",5,150);
        showControls("Press d to go right",5,180);
        showControls("Press shift to run",5,210);
        showControls("Press spacebar for flashlight",5,240);
        showControls("Press e to interact",5,270);
        line(327,0,327,400);
        showControls2("Orange for Cowboy perspective",330,30);
        showControls2("Press a to go left",330,90);
        showControls2("Press d to go right",330,120);
        showControls2("Press spacebar to jump",330,150);
        showControls2("Left click mouse to shoot",330,180);
    }
    
    public void act()
    {
        transitionToGameMessage("Press Enter to start", 400,330);
        transitionToGameMessage("Press m to go back to menu", 400,380);
        transitionToGame();
    }
    
    public void showControls(String message, int x, int y)
    {
        GreenfootImage sc = getBackground();
        Font font = new Font(25);
        sc.setFont(font);
        sc.setColor(Color.GREEN);
        sc.drawString(message,x,y);    
    }
    
    public void transitionToGameMessage(String message,int x, int y)
    {
        GreenfootImage tg = getBackground();
        Font font = new Font(25);
        tg.setFont(font);
        tg.setColor(Color.WHITE);
        tg.drawString(message,x,y);

           
        }
    
    public void transitionToGame()
    {
        if (Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new basementSpawn());
        }
        else if (Greenfoot.isKeyDown("m")){
            Greenfoot.setWorld(new startScreen());
        }
    }
    public void showControls2(String message, int x, int y)
    {
       GreenfootImage text = getBackground();
       Font font = new Font(25);
       text.setFont(font);
       text.setColor(Color.ORANGE);
       text.drawString(message,x,y);
    }
    
    public void line(int x1, int y1, int x2, int y2)
    {
        GreenfootImage fx = getBackground();
        fx.setColor(Color.BLUE);
        fx.drawLine(x1,y1,x2,y2);
    }
    
}
