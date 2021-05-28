
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomizer = new Random();
        System.out.println("How many numbers should be printed?");
        int numberOfRandoms = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfRandoms; i++) {
            System.out.println(randomizer.nextInt(11));
        }
    }

}
