import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movers extends Actor
{
    /**
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       //
    }
    public void moveAndTurn(){
        //esto lo usare para poder mover mi obejto en cualquier parte del mapa
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(4);
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(188);
            move(4);
        }
        if(Greenfoot.isKeyDown("up")){
            setRotation(270);
            move(4);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(4);
        }
}
public void slideAround()
{
    int x = getX();
    int y = getY();
    //esto es para poder mover a mi personaje principal en cualquier parte que
    // dese el jugador. 
           if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x + 4, y);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(x - 4, y);
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(x, y-4);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(x, y + 4);
        } 
    
}
}
