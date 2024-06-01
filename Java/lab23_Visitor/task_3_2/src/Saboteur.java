public class Saboteur extends Spy {
    @Override
    void visit(GeneralStaff generalStaff) {
        System.out.println("Saboteur visiting General Staff: Destroying secret documents, personnel, and equipment.");
    }

    @Override
    void visit(MilitaryBase militaryBase) {
        System.out.println("Saboteur visiting Military Base: Destroying secret documents, personnel, and equipment.");
    }
}