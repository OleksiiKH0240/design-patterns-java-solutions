public class MilitaryBase extends MilitaryObject {
    @Override
    void accept(Spy visitor) {
        visitor.visit(this);
    }
}