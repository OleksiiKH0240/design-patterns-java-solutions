import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Component, Iterator<Component>, Iterable<Component> {

    private String searchType = "bfs";
    private final List<Component> stack = new ArrayList<>();

    public Box(int id) {
        this.id = id;
    }

    private final int id;

    private final List<Component> children
            = new ArrayList<>();

    public void add(Component child) {
        children.add(child);
    }

    public void remove(Component child) {
        children.remove(child);
    }

    public List<Component> getChildren() {
        return children;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    @Override
    public boolean hasNext() {
        return !this.stack.isEmpty();
    }

    public Component next() {
        Component next = null;
        List<Component> children = null;

        next = this.stack.removeFirst();
        if (next instanceof Box) {
            children = ((Box) next).getChildren();
            if (this.searchType.equals("bfs")) {
                this.stack.addAll(children);
            } else {
                // dfs
                for (Component child : children) {
                    this.stack.addFirst(child);
                }
            }

            return next;
        } else {
            return next;
        }
    }

    public Iterator<Component> iterator() {
        this.stack.clear();
        this.stack.add(this);
        return this;
    }

    @Override
    public void execute() {
        Item maxItem = null;
        Item minItem = null;
        int value;

        for (Component child : this) {
            System.out.println(child);
            if (child instanceof Item) {
                value = ((Item) child).getValue();
                if (maxItem == null || maxItem.getValue() < value) {
                    maxItem = (Item) child;
                }

                if (minItem == null || minItem.getValue() > value) {
                    minItem = (Item) child;
                }
            }
        }

        System.out.println("maxItem: " + maxItem);
        System.out.println("minItem: " + minItem);
    }

    public String toString() {
        return "Box: " + id;
    }
}
