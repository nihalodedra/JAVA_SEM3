//practical 1.1
import java.util.Scanner;
enum Coin {
    ONE,
    TWO,
    FIVE,
    TEN
}

public class VendingMachine{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("25AIML039");

        int price = 15;
        int total = 0;

        while (total < price) {

            System.out.print("Enter coin (ONE, TWO, FIVE, TEN): ");
            Coin coin = Coin.valueOf(sc.next().toUpperCase());

            switch (coin) {

                case ONE:
                    total += 1;
                    break;

                case TWO:
                    total += 2;
                    break;

                case FIVE:
                    total += 5;
                    break;

             


   case TEN:
                    total += 10;
                    break;
            }

            System.out.println("Total = " + total);
        }

        System.out.println("Snack Price = " + price);
        System.out.println("Change = " + (total - price));

        sc.close();
    
   }

}
