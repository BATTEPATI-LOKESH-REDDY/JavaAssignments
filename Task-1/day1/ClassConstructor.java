package day1;

public class ClassConstructor {
	String name;
	
	public ClassConstructor(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ClassConstructor person = new ClassConstructor("Battepati Lokesh Reddy");
		String name = person.getName();
		System.out.println(name);
		

	}

}
