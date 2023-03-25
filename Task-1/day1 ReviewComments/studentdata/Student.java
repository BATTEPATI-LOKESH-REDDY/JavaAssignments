package day1.studentdata;


public class Student {
	String studentName;
	int rollNumber;
	
	public Student(String name,int rollNumber) {
		this.studentName=name;
		this.rollNumber=rollNumber;
		
	}

	public static void main(String[] args) {
		Results results=new Results("John",123,60,50,70);
		results.calculate();


	}

}