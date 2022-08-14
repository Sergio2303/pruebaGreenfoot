import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        walls walls = new walls();
        addObject(walls,0,11*50);
        walls walls3 = new walls();
        addObject(walls3,0,9*50);
        walls walls4 = new walls();
        addObject(walls4,0,8*50);
        walls walls5 = new walls();
        addObject(walls5,0,7*50);
        walls walls6 = new walls();
        addObject(walls6,3*50,11*50);
        walls walls7 = new walls();
        addObject(walls7,3*50,10*50);
        walls walls8 = new walls();
        addObject(walls8,3*50,9*50);
        walls walls9 = new walls();
        addObject(walls9,1*50,7*50);
        walls walls10 = new walls();
        addObject(walls10,2*50,7*50);
        walls walls11 = new walls();
        addObject(walls11,4*50,7*50);
        walls walls12 = new walls();
        addObject(walls12,3*50,7*50);
        walls walls13 = new walls();
        addObject(walls13,5*50,10*50);
        walls walls14 = new walls();
        addObject(walls14,8*50,11*50);
        walls walls15 = new walls();
        addObject(walls15,8*50,10*50);
        walls walls16 = new walls();
        addObject(walls16,8*50,9*50);
        walls walls17 = new walls();
        addObject(walls17,8*50,8*50);
        walls walls18 = new walls();
        addObject(walls18,8*50,7*50);
        walls walls19 = new walls();
        addObject(walls19,8*50,6*50);
        walls walls20 = new walls();
        addObject(walls20,7*50,6*50);
        walls walls21 = new walls();
        addObject(walls21,6*50,6*50);
        walls walls22 = new walls();
        addObject(walls22,6*50,5*50);
        walls walls23 = new walls();
        addObject(walls23,6*50,3*50);
        walls walls24 = new walls();
        addObject(walls24,6*50,4*50);
        walls walls25 = new walls();
        addObject(walls25,7*50,2*50);
        walls walls26 = new walls();
        addObject(walls26,8*50,2*50);
        walls walls27 = new walls();
        addObject(walls27,8*50,1*50);
        walls walls28 = new walls();
        addObject(walls28,7*50,1*50);
        walls walls29 = new walls();
        addObject(walls29,6*50,1*50);
        walls walls30 = new walls();
        addObject(walls30,5*50,1*50);
        walls walls31 = new walls();
        addObject(walls31,4*50,1*50);
        walls31.setLocation(4,1);
        walls walls32 = new walls();
        addObject(walls32,4*50,1*50);
        walls walls33 = new walls();
        addObject(walls33,4*50,2*50);
        walls walls34 = new walls();
        addObject(walls34,4*50,3*50);
        walls walls35 = new walls();
        addObject(walls35,3*50,2*50);
        walls walls36 = new walls();
        addObject(walls36,2*50,2*50);
        walls walls37 = new walls();
        addObject(walls37,2*50,1*50);
        walls walls38 = new walls();
        addObject(walls38,1*50,2*50);
        walls walls39 = new walls();
        addObject(walls39,1*50,3*50);
        walls walls40 = new walls();
        addObject(walls40,1*50,4*50);
        walls walls41 = new walls();
        addObject(walls41,1*50,5*50);
        walls walls42 = new walls();
        addObject(walls42,9*50,4*50);
        walls walls43 = new walls();
        addObject(walls43,10*50,4*50);
        walls walls44 = new walls();
        addObject(walls44,11*50,1*50);
        walls walls45 = new walls();
        addObject(walls45,11*50,2*50);
        walls walls46 = new walls();
        addObject(walls46,11*50,0*50);
        walls walls47 = new walls();
        addObject(walls47,10*50,0*50);
        walls walls48 = new walls();
        addObject(walls48,10*50,1*50);
        walls walls49 = new walls();
        addObject(walls49,10*50,2*50);
        walls walls50 = new walls();
        addObject(walls50,10*50,5*50);
        walls walls51 = new walls();
        addObject(walls51,11*50,5*50);
        walls walls52 = new walls();
        addObject(walls52,11*50,6*50);
        walls walls53 = new walls();
        addObject(walls53,11*50,7*50);
        walls walls54 = new walls();
        addObject(walls54,10*50,7*50);
        walls walls55 = new walls();
        addObject(walls55,11*50,8*50);
        walls walls56 = new walls();
        addObject(walls56,10*50,9*50);
        walls walls57 = new walls();
        addObject(walls57,11*50,10*50);
        removeObject(walls57);
        addObject(walls57,10*50,10*50);
        walls walls58 = new walls();
        addObject(walls58,10*50,8*50);
        addObject(walls58,148,576);
        walls58.setLocation(131,583);
        walls walls59 = new walls();
        addObject(walls59,400,576);
        walls walls60 = new walls();
        addObject(walls60,300,501);
        walls walls61 = new walls();
        addObject(walls61,279,549);
        actor actor = new actor();
        addObject(actor,62,564);
        actor.setLocation(83,548);
        walls57.setLocation(144,576);
        actor.setLocation(65,576);
        removeObject(walls57);
        walls56.setLocation(163,585);
    }
}
