import java.util.Arrays;


public class ExpensesClient {

    public static void main(String[] args) {


        Salesperson employee1 = new Salesperson("employee1, meat section employee", 300);
        Salesperson employee2 = new Salesperson("employee2, meat section employee", 200);
        Salesperson employee3 = new Salesperson("employee3, meat section employee", 250);
        Manager meatSectionManager = new Manager("Bob, meat section manager", 400,
                Arrays.asList(employee1, employee2, employee3)
        );


        Salesperson employee4 = new Salesperson("employee4, dairy section employee", 300);
        Salesperson employee5 = new Salesperson("employee5, dairy section employee", 200);
        Salesperson employee6 = new Salesperson("employee6, dairy section employee", 250);
        Manager dairySectionManager = new Manager("Sue, dairy section manager", 400,
                Arrays.asList(employee4, employee5, employee6)
        );

        Salesperson employee7 = new Salesperson("employee7, confectionery section employee", 300);
        Salesperson employee8 = new Salesperson("employee8, confectionery section employee", 200);
        Salesperson employee9 = new Salesperson("employee9, confectionery section employee", 250);
        Manager confectionerySectionManager = new Manager("David, confectionery section manager", 400,
                Arrays.asList(employee7, employee8, employee9)
        );

        Manager director = new Manager("Jane, Director", 500,
                Arrays.asList(meatSectionManager, dairySectionManager, confectionerySectionManager)
        );

        System.out.println("Expenses have been requested");
        director.payExpenses();
        System.out.println("Expenses have been paid\n");

    }
}
