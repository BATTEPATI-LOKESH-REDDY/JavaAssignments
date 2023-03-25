package day1;

import java.util.Scanner;

public class MaxElementInRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row,col;
		row=sc.nextInt();
		col=sc.nextInt();
		int [][]arr =new int[row][col];for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			int max=0;
			for(int j=0;j<col;j++) {
				if(arr[i][j]>=max) {
					max=arr[i][j];
				}
			}
			System.out.println(max);
			max=0;
			System.out.println();
		}



	}

}
