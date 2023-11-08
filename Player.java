import lang.stride.*;
import java.util.*;
import greenfoot.*;


public class Player extends Actor

{
    public int tick=0;
    public int walkTick=0;
    public int runTick=0;
    public int x;
    public int y;
    public String face; 
    public int sprint=0;
    public int stam=0;
    /**
     * Act - do whatever the player wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //walk();
        //tick();
        //movement();
        if (stam>0) {
        sprint();
        }
        moves();
        getPos();
        isMove();
        resetSprite();
        stamina();
    }
    public void moves() {
        if (Greenfoot.isKeyDown("w")) {
            tick++;
            face="up";
            setLocation(x, y-3-sprint);
            if (tick>0 && tick<20) {
                setImage("PlayerBackWalk1.png"); 
            }
            if (tick>20) {
                setImage("PlayerBackWalk2.png"); 
            }
            if (tick>40) {
                tick=1;
            }
        }
        if (Greenfoot.isKeyDown("a")) {
            tick++;
            face="left";
            setLocation(x-3-sprint, y);
            if (tick>0 && tick<20) {
                setImage("PlayerLeftWalk1.png");
            }
            if (tick>20) {
                setImage("PlayerLeftWalk2.png");
            }
            if (tick>40) {
                tick=1;
            }
        }
        if (Greenfoot.isKeyDown("s")) {
            tick++;
            face="down";
            setLocation(x, y+3+sprint);
            if (tick>0 && tick<20) {
                setImage("PlayerWalk1.png");
            }
            if (tick>20) {
                setImage("PlayerWalk2.png");
            }
            if (tick>40) {
                tick=1;
            }
        }
        if (Greenfoot.isKeyDown("d")) {
            tick++;
            face="right";
            setLocation(x+3+sprint, y);
            if (tick>0 && tick<20) {
                setImage("PlayerRightWalk1.png");
            }
            if (tick>20) {
                setImage("PlayerRightWalk2.png");
            }
            if (tick>40) {
                tick=1;
            }
        }
    }
    public void isMove() {
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("d")) {
            moves();
        }
        else {
            tick=0;
        }
    }
    public void resetSprite() {
        if (tick==0 && face=="up") {
            setImage("playerBackIdle.png");
        }
        if (tick==0 && face=="left") {
            setImage("PlayerLeftIdle.png");
        }
        if (tick==0 && face=="down") {
            setImage("PlayerIdleV5.png");
        }
        if (tick==0 && face=="right") {
            setImage("PlayerRightIdle.png");
        }
    }
    private void sprint() {
        if (Greenfoot.isKeyDown("shift")) {
            sprint=3;  //sprint multiplier
            stam=0;//stamina loss
            
        }
        else {
            sprint=0;
        }
    }
    public void stamina() {
        runTick++;
        if (stam<50 && runTick>20) {
            stam++;
            runTick=0;
        }
    }
    public void getPos() {
        x = getX();
        y = getY();
    }
    
    
    /*
    public void walk() {
    if (walkTick==0) {
        setImage("PlayerIdleV5.png");
    }
    if (walkTick>0 && walkTick<20) {
        setImage("PlayerWalk1.png");
    }
    if (walkTick==20) {
        setImage("PlayerWalk2.png");
    }
    if (walkTick==40) {
        walkTick=0;
    }
    }
    public void tick() {
        tick++;
    }
    public void movement() {
        if (Greenfoot.isKeyDown("w")) {
            setLocation(x, y-3);
            walkTick++;
        } else if  (Greenfoot.isKeyDown("a")) {
            setLocation(x-3, y);
            walkTick++;
        } else if (Greenfoot.isKeyDown("s")) {
            setLocation(x, y+3);
            walkTick++;
        } else if (Greenfoot.isKeyDown("d")) {
            setLocation(x+3, y);
            walkTick++;
        }
        else {
            walkTick=0;
        }
    }
    
    }
    */
}
