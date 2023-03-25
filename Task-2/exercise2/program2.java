package exercise2;

public class program2 {

	public void mth1() {
		math2();
		System.out.println("caller");
	}

	public void mth2() {
		try {
			throw new RuntimeException("runtime exception occured");
			return;
		}
		catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("finally-math2");
		}
	}

	public static void main(String[] args) {
		program2 p2 = new program2();
		p2.math1;

	}

}
