
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final Container firstContainer = new Container();
        final Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            final String[] parts = input.split(" ");
            final String command = parts[0];
            final int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);
            }
            if (command.equals("move")) {
                secondContainer.add(Math.min(firstContainer.contains(), amount));
                firstContainer.remove(amount);
            }
            if(command.equals("remove")){
                secondContainer.remove(amount);
            }
        }
    }

}
