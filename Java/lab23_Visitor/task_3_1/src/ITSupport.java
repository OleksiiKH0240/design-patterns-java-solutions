public class ITSupport implements Employee {
    private int salary;

    public ITSupport(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
