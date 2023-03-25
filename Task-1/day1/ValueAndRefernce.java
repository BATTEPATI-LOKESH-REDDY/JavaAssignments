package day1;

public class ValueAndRefernce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int arr[]= {1,2,3,4};
		ValueAndRefernce vr=new ValueAndRefernce();
		System.out.println("before calling the method1 "+a);
		System.out.println("before calling the method2 "+arr[0]);
		System.out.println("before calling the method3 "+vr);
		Primitive p=new Primitive();
		p.method1(a);
		p.method2(arr);
		p.method3(vr);
		System.out.println(a);
		System.out.println(arr[0]);
	}

}
class Primitive{
	public void method1(int a){
		a=200;
		System.out.println("after calling the method1 "+a);
		
		
		
	}
	public void method2(int[] arr) {
		arr[0]=100;
		System.out.println("after calling the method2 "+arr[0]);
	}
	public void method3(ValueAndRefernce vr) {
		System.out.println("after calling the method3 "+vr);
		
	}
}
