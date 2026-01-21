
public class PaymentTerminal {
    private static final double AFFORDABLE_MEAL_PRICE = 2.50;
    private static final double HEARTY_MEAL_PRICE = 4.30;

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        double change = payment - AFFORDABLE_MEAL_PRICE;
        if (change >= 0) {
            this.money += AFFORDABLE_MEAL_PRICE;
            this.affordableMeals++;
            return change;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change = payment - HEARTY_MEAL_PRICE;
        if (change >= 0) {
            this.money += HEARTY_MEAL_PRICE;
            this.heartyMeals++;
            return change;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= AFFORDABLE_MEAL_PRICE) {
            card.takeMoney(AFFORDABLE_MEAL_PRICE);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= HEARTY_MEAL_PRICE) {
            card.takeMoney(HEARTY_MEAL_PRICE);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
