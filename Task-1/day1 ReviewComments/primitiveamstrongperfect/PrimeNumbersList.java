package day1.primitiveamstrongperfect;

public class PrimeNumbersList {

	public static void main(String[] args) {
		int range = 100, count = 0;
		for (int i = 1; i <= range; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				System.out.print(i + " ");

			}
		}

	}

}
