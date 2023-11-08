import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Endings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endings extends World
{
    ArrayList<String> endings = new ArrayList<String>();
    int currentEnding = 0;
    int buffer = 1;
    /**
     * Constructor for objects of class Endings.
     * 
     */
    public Endings()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 480, 1); 
        showMessage("Press n to go to next page of the collection", 200,460);
        showMessage("Press m to go to the start menu",100,430);
        //setBackground(new GreenfootImage("endingbackground1.jpg"));
        //endings.add("endingbackground1.jpg");
        //endings.add("endingbackground2(final2).png");
    }

    public void showMessage(String message,int x, int y){
        GreenfootImage cheese = getBackground();
        Font font= new Font(25);
        cheese.setFont(font); 
        cheese.setColor(Color.WHITE);
        cheese.drawString(message,x,y);
    }

    public void act()
    {
        //buffer--;
        //if (buffer <= 0) {
            //System.out.println("buffer active");
            if (Greenfoot.isKeyDown("n")) {
                //buffer = 5;
                //if (currentEnding + 1 < endings.size()); {
                 //   currentEnding++;
                  //  System.out.println(currentEnding);
                  //  setBackground(new GreenfootImage(endings.get(currentEnding)));
                //}  
                Greenfoot.setWorld(new Endings2());
            }
            else if (Greenfoot.isKeyDown("m")){
                //buffer = 5;
                //if (currentEnding + 1 < endings.size()); {
                //    currentEnding--;
                //    setBackground(new GreenfootImage(endings.get(currentEnding)));
              //  }
                Greenfoot.setWorld(new startScreen());
            }
        }
    }
    