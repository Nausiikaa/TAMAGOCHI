
/**
 * Write a description of class Comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comida
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int calorias;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombreComida,int caloriasComida)
    {
        nombre = nombreComida;
        calorias = caloriasComida;
    }
    public int getCalorias()
    {
        return calorias;
    }
    public String getNombre(){
        return nombre;
    }
}
