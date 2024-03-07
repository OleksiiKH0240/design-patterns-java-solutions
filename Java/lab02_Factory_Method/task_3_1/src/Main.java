import DrinkFactory.*;


public class Main {
    private DrinkType getDrinkType() {
        boolean getCoffee = Math.random() < 0.5;
        if (getCoffee) {
            return CoffeeType.values()[(int) (Math.random() * CoffeeType.values().length)];
        } else {
            return TeaType.values()[(int) (Math.random() * TeaType.values().length)];
        }
    }

    public double simulateCafeWorkingDay() {
        int dayWorkMinutes = 8 * 60;
        int time = 0;
        double totalIncome = 0;
        CoffeeFactory coffeeMachine = new CoffeeFactory();
        TeaFactory teaMachine = new TeaFactory();

        DrinkType randomDrinkType;
        boolean clientArrived;

        while (time < dayWorkMinutes) {
            clientArrived = Math.random() < 0.5;

            if (clientArrived) {
                randomDrinkType = getDrinkType();
                if (randomDrinkType instanceof CoffeeType) {
                    totalIncome += coffeeMachine.makeDrink(randomDrinkType, (int) (Math.random() * 4)).getPrice();
                } else if (randomDrinkType instanceof TeaType) {
                    totalIncome += teaMachine.makeDrink(randomDrinkType, (int) (Math.random() * 4)).getPrice();
                }
            }

            time += 5;
        }

        return totalIncome;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Working day income: " + main.simulateCafeWorkingDay());
    }
}
