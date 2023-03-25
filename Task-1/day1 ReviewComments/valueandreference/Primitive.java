package day1.valueandreference;


class Primitive {
	public void method1(int number) {
		number = 200;
		System.out.println("after calling the method1 " + number);

	}

	public void method2(int[] arr) {
		arr[0] = 100;
		System.out.println("after calling the method2 " + arr[0]);
	}

	public void method3(ValueAndRefernce vr) {
		System.out.println("after calling the method3 " + vr);

	}
}

