import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Botón here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MJ extends Actor
{
    /**
     * Act - do whatever the Botón wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World link;
    MJ (World w1){
        this.link=w1;
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }    
    
    }
}
