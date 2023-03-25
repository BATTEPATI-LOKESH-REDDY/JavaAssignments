package exercise2;

class Base {
	Base() throws Exception {
		throw new Exception("Base class exception");
	}
}

class Derived extends Base {
	Derived() {
		try{
			super();
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}

public class Program6 {

	public static void main(String[] args) {
		Derived d = new Derived();

	}

}
