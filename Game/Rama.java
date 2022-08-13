import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rama here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rama extends Actor {
    /**
     * Act - do whatever the Rama wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Rama(){
        GreenfootImage imagen = getImage();
        imagen.scale(imagen.getWidth() / 10, imagen.getHeight() / 10);
        
        
    }
    
    public void act() {
        setLocation(getX()-3, getY());
        int y = Greenfoot.getRandomNumber(600);
        if(getX()== 0){
            setLocation(1000, y);
        }
    }

    
}
