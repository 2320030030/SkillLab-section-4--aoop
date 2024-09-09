package LamdaSortExample;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LambdaSortExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine());
        }

        // Sort the list in descending order using a lambda expression
        Collections.sort(strings, (s1, s2) -> s2.compareTo(s1));

        // Alternatively, you can use:
        // strings.sort((s1, s2) -> s2.compareTo(s1));

        // Display the sorted list
        System.out.println("Strings in descending order:");
        strings.forEach(System.out::println);

        scanner.close();
    }
}
