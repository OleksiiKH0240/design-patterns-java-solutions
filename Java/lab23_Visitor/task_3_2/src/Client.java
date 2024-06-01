import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Spy secretAgent = new SecretAgent();
        Spy saboteur = new Saboteur();

        MilitaryObject generalStaff = new GeneralStaff();
        MilitaryObject militaryBase = new MilitaryBase();

        generalStaff.accept(secretAgent);
        generalStaff.accept(saboteur);

        militaryBase.accept(secretAgent);
        militaryBase.accept(saboteur);
    }

}
