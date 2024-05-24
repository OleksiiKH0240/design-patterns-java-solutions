import java.util.Iterator;

public class StaffListIterator implements Iterator<Employee>, Iterable<Employee> {
    private final StaffList staffList;
    private int index;

    StaffListIterator(StaffList staffList) {
        this.staffList = staffList;
        index = -1;
    }

    @Override
    public Employee next() {
        return this.staffList.getEmployee(++index);
    }

    @Override
    public boolean hasNext() {
        return (index + 1) < this.staffList.getSize();
    }

    @Override
    public Iterator<Employee> iterator() {
        return this;
    }
}
