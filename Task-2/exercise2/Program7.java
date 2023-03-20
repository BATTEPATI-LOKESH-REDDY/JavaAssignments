package exercise2;

import java.util.Scanner;

public class Program7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean done = true;
        while (done) {
            try {
                System.out.print("Enter the numerator: ");
                String numeratorStr = sc.next();
                if (numeratorStr.equalsIgnoreCase("q")) {
                	System.out.println("program is teminated here");
                    done = false;
                    continue;
                }
                int numerator = Integer.parseInt(numeratorStr);
                System.out.print("Enter the divisor: ");
                int divisor = sc.nextInt();
                int result = numerator / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }
}
