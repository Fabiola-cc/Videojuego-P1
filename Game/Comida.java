import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Objeto de minijuego. Comida a recolectar por la mascota.
 * 
 * @author Fabiola Contreras
 * @version no.1
 */
public class Comida extends Actor
{
    Comida(){ //La imagen que representa comida, reduce 10 veces su tamaño.
        GreenfootImage imagen = getImage();
        imagen.scale(imagen.getWidth() / 10, imagen.getHeight() / 10);
    }
    
    /**
     * Act - do whatever the Botón wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-3, getY()); //Se mueve tres unidades a la izquierda continuamente mientras está en pantalla. 
        int y = Greenfoot.getRandomNumber(600); //se ubica en un punto Y de manera aleatoria, considerando como rango el largo de la pantalla.
        if(getX()== 0){ //al llegar al borde izquierdo de la pantalla reaparece al borde derecho en el punto y.
            setLocation(1000, y);
        }
    }
}
