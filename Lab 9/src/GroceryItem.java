public class GroceryItem {
    private String name;
    private int quantity;
    private double estimatedPrice;

    public GroceryItem(String name, int quantity, double estimatedPrice) {
        this.name = name;
        this.quantity = quantity;
        this.estimatedPrice = estimatedPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEstimatedPrice() {
        return estimatedPrice;
    }

    public void setEstimatedPrice(double estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int increaseQuantity(int amount) {
        quantity += amount;
        return quantity;
    }

    public int decreaseQuantity(int amount) {
        if (amount > quantity) {
            amount = quantity;
        }
        quantity -= amount;
        return quantity;
    }

    public double totalEstimatedPrice() {
        return estimatedPrice * quantity;
    }

    public String toString() {
        return "Item: " + name + ", Estimated Price: $" + estimatedPrice + ", Quantity: " + quantity;
    }
}
