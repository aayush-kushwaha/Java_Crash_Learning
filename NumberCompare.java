import java.util.*;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("The numbers are equal!!!");
        }
        else if (a > b) {
            System.out.println("a is greater than b.");
        }
        else {
            System.out.println("b is greater than a.");
        }
        // Close the Scanner to avoid resource leak
        sc.close();
    }
}