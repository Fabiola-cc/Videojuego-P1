import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Fabiola Contreras
 * @version 1 / 12.08.2022
 */
public class Inicio extends World {

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public Inicio() {
        super(1000, 600, 1);
        
        Greenfoot.delay(50);
        Greenfoot.stop();
        
        Botón Play = new Botón(new Home());
        addObject (Play, 920, 550);
    }
    
    
    
    
    
}
