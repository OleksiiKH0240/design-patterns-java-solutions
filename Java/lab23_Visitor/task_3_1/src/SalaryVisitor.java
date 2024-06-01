public class SalaryVisitor implements Visitor {
    private double percentageIncrease;
    private int penaltyAmount;

    public SalaryVisitor(double percentageIncrease, int penaltyAmount) {
        this.percentageIncrease = percentageIncrease;
        this.penaltyAmount = penaltyAmount;
    }

    @Override
    public void visit(SalesPerson employee) {
        double currentSalary = employee.getSalary();
        double newSalary = currentSalary * (1 + percentageIncrease / 100);
        employee.setSalary((int) newSalary);
    }

    @Override
    public void visit(Manager employee) {
        double currentSalary = employee.getSalary();
        double newSalary = currentSalary * (1 + percentageIncrease / 100);
        employee.setSalary((int) newSalary);
    }

    @Override
    public void visit(ITSupport employee) {
        int currentSalary = employee.getSalary();
        int newSalary = currentSalary - penaltyAmount;
        employee.setSalary(newSalary);
    }
}
