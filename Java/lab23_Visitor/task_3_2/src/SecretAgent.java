public class SecretAgent extends Spy {
    @Override
    void visit(GeneralStaff generalStaff) {
        System.out.println("Secret Agent visiting General Staff: Gathering or stealing secret information.");
    }

    @Override
    void visit(MilitaryBase militaryBase) {
        System.out.println("Secret Agent visiting Military Base: Gathering or stealing secret information.");
    }
}