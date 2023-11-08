import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class basementSpawn extends World
{

    /**
     * Constructor for objects of class livingRoom.
     */
    public basementSpawn(Player playerObj, Door door)
    {
        super(1000, 800, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player hero = new Player();
        addObject(hero,510,363);
        Entity entity = new Entity();
        addObject(entity,156,133);
        Door door1 = new Door(1);
        door1.setRotation(90);
        addObject(door1, 990,100);
    }
}
