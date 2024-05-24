import java.util.Comparator;

public class ShopItem {

    private final String name;
    private final int quantity;

    public ShopItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

class NameComparator implements Comparator<ShopItem> {
    @Override
    public int compare(ShopItem o1, ShopItem o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class QuantityComparator implements Comparator<ShopItem> {
    @Override
    public int compare(ShopItem o1, ShopItem o2) {
        return o1.getQuantity() - o2.getQuantity();
    }
}
