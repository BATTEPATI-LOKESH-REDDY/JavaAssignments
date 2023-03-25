package day1.primitiveamstrongperfect;

import java.util.Scanner;
import java.lang.Math;

public class PrimitiveAmstrongPerfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0, sum = 0, digit = 0;
		int x = number;
		int temp = number, flag = 0;
		while (number > 0) {
			count += 1;
			number = number / 10;
		}
		while (x > 0) {
			digit = x % 10;
			sum += Math.pow(digit, count);
			x = x / 10;
		}
		if (temp == sum) {
			flag = 1;
			System.out.println("armstrong");
		}
		sum = 0;
		for (int i = 1; i < temp; i++) {
			if (temp % i == 0) {
				sum += i;
			}
		}
		if (sum == temp) {
			flag = 1;
			System.out.println("perfect number");
		}

		int k = temp, reverse = 0;
		while (k > 0) {
			reverse = reverse * 10 + k % 10;
			k = k / 10;

		}
		if (reverse == temp) {
			flag = 1;
			System.out.println("palindrome");
		}
		if (flag == 0) {
			System.out.println("none of this");
		}
	}

}
