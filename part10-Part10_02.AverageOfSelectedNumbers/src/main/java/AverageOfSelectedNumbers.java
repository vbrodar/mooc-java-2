
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputs = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }

        double positiveAverage = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();

        double negativeAverage = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers?(n/p)");
        String choice = scanner.nextLine();
        if (choice.equals("n")) {
            System.out.println("Average of the negative numbers: " + negativeAverage);
        } else if (choice.equals("p")) {
            System.out.println("Average of the positive numbers: " + positiveAverage);
        } else {
            System.out.println("Average of the positive numbers: " + positiveAverage);
        }
    }

}
