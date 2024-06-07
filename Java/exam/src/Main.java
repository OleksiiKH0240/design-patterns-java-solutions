public class Main {
    public static void main(String[] args) {
        CandyFactory confectioneryChocolate = new ChocolateFactory();
        CandyFactory confectionerySweet = new SweetFactory();
        CandyFactory confectioneryGoody = new GoodyFactory();
        CandyFactory marsFactory = new MarsFactory();

        CandyShop shop = new CandyShop(new PriceCalculationStrategy());

        shop.addCandy(confectioneryChocolate);
        shop.addCandy(confectionerySweet);
        shop.addCandy(confectioneryGoody);
        shop.addCandy(marsFactory);

        CandyPackage package1 = new CandyPackage();
        package1.add(confectioneryChocolate.createCandy());
        package1.add(confectionerySweet.createCandy());
        

        System.out.println("Total Price: " + shop.calculateTotalPrice());

        System.out.println("Max Sugar Content in package: " + package1.getSugarContent());
    }
}
