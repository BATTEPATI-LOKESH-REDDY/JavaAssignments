package day1.singletonclasses;


public class SingletonClass {
	static SingletonClass singletonclass = new SingletonClass();

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		return singletonclass;
	}
}