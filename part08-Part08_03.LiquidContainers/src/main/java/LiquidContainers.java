
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.print("First: " + firstContainer + "/100\n" + "Second: " + secondContainer + "/100\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            final String[] parts = input.split(" ");
            final String command = parts[0];
            final int amount = Integer.valueOf(parts[1]);

            if (amount < 1) {
                continue;
            }
            if (command.equals("add")) {
                if (firstContainer + amount <= 100) {
                    firstContainer += amount;
                } else {
                    firstContainer = 100;
                }

            }
            if (command.equals("move")) {
                if (amount > firstContainer) {
                    secondContainer += firstContainer;
                } else {
                    secondContainer += amount;
                    firstContainer -= amount;
                }
            }
            if (command.equals("remove")) {
                if (secondContainer - amount >= 0) {
                    secondContainer -= amount;
                }
            }
            if (secondContainer > 100) {
                secondContainer = 100;
            }
        }
    }

}
