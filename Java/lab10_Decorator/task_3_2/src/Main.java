public class Main {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        System.out.println(espresso);

        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast);

        BeverageInterface espresso2xSugar = new Espresso();
        espresso2xSugar = new SugarDecorator(espresso2xSugar, 2);
        System.out.println(espresso2xSugar);

        BeverageInterface darkRoastCream2xSugar = new DarkRoast();
        darkRoastCream2xSugar = new CreamDecorator(darkRoastCream2xSugar, 1);
        darkRoastCream2xSugar = new SugarDecorator(darkRoastCream2xSugar, 2);
        System.out.println(darkRoastCream2xSugar);

        BeverageInterface darkRoastWhippedCreamSugar = new DarkRoast();
        darkRoastWhippedCreamSugar = new WhippedCreamDecorator(darkRoastWhippedCreamSugar, 1);
        darkRoastWhippedCreamSugar = new SugarDecorator(darkRoastWhippedCreamSugar, 1);
        System.out.println(darkRoastWhippedCreamSugar);

        BeverageInterface DecafMilk2xSugar = new Decaf();
        DecafMilk2xSugar = new MilkDecorator(DecafMilk2xSugar, 1);
        DecafMilk2xSugar = new SugarDecorator(DecafMilk2xSugar, 2);
        System.out.println(DecafMilk2xSugar);
    }
}
