
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @Modified by Mohsin Raza
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
        {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(5001, "2001: A Space Odyssey  (1968)"));
        stock.add(new Product(5002, "Inception (2010) "));
        stock.add(new Product(5003, "The Matrix (1999) "));
        stock.add(new Product(5004, "Interstellar (2014)  "));
        stock.add(new Product(5005, "Apocalypse Now (1979)  "));
        stock.add(new Product(5006, "The Prestige (2006)  "));
        stock.add(new Product(5007, "Mad Max: Fury Road (2015)  "));
        stock.add(new Product(5008, "Blade Runner (1982)  "));
        stock.add(new Product(5009, "Moon (2009)  "));
        stock.add(new Product(5010, "Joker (2019) "));
        }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
        {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print(); 
        
        findProductname();
        stock.print();
        
        removeProducts();
        stock.print();          
       
        restockProductamount();      
        
        }
    
    private void buyProducts()
        {
        System.out.println(" Products bought");
        System.out.println(" ===============");
        stock.buyProduct(5001, 50);
        stock.buyProduct(5002, 9);
        stock.buyProduct(5003, 30);
        stock.buyProduct(5004, 20);
        stock.buyProduct(5005, 70);
        stock.buyProduct(5006, 80);
        stock.buyProduct(5007, 1);
        stock.buyProduct(5008, 2);
        stock.buyProduct(5009, 2);
        stock.buyProduct(5010, 2);
        }

    private void sellProducts()
        {
        System.out.println(" Products Sold");
        System.out.println(" =============");
        stock.sellProduct(5001, 2);
        stock.sellProduct(5002, 5);
        stock.sellProduct(5003, 4);
        stock.sellProduct(5004, 1);
        stock.sellProduct(5005, 4);
        stock.sellProduct(5006, 300);
        stock.sellProduct(5007, 6);
        stock.sellProduct(5008, 3);
        stock.sellProduct(5009, 4);
        stock.sellProduct(5010, 500);
        }
    
     
    /**
    * removes the products from the stock list by ID
    */ 
   private void removeProducts()
        {
       System.out.println(" Products Removed");
       System.out.println(" ================");
       stock.removeProduct(5003);
       stock.removeProduct(5006);
        }
    
    /**
    * For restocking products automatically if low 
    */
    
    private void restockProductamount()
       {
       System.out.println("  Stock Replenished");
       System.out.println("  =================");
       stock.restockProduct(5004, 300);
       }
    
    /**
    * finds and displays products by names
    */
   private void findProductname()
       {
       System.out.println(" Search List by Name");
       System.out.println(" ===================");   
       stock.findName("Mad Max: Fury Road (2015)  ");
       stock.findName("2001: A Space Odyssey  (1968)");
       stock.findName("Inception (2010) ");
       }

}