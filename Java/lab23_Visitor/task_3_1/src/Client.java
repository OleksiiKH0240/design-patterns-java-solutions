public class Client {

    public static void main(String[] args) {
        StaffList staffList = new StaffList();

        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new ITSupport(40000));

        SalaryVisitor salaryVisitor = new SalaryVisitor(10, 2000);
        staffList.accept(salaryVisitor);

        System.out.println("Total amount paid to staff: " + staffList.getSalary());
    }

}
