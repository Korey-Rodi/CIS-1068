public class GroceryList{
    private GroceryItem[] items;
    private int numItems;
    private static final int INITIAL_CAPACITY = 4;

    public GroceryList() {
        items = new GroceryItem[INITIAL_CAPACITY];
        numItems = 0;
    }

    public void addItem(GroceryItem item) {
        if (numItems == items.length) {
            GroceryItem[] newArray = new GroceryItem[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                newArray[i] = items[i];
            }
            items = newArray;
        }
        items[numItems] = item;
        numItems++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numItems; i++) {
            sb.append(items[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public int find(String name) {
        for (int i = 0; i < numItems; i++) {
            if (items[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public GroceryItem getItem(int index) {
        if (index < 0 || index >= numItems) {
            return null;
        }
        return items[index];
    }

    public void removeItem(int index) {
        if (index < 0 || index >= numItems) {
            return;
        }
        for (int i = index; i < numItems - 1; i++) {
            items[i] = items[i + 1];
        }
        items[numItems - 1] = null;
        numItems--;
    }

    public int totalQuantity() {
        int total = 0;
        for (int i = 0; i < numItems; i++) {
            total += items[i].getQuantity();
        }
        return total;
    }

    public double totalEstimatedCost() {
    double total = 0;
    for (int i = 0; i < numItems; i++) {
        total += items[i].totalEstimatedPrice();
    }
    return total;
} 
}
