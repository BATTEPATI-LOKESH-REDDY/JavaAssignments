package exercise2;

public class program3 {

	public void mth1() {
		math2();
		System.out.println("caller");
	}

	public void mth2() {
		try {
			throw new RuntimeException("runtime exception occured");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("finally-math2");
		}
	}

	public static void main(String[] args) {
		program3 p3 = new program3();
		p3.math1;

	}

}
