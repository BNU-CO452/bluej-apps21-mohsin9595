
/**
 * This class Module represents the code, title and cerdit value.
 * of a given module.
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
     * Module constructor assigns the code and title for module
     * It also initialises the credit value to 0
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
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }

   /**
    * This method will printout the details of the Module which includes
    * the code, title and credits
    */
    public void print()
    {            
        System.out.println(" Module Code: " + code + ": " + title);
        System.out.println("Credit:" + credit);
        System.out.println();
    } 
}
