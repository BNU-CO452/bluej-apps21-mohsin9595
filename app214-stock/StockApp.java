
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Mohsin Raza
 * @version 0.1
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    /**
     * Available choices for the user to make
     */
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        else if(choice.equals("add"))
        {
            addProduct();
        }
        else if(choice.equals("remove"))
        {
            removeProduct();
        }
        else if(choice.equals("buy"))
        {
            buyProduct();
        }
        else if(choice.equals("sell"))
        {
            sellProduct();
        }
        else if(choice.equals("search"))
        {
            searchProduct();
        }
        else if(choice.equals("check"))
        {
            stock.productsLowStock();
        }
        else if(choice.equals("restock"))
        {
            stock.lowStock();
        }
        return false;
    }
    
    /**
     *  For user to add a product
     */
   
    private void addProduct()
    {
        System.out.println("Adding a new Product");
        System.out.println();
        
        int id = reader.getInt("Please enter a product id >");
        String name = reader.getString("Please enter the product name >");
        
        if(stock.findProduct(id) == null)
            {
                Product product = new Product(id, name);
                stock.add(product);
                System.out.println("Product " + product.getID() + ", " + product.getName() + " added ");
            }
            else if (stock.findProduct(id) != null)
            {
                System.out.println("A product with this ID already exists, Plz try with another ID");
            }
            else 
            {
                System.out.println("Error, please try again");
            }
    
    }
    
  
    /**
     *  For user to buy a product
     */
   
    private void buyProduct()
    {
        int item = reader.getInt("Please enter the ID of the product you want to buy");
        int quantity = reader.getInt("Please enter the quantity");
        
        if(stock.findProduct(item) != null) 
            {
            stock.buyProduct(item, quantity);
            }
        else if(stock.findProduct(item) == null)
            {
                System.out.println("Your ID dosn't match with the current stock, plz try with another ID");
            }
    
    }
    
    /**
     *  For user to sell a product
     */
   
    private void sellProduct()
    {
    int item = reader.getInt("Please enter the ID of the product to sell");
    int quantity = reader.getInt("Please enter the quantity");
    
    if(stock.findProduct(item) != null) 
    {
        stock.sellProduct(item, quantity);
    }
    else if(stock.findProduct(item) == null)
    {
        System.out.println("Your ID dosn't match with the current stock, plz try with another ID");
    }
    
    }
    
    /**
     * let's a user to search product by ID
     */
    private void searchProduct()
    {  
        int id = reader.getInt("Enter a Product ID "); 
        
        Product product = stock.findProduct(id);
        System.out.println("Product found: " + product.getID() + ": " +
        product.getName());
    }
    
    
    /**
     *  For user to remove a product
     */
    private void removeProduct()
    {
        int out = reader.getInt("please enter the ID of the product to be removed");
        
        if(stock.findProduct(out) != null)
        {
            stock.removeProduct(out);            
            //System.out.println("product has been removed");
        }
        else if (stock.findProduct(out) == null)
        {
            System.out.println("Product dosen't exist, Plz try another ID");  
        }
        else 
        {
            System.out.println("Error");        
        }
    
    }
    
   
    
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Buy:        Buy more products");
        System.out.println("    Sell:       Sell a product");
        System.out.println("    Search:     Search for a product");
        System.out.println("    Check:      Check stock level");
        System.out.println("    Restock:    Restock if quantity low");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Mohsin Raza");
        System.out.println("********************************");
    }
}