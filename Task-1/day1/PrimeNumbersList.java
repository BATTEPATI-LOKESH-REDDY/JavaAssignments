package day1;

public class PrimeNumbersList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100,count=0;
		for(int i=1;i<=100;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count=count+1;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
				
			}
		}

	}

}
