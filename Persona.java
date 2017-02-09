
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // Indica el nombre de la persona
    private String nombre;
    //True si es hombre false si es mujer
    private boolean esHombre;
    // Indica el peso en kilos
    private int peso;
    //Indica la altura en centimetros
    private int altura;
    private int edad;
    private int caloriasIngeridas;
    private int metabolismoBasal;
    public Persona(String nombrePersona,boolean sexo,int pesoPersona,int alturaPersona,int edadPersona)
    {
        nombre = nombrePersona;
        esHombre = sexo;
        peso = pesoPersona;
        altura = alturaPersona;
        edad = edadPersona;
        caloriasIngeridas = 0;
        if(esHombre != true){
            metabolismoBasal = (10*peso)+(6*altura)+(5*edad)-161;
        }
        else{
            metabolismoBasal = (10*peso)+(6*altura)+(5*edad)+5;
        }
    }
    public int getCaloriasIngeridas()
    {
        return caloriasIngeridas;
    }
    public int comer(Comida comidaPaTi)
    {
        int quiereComer = -1;
        int caloriasComidaActual = comidaPaTi.getCalorias();
        if(caloriasIngeridas <= metabolismoBasal){
            quiereComer = caloriasComidaActual;
            caloriasIngeridas = caloriasIngeridas + caloriasComidaActual;
        }
        return quiereComer;
    }
}