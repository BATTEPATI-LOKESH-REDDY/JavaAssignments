package day1;

class A{
	public A() {
		System.out.println("i am A");
	}
}
class B{
	public B() {
		System.out.println("i am B");
	}
}
class C extends A{
	B objb=new B();
			
}
public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		C objc=new C();
		System.out.println(objc.objb);

	}

}
