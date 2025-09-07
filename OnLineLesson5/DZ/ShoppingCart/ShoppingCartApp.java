public class ShoppingCartApp {

    public static void main(String[] args) {
                
        ShoppingCart<Product> cart = new ShoppingCart<>();
        cart.addItem(ItemIdGen.itemNextId(), new Product("Apple", 150.00 ));
        cart.addItem(ItemIdGen.itemNextId(), new Product("Banana", 270.00 ));
        cart.addItem(ItemIdGen.itemNextId(), new Product("Salmon", 1150.00 ));
        cart.addItem(ItemIdGen.itemNextId(), new Product("Halibut", 7150.00 ));

        System.out.println("1. List all items:");
        cart.getItems();
        System.out.println("");

        System.out.println("2. Find the most expensive item:");
        cart.getMostExpensive();
        System.out.println("");

        System.out.println("3. Calculate cart total:");
        System.out.println(cart.getTotalPrice());
        System.out.println("");

        System.out.println("4. Remove item from cart with exception :");
        try{
        cart.removeItem(0);}
        catch (IllegalArgumentException wrong){
            System.out.println("Error : " + wrong.getMessage());
        }
        cart.getItems();
        System.out.println("");

        System.out.println("5. Remove item from cart without exception :");
        try{
        cart.removeItem(1);}
        catch (IllegalArgumentException wrong){
            System.out.println("Error : " + wrong.getMessage());
        }
        cart.getItems();
        System.out.println("");






    }
    
}
