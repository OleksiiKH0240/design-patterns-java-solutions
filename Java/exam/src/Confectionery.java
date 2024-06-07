public class Confectionery  {
    CandyFactory chocolateFactory = new ChocolateFactory();
    CandyFactory sweetFactory = new SweetFactory();
    CandyFactory goodyFactory = new GoodyFactory();

    Candy createCandy(String candyType) {
        switch (candyType) {
            case "chocolate":
                return chocolateFactory.createCandy();
            case "sweet":
                return sweetFactory.createCandy();
            case "goody":
                return goodyFactory.createCandy();
            default:
                return null;
        }
    }
}