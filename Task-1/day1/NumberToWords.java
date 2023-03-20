package day1;

import java.util.Scanner;

public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=n;
		int u,t,h;
		u=n%10;
		n=n/10;
		t=n%10;
		n=n/10;
		System.out.println(n);
		String ud[]= {" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourtheen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String td[]= {" ","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		String hrd="Hundred";
		if(k<20) {
			System.out.println(ud[k]);
		}
		else if(k<100) {
			System.out.println(td[t]+ud[u]);
			
		}
		else {
			System.out.println(ud[n]+" "+hrd+" "+"and"+" "+td[t]+" "+ud[u]);
			
		}
		
		
		

		

	}

}
