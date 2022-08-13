import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pantalla principal del juego.
 * Presenta distintas opciones a realizar dentro del juego.
 * 
 * @author Fabiola Contreras
 * @version no.1
 */
public class Home extends World
{
    public static int comida = 0;
    String nombre;
    
    /**
     * Constructor para Home.
     * Muestra la imagen de pantalla.
     * Crea una nueva mascota y nuevos mundos para ir.
     * 
     */
    public Home()
    {    
        super(1000, 600, 1);
        Pet p1 = new Pet();
        addObject(p1, 372,494); //Añade una mascota a la pantalla.
        
        MJ Play = new MJ(new Minijuego(nombre, this));
        addObject (Play, 904, 76); //Botón para dirigirse al Minijuego.
    }
    
    /**
     * Act - Es llamado cada vez que el botón "run o act" es presionado.
     */
    public void act(){
        if (nombre == null){
            String nombre = Greenfoot.ask("¿Qué nombre deseas darle?");
            this.nombre = nombre; //Recibe un dato de nombre para la mascota.
        }
        showText("Comida: " + comida, 200,50); //Registra el dato de comida recolectada y lo muestra en pantalla.
        showText(nombre, 200,100); //Muestra el nombre antes guardado en pantalla.
    }
}
