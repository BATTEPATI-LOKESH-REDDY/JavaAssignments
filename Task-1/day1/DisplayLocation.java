package day1;

import java.util.Scanner;

public class DisplayLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		int []arr= {5,2,4,2,10};
		int x=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				System.out.print(i+" ");

				count=count+1;
				
			}
			
		

	}
		System.out.println(count);


}
}
