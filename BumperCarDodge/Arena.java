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

    /**
     * Constructor for objects of class Arena.
     * 
     */
    public Arena()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 525, 1); 

        // Level 1 to start
        level = 1;

        // Add enemies
        Enemy enemy1 = new Enemy(level);
        addObject(enemy1, 0, 0);
        
        enemy1.changeSpeed(10);

    }
}
