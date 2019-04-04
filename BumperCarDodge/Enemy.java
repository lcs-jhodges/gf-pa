import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Car
{
    // Instance variable
    int speedMultiplier;
    
    /**
     * Constructor
     */
    Enemy(int level)
    {
        speedMultiplier = level;
    }
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (isAtEdge())
        {
            turn(17);
        }
        if (isTouching(Player.class))
        {
            Greenfoot.stop();
        }
        if (Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(45));

        }
        move(2*speedMultiplier);
    }
    
    /**
     * changeSpeed
     */
    void changeSpeed(int level)
    {
        speedMultiplier = level;
    }
}
