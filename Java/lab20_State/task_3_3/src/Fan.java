public class Fan {
    private FanState state;

    public Fan() {
        this.state = new LowState(this);
    }

    public void setState(FanState state) {
        this.state = state;
    }

    public void turnUp() {
        state.turnUp();
    }

    public void turnDown() {
        state.turnDown();
    }
}
