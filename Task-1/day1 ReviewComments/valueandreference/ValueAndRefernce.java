package day1.valueandreference;


public class ValueAndRefernce {

	public static void main(String[] args) {
		int number = 10;
		int arr[] = { 1, 2, 3, 4 };
		ValueAndRefernce vr = new ValueAndRefernce();
		System.out.println("before calling the method1 " + number);
		System.out.println("before calling the method2 " + arr[0]);
		System.out.println("before calling the method3 " + vr);
		Primitive primitive = new Primitive();
		primitive.method1(number);
		primitive.method2(arr);
		primitive.method3(vr);
		System.out.println("checking the number in main "+number);
		System.out.println("checking the array in main "+arr[0]);
	}

}
