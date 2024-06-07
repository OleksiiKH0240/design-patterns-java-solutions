public class MarsFactory implements CandyFactory {
    public Candy createCandy() {
        return new CandyMars(15.0, 90);
    }
}
