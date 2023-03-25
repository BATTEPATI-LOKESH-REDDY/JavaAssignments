package day1;

import java.util.Scanner;

public class StaticMembers {
	static int staticvariable=100;
	public void nonstaticmenthod() {
		System.out.println("inside the non static function "+staticvariable);
	}
	public static void main(String[] args) {
		StaticMembers obj=new StaticMembers();
		obj.nonstaticmenthod();
		System.out.println("inside the main function "+staticvariable);

		
	}

}
