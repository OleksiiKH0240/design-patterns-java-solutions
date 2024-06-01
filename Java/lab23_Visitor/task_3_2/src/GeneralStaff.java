public class GeneralStaff extends MilitaryObject {
    @Override
    void accept(Spy visitor) {
        visitor.visit(this);
    }
}