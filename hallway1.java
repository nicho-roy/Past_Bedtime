import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class livingRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hallway1 extends World
{

    /**
     * Constructor for objects of class livingRoom.
     * 
     */
    public hallway1(Player playerObj, Door door1) // Player player
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 200, 1); 
        if (door1.id == 1) {
            addObject(playerObj,100,50);
        }
        
        prepare();
        /*(if (playerObj.door == 1) {
            addObject(playerObj,100,0);
        }*/
        
    }
    private void prepare()
    {
        Door door2 = new Door(2);
        door2.setRotation(270);
        addObject(door2, 4,100);
    }
}
