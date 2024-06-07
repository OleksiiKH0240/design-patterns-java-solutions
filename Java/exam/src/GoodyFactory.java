class GoodyFactory implements CandyFactory {
    public Candy createCandy() {
        return new Goody(8.0, 70);
    }
}