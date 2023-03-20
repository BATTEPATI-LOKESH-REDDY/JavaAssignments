package day1;
import java.util.Scanner;
public class CaluclateAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(average(n));
		

	}
	static float average(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		float avg=sum/n;
		return avg;
		
	}
	
	

}
