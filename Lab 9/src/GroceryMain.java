public class GroceryMain {
    public static void main(String[] args) {
        // Grocery List methods
        GroceryList groceries = new GroceryList();
        GroceryItem Bread = new GroceryItem("Bread", 1, 2.99);
        groceries.addItem(Bread);
        GroceryItem Milk = new GroceryItem("Milk", 2, 1.49);
        groceries.addItem(Milk);
        System.out.print("Grocery List \n");
        System.out.println(groceries);
        System.out.println(groceries.totalQuantity());
        System.out.println(groceries.totalEstimatedCost());
        System.out.println(groceries.find("Milk"));
        System.out.println(groceries.find("Soap"));
        System.out.println(groceries.getItem(0));
        groceries.removeItem(1);
        System.out.println(groceries);


        // Grocery Item methods
        System.out.println(Bread);
        Bread.setName("Whole Wheat Bread");
        System.out.println(Bread);
        System.out.println(Bread.getName());
        Bread.increaseQuantity(2);
        Bread.decreaseQuantity(1);
        Bread.setQuantity(1);
        Bread.setEstimatedPrice(3.79);
        System.out.println("Bread quantity: " + Bread.getQuantity());
        System.out.println(Bread.totalEstimatedPrice());

    }
}