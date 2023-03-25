package day1;

import java.util.Scanner;

public class ColomRerverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row,col;
		row=sc.nextInt();
		col=sc.nextInt();
		int [][]arr =new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=col-1;j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(4);
		}


	}

}
