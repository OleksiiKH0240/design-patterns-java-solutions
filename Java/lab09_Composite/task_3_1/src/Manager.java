import java.util.ArrayList;
import java.util.List;


public class Manager implements Employee {

    private final String name;
    private final int salary;
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Manager(String name, int salary, List<Employee> subordinates) {
        this.name = name;
        this.salary = salary;
        this.subordinates = subordinates;
    }

    public void addSubordinate(Employee e) {
        subordinates.add(e);
    }

    @Override
    public void payExpenses() {
        for (Employee e : subordinates) {
            e.payExpenses();
        }

        System.out.println(name + " has been paid $" + salary + "\n");
    }

}
