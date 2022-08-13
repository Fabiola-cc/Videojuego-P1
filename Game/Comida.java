import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comida extends Actor
{
    /**
     * Act - do whatever the Comida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Comida(){
        GreenfootImage imagen = getImage();
        imagen.scale(imagen.getWidth() / 10, imagen.getHeight() / 10);
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
