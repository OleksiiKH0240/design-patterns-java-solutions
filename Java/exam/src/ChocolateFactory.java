class ChocolateFactory implements CandyFactory {
    public Candy createCandy() {
        return new Chocolate(10.0, 80);
    }
}