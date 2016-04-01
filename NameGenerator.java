
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String ciudad;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void generateStarWarsName(String nombre,String apellido1,String apellido2,String ciudad)
    {
        this.nombre = nombre;
        primerApellido = apellido1;
        segundoApellido = apellido2;
        this.ciudad = ciudad;
        
        String nombrePeli = nombre.substring(0,3)+primerApellido.substring(0,3).toLowerCase();
        String apellidoPeli = segundoApellido.substring(0,2)+ciudad.substring(0,3).toLowerCase();
        
        System.out.println(nombrePeli + " " + apellidoPeli);
    }
}
