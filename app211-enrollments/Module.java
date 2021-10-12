
/**
 * This class represents a BNU module from the course.
 * Module constructor assigns the code and title for a module
 * It also initialises the credit value to 0
 * @author Mohsin Raza
 * @version 12/10/2021
 */
public class Module
{
    // Variables
    private String code;
    private String title;
    private int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        this.code = code;
        this.title = title;
        this.credit = 0;        
    }
    /**
     * This method returns the code of the module.
     */
    public String getCode()
    {
        return code;
    }
    /**
     * This method returns the title of the module.
     */
    public String getTitle()
    {
        return title;    
    }
    /**
     * This method returns the crdit of the module.
     */
    public int getCredit()
    {
        return credit;
    }

   /**
    * This method will printout the Module which includes
    * the code, title and credits
    */
    public void print()
    {            
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
