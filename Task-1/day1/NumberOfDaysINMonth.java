package day1;

import java.util.Scanner;

public class NumberOfDaysINMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		switch(str) {
		case "Jan":
			System.out.println("31 days");
			break;
		case "feb":{
			int year;
		    System.out.println("Enter an Year :: ");
		    year = sc.nextInt();
		    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		         System.out.println("29 days");
		    else
		         System.out.println("28 days");
		    break;
		}
		case "march":
			System.out.println("31 days");
			break;
		case "april":
			System.out.println("30 days");
			break;
		case "may":
			System.out.println("31 days");
			break;
		case "june":
			System.out.println("30 days");
			break;
		case "july":
			System.out.println("31 days");
			break;
		case "august":
			System.out.println("31 days");
			break;
		case "september":
			System.out.println("30 days");
			break;
		case "october":
			System.out.println("31 days");
			break;
		case "november":
			System.out.println("30 days");
			break;
		case "december":
			System.out.println("31 days");
			break;
		}
		
		
		


	}

}
