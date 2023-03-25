package day1.studentdata;


class Results extends Exams{
	int totalMarks;
	public Results(String name,int rollNumber,int mark1,int mark2,int mark3) {
		super(name,rollNumber,mark1,mark2,mark3);
		
	}
	void calculate() {
		totalMarks=subject1+subject2+subject3;
		System.out.println("total marks of the john"+" "+totalMarks);
	}

	
}
