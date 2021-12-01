import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Mohsin Raza) 
 * @version (08-11-2021)
 */
public class StockList
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The product item to be added.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }
    

    
    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void buyProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            if(product.getQuantity() < 10000)
            {
                product.increaseQuantity(amount);
                System.out.println("Bought " + amount + " of " + product.getName());
            }
            else
            {
                System.out.println("Storage space unavilable  for" + product.getName() + "Plesae re-stock after selling existing items");  
            }
        }
        else
        {
            System.out.println("Couldn't find product");
        }
    }
    
    /**
     * Finds & removes a product from the stock list,
     */
    public void removeProduct(int productID)
    {
        Product product = findProduct(productID);
        product = product;
        stock.remove(product);
        System.out.println("" + product.getName() + " has been removed from the stock");

    }
    
    /**
     * Finds products by name 
     * if not found return null
     */
    public Product findName(String productName)
    {
        for(Product product : stock)
        {
            if(product.getName() == productName)
            
            System.out.println(product);
        }
        return null;
    }
    
    /**
     * Automatically restocks a product  
     */
    public Product restockProduct(int productID, int amount)
    {
        for(Product product : stock)
        {
              if(product.getQuantity() <= 25)
          
              product.increaseQuantity(amount);
          
              System.out.println(product);
        }
     
       return null;
    }
    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {
        for (Product product : stock)
        {
            if(product.getID() == productID)
            {
                return product;
            }
        }
        
        return null;
    }
    
    /**
     * Sell one of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID)
    {
        sellProduct(productID, 1);
    }
    

    /**
     * Sell many of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            if(product.getQuantity() > 0 && product.getQuantity() > amount)
            {
                product.decreaseQuantity(amount);
                System.out.println("Sold " + amount + " of " + product.getName());
            }
            else if(product.getQuantity() == 0)
            {
                System.out.println("The product" + product.getName() + "is out of stock"); 
            }
            else
            {
                System.out.println("Can't sell " + amount + " of " + product.getName() + " beacuse only have " + product.getQuantity()+ " in stock");  
            }
        }
        else
        {
            System.out.println("Couldn't find product");
        }
    } 
    
     /**
     * restock all the products that are lower then 5
     */
    public void lowStock()
    {
        printHeading();
        for (Product product : stock) 
            {
            if(product.getQuantity() < 5)

                product.increaseQuantity(200);
            }
            System.out.println("If below 5 Increase stock level by 200");
        for(Product product : stock)
            {
                product.print();
            }
    }
    
    /**
     * To check the quantity of each product & 
     * display the quantity if lower than 25
     */
    public void productsLowStock()
    {
        System.out.println("Products with low stock:");
        
        for(Product product : stock)
        {

            if(product.getQuantity() <= 25)
            {
                System.out.println(product.toString());
            }
        }
    }
    

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int productID)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    public void printHeading()
    {
        System.out.println();
        System.out.println(" Mohsin's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }
}