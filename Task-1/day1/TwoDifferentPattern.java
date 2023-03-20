package day1;

import java.util.Scanner;

public class TwoDifferentPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,col;
		row=sc.nextInt();
		col=sc.nextInt();
		int k=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k=k+1;
				
			}
			System.out.println();
		}
	}

}
