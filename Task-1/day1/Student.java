package day1;


public class Student {
	String studentname;
	int rollNumber;
	
	public Student(String name,int rollnum) {
		this.studentname=name;
		this.rollNumber=rollnum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Results re=new Results("John",123,60,50,70);
		re.Calculate();


	}

}
class Exams extends Student{
	int sub1,sub2,sub3;
	
	public Exams(String name,int rollnumber,int mark1,int mark2,int mark3) {
		super(name,rollnumber);
		this.sub1=mark1;
		this.sub2=mark2;
		this.sub3=mark3;
		
	}
	
}
class Results extends Exams{
	int totalmarks;
	public Results(String name,int rollnumber,int mark1,int mark2,int mark3) {
		super(name,rollnumber,mark1,mark2,mark3);
		
	}
	void Calculate() {
		totalmarks=sub1+sub2+sub3;
		System.out.println("total marks of the john"+" "+totalmarks);
	}

	
}
