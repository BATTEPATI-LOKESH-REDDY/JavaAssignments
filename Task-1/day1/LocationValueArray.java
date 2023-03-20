package day1;

import java.util.Scanner;

public class LocationValueArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {5,2,4,7,10};
		int x=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				System.out.println(i);
				break;
			}
			
		}
	}

		

}
