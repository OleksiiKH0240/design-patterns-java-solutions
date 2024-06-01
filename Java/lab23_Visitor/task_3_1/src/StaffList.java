import java.util.ArrayList;
import java.util.List;

public class StaffList implements Employee {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public int getSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    @Override
    public void accept(Visitor visitor) {
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }
}
