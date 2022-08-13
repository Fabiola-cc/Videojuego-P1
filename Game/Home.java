import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{
    public static int comida = 0;
    String nombre;
    
    /**
     * Constructor for objects of class Home.
     * 
     */
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        Pet p1 = new Pet();
        addObject(p1, 372,494);
        
        MJ Play = new MJ(new Minijuego(nombre, this));
        addObject (Play, 904, 76);
    }
    
    
    public void act(){
        if (nombre == null){
            String nombre = Greenfoot.ask("¿Qué nombre deseas darle?");
            this.nombre = nombre;
        }
        showText("Comida: " + comida, 200,50);
        showText(nombre, 200,100);
    }
}
