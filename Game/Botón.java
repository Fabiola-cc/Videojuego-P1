import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Botón here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Botón extends Actor
{
    /**
     * Act - do whatever the Botón wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World link;
    Botón (World w1){
        GreenfootImage imagen = getImage();
        imagen.scale(imagen.getWidth() / 3, imagen.getHeight() / 3);
        this.link=w1;
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }    
    
    }
}
