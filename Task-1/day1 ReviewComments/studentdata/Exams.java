package day1.studentdata;


class Exams extends Student{
	int subject1,subject2,subject3;
	
	public Exams(String name,int rollNumber,int mark1,int mark2,int mark3) {
		super(name,rollNumber);
		this.subject1=mark1;
		this.subject2=mark2;
		this.subject3=mark3;
		
	}
	
}