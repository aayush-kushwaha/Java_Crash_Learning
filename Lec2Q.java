// Take 2 variables 'a' and 'b' and print their sum
import java.util.*;
public class Lec2Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        // Close the Scanner to avoid resource leak
        sc.close();
    }
}
