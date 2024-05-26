/**
 * Літак
 */
public class Plane {

    /**
     * Чи злетів літак
     */
    private boolean isInTheAir;

    /**
     * Ідентифікатор літака
     */
    private int id;
    private final Mediator mediator;

    public Plane(int id, Mediator mediator) {
        this.id = id;
        isInTheAir = false;
        this.mediator = mediator;

        ((FlightsMediator) mediator).addPlane(this);
    }

    /**
     * Зліт літака
     */
    public void takeOff() {
        this.mediator.notify("take_off", this.id);
    }

    /**
     * посадка літака
     */
    public void land() {
        this.mediator.notify("land", this.id);
    }

    /**
     * Повертає ознаку чи літак в повітрі
     *
     * @return стан літака - чи в повітрі
     */
    public boolean getIsInTheAir() {
        return isInTheAir;
    }

    /**
     * Встановити ознаку чи злетів літак
     *
     * @param isInTheAir чи злетів літак
     */
    public void setIsInTheAir(boolean isInTheAir) {
        this.isInTheAir = isInTheAir;
    }

    /**
     * Ідентифікатор літака
     *
     * @return ідентифікатор
     */
    public int getId() {
        return id;
    }
}
