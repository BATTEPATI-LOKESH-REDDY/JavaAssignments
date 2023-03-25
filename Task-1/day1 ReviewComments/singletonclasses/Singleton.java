package day1.singletonclasses;

public class Singleton {

	public static void main(String[] args) {
		SingletonClass objectOneSingleTon = SingletonClass.getInstance();
		SingletonClass objectTwoSingleTon = SingletonClass.getInstance();

		System.out.println(objectOneSingleTon);
		System.out.println(objectTwoSingleTon);

	}

}