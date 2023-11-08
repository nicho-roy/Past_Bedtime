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
    public basementSpawn()
    {
        super(1000, 800, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player Player = new Player();
        addObject(Player,510,363);
    }
}
