
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
    private int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code,String title, int credit)
    {
        this.code = code;
        this.title = title;
        this.credit = credit;        
    }
        /**
     * Return code.
     */
    public String getCode()
    {
        return code;
    }
            /**
     * Return title.
     */
    public String getTitle()
    {
        return title;    
    }
               /**
     * Return crdit.
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
