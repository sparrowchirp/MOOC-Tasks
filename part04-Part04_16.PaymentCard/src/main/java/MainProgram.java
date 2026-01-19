import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        PaymentCard cardPaul = new PaymentCard(20);
        PaymentCard cardPMatt = new PaymentCard(30);
        cardPaul.eatHeartily();
        cardPMatt.eatAffordably();

        System.out.println("Matt: The card has a balance of " + cardPMatt + " euros");
        System.out.println("Paul: The card has a balance of " + cardPaul + " euros" );

        cardPaul.addMoney(20);
        cardPMatt.eatHeartily();

        System.out.println("Matt: The card has a balance of " + cardPMatt + " euros");
        System.out.println("Paul: The card has a balance of " + cardPaul + " euros" );
        cardPaul.eatAffordably();
        cardPaul.eatAffordably();
        cardPMatt.addMoney(50);

        System.out.println("Matt: The card has a balance of " + cardPMatt + " euros");
        System.out.println("Paul: The card has a balance of " + cardPaul + " euros" );
    }
}
