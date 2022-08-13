import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Minijuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minijuego extends World
{

    /**
     * Constructor for objects of class Minijuego.
     * 
     */
    public static int comida = 0;
    Home data;
    Minijuego(String nombre, World link)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        
        Pet mascota = new Pet(nombre, true, link);
        addObject (mascota, 110, 300);
        
        data.comida += comida;
        randomobj();
    }
    
    public void act(){
        showText("Comida recolectada: " + comida, 200,50);
        
    }
    
    public void randomobj()
    {
        for(int i=0; i<3; i++) {
            int x = Greenfoot.getRandomNumber(getWidth()+20);
            int y = Greenfoot.getRandomNumber(getHeight());
            Rama r = new Rama();
            addObject(r, x, y);
        }
        for(int i=0; i<3; i++) {
            int x = Greenfoot.getRandomNumber(getWidth()+20);
            int y = Greenfoot.getRandomNumber(getHeight());
            Roca p = new Roca();
            addObject(p, x, y);
        }
        for(int i=0; i<10; i++) {
            int x = Greenfoot.getRandomNumber(getWidth()+20);
            int y = Greenfoot.getRandomNumber(getHeight());
            Comida c = new Comida();
            addObject(c, x, y);
        }
        
    }
}
