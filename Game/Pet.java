import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pets here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pet extends Actor {

    /**
     * Act - do whatever the Pets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String nombre;
    boolean play= false;
    Minijuego MJ;
    int comida = 0;
    World link;
    
    Pet() {
        
        }

    Pet(String nombre, boolean play, World link) {

        GreenfootImage imagen = getImage();
        imagen.scale(imagen.getWidth() / 2, imagen.getHeight() / 2);
        this.play = play;
        this.nombre = nombre;
        this.link = link;
        
    }
    
    public void act() {
        if (play == true){
          mover();  }
        golpe();
        recolecta();
        fin();
    }

    public void mover() {
        setLocation(getX()+1, getY());
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 2);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 2);
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX()-3, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX()+3, getY());
        }
    }
    
    public void golpe(){
        Actor Rama = getOneIntersectingObject (Rama.class);
        if (Rama != null){
            getWorld().removeObject(Rama);
            MJ.comida --;
            comida--;
        }
        Actor Roca = getOneIntersectingObject (Roca.class);
        if (Roca != null){
            getWorld().removeObject(Roca);
            MJ.comida --;
            comida--;
        }
    }
    
    public void recolecta(){
        Actor Food = getOneIntersectingObject (Comida.class);
        if (Food != null){
            World myWorld = getWorld();
            myWorld.removeObject(Food);
            MJ.comida ++;
            comida++;
        }
    }
    
    public void fin() {
        if (getX() == 999){
            getWorld().addObject(new fin(link), 500, 343);
            getWorld().showText ("Comida recolectada: " + comida, 600,300);
        }
    }
    

}

