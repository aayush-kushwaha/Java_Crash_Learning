import java.util.*;
public class SumFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the N number: ");
        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i ;
        }
        
        System.out.println("The sum is: " + sum);
    }
}
