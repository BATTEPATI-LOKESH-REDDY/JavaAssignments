package exercise2;

public class Program5 {
	void method1() throws CheckedCustomException {
		throw new CheckedCustomException("checked message is thrown");

	}

	public static void main(String[] args) throws CheckedCustomException {
		Program5 p5 = new Program5();
		p5.method1();
	}

}
