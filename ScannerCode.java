import java.util.Scanner;

import java.util.*;

public class ScannerCode {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in); // Instantiating scanner class

        System.out.println("What's your name?");
        String name = sc.nextLine();
        // int number = sc.nextInt();
        // float number = sc.nextFloat(); 
        System.out.println("The name is " + name);
    }
}
