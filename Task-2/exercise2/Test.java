package exercise2;

public class Test {

	public static void main(String[] args){
		try {
		throw new CheckedCustomException("handling my own exception");
		}
		catch(Exception e){
			System.out.println(e);
			
		}

	}

}
