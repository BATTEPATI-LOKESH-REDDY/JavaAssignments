package exercise2;

import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException() {
        super("Negative values are not allowed!");
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException() {
        super("Values outside the range of 0-100 are not allowed!");
    }
}

public class Program9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int numStudents = 10;
        int marks;

        for (int i = 1; i <= numStudents; i++) {
            try {
                System.out.print("Enter the marks of student " + i + ": ");
                marks = Integer.parseInt(input.nextLine());
                if (marks < 0) {
                    throw new NegativeValueException();
                }
                if (marks > 100) {
                    throw new OutOfRangeException();
                }
                sum += marks;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer value.");
                i--;
            } catch (NegativeValueException e) {
                System.out.println(e.getMessage());
                i--;
            } catch (OutOfRangeException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        double average = (double) sum / numStudents;
        System.out.println("The average marks of the " + numStudents + " students is: " + average);
    }
}
