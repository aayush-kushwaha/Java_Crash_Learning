import java.util.*;
public class TablePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for its table: ");
        int number = sc.nextInt();
        System.out.println("The table of " + number + " is:");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
        // Close the Scanner to avoid resource leak
        sc.close();
    }
}
