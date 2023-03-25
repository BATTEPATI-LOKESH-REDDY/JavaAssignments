package day1;

import java.util.Scanner;

public class TwoDimentional {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,col;
		int k=1;
		row=sc.nextInt();
		col=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				
				System.out.print(k+" ");
				k=k+1;
				
			}
			System.out.println();

		}
	}

}
