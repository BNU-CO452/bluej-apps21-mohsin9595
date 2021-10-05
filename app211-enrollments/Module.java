
/**
 * This class represents a BNU module from the course.
 *
 * @author Mohsin Raza
 * @version 05/10/2021
 */
public class Module
{
    // Variables
    private String code;
    private String title;

    /**
     * Constructor for objects of class Module
     */
    public Module()
    {
        
    }

   /**
    * This method will printout the Module code and title
    */
    public void print()
    {
             printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title);
        System.out.println();
    }
    /**
     * Print out the details of the course to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Module Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }
}
