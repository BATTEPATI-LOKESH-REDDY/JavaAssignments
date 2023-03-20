package day1;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass obj1=SingletonClass.getInstance();
		SingletonClass obj2=SingletonClass.getInstance();

		System.out.println(obj1);
		System.out.println(obj2);
		

	}

}
class SingletonClass{
	static SingletonClass stc=new SingletonClass();
	private SingletonClass() {
		
	}
	public static SingletonClass getInstance() {
		System.out.println(stc);
		return stc;
	}
}
