package multithreading;

import java.util.Scanner;

public class CheckingAlpha {
	static int count=0;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Checking check=new Checking();
		Thread thread1=new Thread(()->{
			while(true) {
				System.out.println("Please enter the character: ");
				char c = sc.next().charAt(0);
				try {
					check.getingAlpha(c);
				}
				catch(Exception e) {
					System.out.println("Exception occured "+e.getMessage());
				}
				
				
			}
		});
		thread1.start();
	}
	

}
class Checking {
	synchronized public static void getingAlpha(char c) throws Exception {
		if(!Character.isAlphabetic(c)) {
			throw new Exception("dont give numbers the count of the alphabets is "+CheckingAlpha.count);
			
		}
		else {
			CheckingAlpha.count++;
		}
	}
}
