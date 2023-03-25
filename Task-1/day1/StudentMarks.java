package day1;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        int[][] marks = new int[numStudents][numSubjects];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the marks of student " + (i+1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                marks[i][j] = scanner.nextInt();
            }
        }
        int total=0;
        for (int i = 0; i < numStudents; i++) {
        	total=0;
            for (int j = 0; j < numSubjects; j++) {
                total += marks[i][j];
            }
            System.out.print(total+" ");
        }
    }

}
