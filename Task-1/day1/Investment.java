package day1;

public class Investment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0;
		float intialamount=14000;
		float Increased=((float)40/(float)100)*14000;
		sum=intialamount+Increased;
		System.out.println(sum);
		float secondyear=sum-1500;
		System.out.println(secondyear);
		float thirdyear=secondyear+((float)12/(float)100)*secondyear;
		System.out.println(thirdyear);

	}

}
