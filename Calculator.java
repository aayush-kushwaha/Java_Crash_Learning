import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first number:");
        float first_num = sc.nextFloat();
        System.out.println("Enter second number:");
        float second_num = sc.nextFloat();
        float sum = first_num + second_num;
        float diff = first_num - second_num;
        float mul = first_num * second_num;
        float div = first_num / second_num;
        float modulo = first_num % second_num;
        System.out.println("The sum is " + sum + " and the difference is " + diff + " and the product is " + mul + " and the division is " + div + " and the modulo is " + modulo);
        // Close the Scanner to avoid resource leak
        sc.close();
    }
}
