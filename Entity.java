import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.util.Vector;


/**
 * Write a description of class Entity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entity extends Actor
{
    public final static double MOVESPEED = 3.5;
    public int moveTick;
    public int playerX,playerY;
    public int x,y;
    
    private Vector2D move;
    
    public void act()
    {
        playerPos();
        getPosX();
        getPosY();
        move();
        sprite();
        kill();
    }
    
    
    
    public void move() {
        if (Player.class != null) {
            
            //set vector
            double difX = (playerX - getX());
            double difY = (playerY - getY());
            
            double magnitude = Math.sqrt( Math.pow(difX, 2) + Math.pow(difY, 2) );
            
            //Syntax
            /*
            double data = 52.6345
            Double newData = new Double(data);
            int value = newData.intValue();
            */
            
            double tempX = ( (1/magnitude) * difX );
            double tempY = ( (1/magnitude) * difY );
            
            
            //setup class
            Double newDataX = new Double(tempX) * MOVESPEED;
            int moveX = newDataX.intValue();
            
            Double newDataY = new Double(tempY) * MOVESPEED;
            int moveY = newDataY.intValue();
            
            
            //int moveX = ( (1/magnitude) * difX ); //move formula
            
            
            
            
            //moving
            setLocation(x + (moveX), y + (moveY ));
            
            
            /*
            //set vector
            Vector2D move = new Vector2D(playerX - getX(), playerY - getY());
            
            move.normalize();
            */
            
            /*
            move = Vector2D.multiply(move, MOVESPEED);
            Entity entity = new Entity();
            
            
            moving to player
            move = Vector.multiply(move, MOVESPEED);
            */
            
        }
    }
    
    public void kill() {
        List<Player> players = getObjectsInRange(110, Player.class);
        if (players.size() == 0) return;
        Player player = players.get(0);
        
        //Actor player = getOneIntersectingObject(Player.class);
        if (player != null) {
            //transition to kill yourself =]
            setLocation(100,100);
        }
    }
    public int getPosX() {
        x =getX();
        return x;
    }
    public int getPosY() {
        y =getY();
        return y;
    } 
    
    public void playerPos() {
        playerX = ((Player)getWorld().getObjects(Player.class).get(0)).getPosX();
        playerY = ((Player)getWorld().getObjects(Player.class).get(0)).getPosY();
        
        //setLocation(playerX+200, playerY);
    }
    public void sprite() {
        if (moveTick==30) {
            setImage("EntityWalk1V2.png");
        }
        if (moveTick==60) {
            setImage("EntityWalk2V3.png");
            moveTick=0;
        }
        moveTick++;
    }
}