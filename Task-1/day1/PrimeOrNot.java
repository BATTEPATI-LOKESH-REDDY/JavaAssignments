package day1;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int count=0;
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println("x is prime ");
		}
		else {
			System.out.println("x is not a prime");
		}
		

	}

}
