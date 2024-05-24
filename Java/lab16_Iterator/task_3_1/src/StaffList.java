import java.util.ArrayList;
import java.util.List;

public class StaffList {

    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    public int getSize() {
        return this.employees.size();
    }

}
