import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fin extends Actor
{
    /**
     * Act - do whatever the fin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World link;
    fin (World w1){
        this.link=w1;
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }   // Add your action code here.
    }
}
