package Exception;

import java.util.Scanner;

public class TryCatchException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int first = sc.nextInt();
        System.out.println("Enter second number : ");
        int second = sc.nextInt();

        try {
            int result = first / second;
            System.out.println("Result is : " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
    }


}
