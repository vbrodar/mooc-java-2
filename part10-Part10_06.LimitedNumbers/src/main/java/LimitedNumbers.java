
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 0) {
                numbersList.stream()
                        .filter(listNumber -> listNumber >= 1 && listNumber <= 5)
                        .forEach(item -> System.out.println(item));
                break;
            }
            numbersList.add(number);
        }
    }
}
