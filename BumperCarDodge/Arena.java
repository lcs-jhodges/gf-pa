import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An arena for the game to take place in
 * 
 * @Jack Hodges
 * @version (a version number or a date)
 */
public class Arena extends World
{
    // Instance variable
    int level;
    int fraps = 0;
    int time = 0;
    
    /**
     * Constructor for objects of class Arena.
     * 
     */
    public void act(){
        fraps = fraps + 1;
        time = fraps/60;
        
        showText("Time:" +time, 400, 50);
        

    }
    public Arena()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 525, 1); 

        // Level 1 to start


        // Add enemies
        
        addObject(new Enemy(), 100, 100);
        addObject(new Player(), 250,250);
        addObject(new Enemy(), 400, 400);
        addObject(new Enemy(), 475, 100);
        
        

    }
}
