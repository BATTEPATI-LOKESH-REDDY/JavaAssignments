package exercise2;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum=0;
		int numStudents=10;
		int marks=0;

		for (int i=1;i<=numStudents;i++){
			try {
				System.out.print("Enter the marks of student " + i + ": ");
				String mark=input.nextLine();
				marks = Integer.parseInt(mark);
				sum += marks;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input! Please enter an integer value.");
				i--;
			}
		}

		double average=(double)sum /numStudents;
		System.out.println("The average marks of the "+numStudents+" students is: "+average);
	}
}
