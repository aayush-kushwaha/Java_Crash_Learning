import java.util.*;

public class OddEvenFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even!!!");
        }
        else{
            System.out.println("The number is odd!!!");
        }
        // Close the Scanner to avoid resource leak
        sc.close();
    }
}
