import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        sleep(2); //durmamos un poquito
        if (tired)
        {
         isSleepy();
        }
        if (bored)
        {
            dance();
        }
        if (hungry)
        {
            eat();
        }
        if (tired)
        {shoutHooray();}
        if (tired)
        {isSleepy();}
    }    
}
