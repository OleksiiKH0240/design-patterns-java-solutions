import java.util.*;

public class Shop implements Iterator<ShopItem>, Iterable<ShopItem> {

    private final HashMap<String, ShopItem> items = new HashMap<>();
    private int index = -1;
    private String sortKey = "name";
    private List<ShopItem> itemList;


    void putItem(ShopItem item) {
        items.put(item.getName(), item);
    }

    public List<ShopItem> getItems() {
        ArrayList<ShopItem> arrayList = new ArrayList<ShopItem>(this.items.size());

        if (sortKey.equals("name")) {
            NameComparator comparator = new NameComparator();
            arrayList.addAll(this.items.values().stream().sorted(comparator).toList());

        } else if (sortKey.equals("quantity")) {
            QuantityComparator comparator = new QuantityComparator();
            arrayList.addAll(this.items.values().stream().sorted(comparator).toList());
        } else {
            arrayList.addAll(this.items.values());
        }
        return arrayList;

    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
        this.itemList = this.getItems();
        this.index = -1;
    }

    @Override
    public ShopItem next() {
        return itemList.get(++index);
    }

    @Override
    public boolean hasNext() {
        return (index + 1) < this.itemList.size();
    }

    @Override
    public Iterator<ShopItem> iterator() {
        return this;
    }

}
