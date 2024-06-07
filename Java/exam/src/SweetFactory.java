class SweetFactory implements CandyFactory {
    public Candy createCandy() {
        return new Sweet(5.0, 60);
    }
}