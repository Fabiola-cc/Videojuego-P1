import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Roca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roca extends Actor
{
    /**
     * Act - do whatever the Roca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Roca(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 10, image.getHeight() / 10);
    }
    public void act()
    {
        setLocation(getX()-3, getY());
        int y = Greenfoot.getRandomNumber(600);
        if(getX()== 0){
            setLocation(1000, y);
        }
    }
}
