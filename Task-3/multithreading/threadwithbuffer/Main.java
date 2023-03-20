package multithreading.threadwithbuffer;

public class Main {

	public static void main(String[] args) {
		SharedThread st=new SharedThread();
		SharedBuffer sb1=new SharedBuffer(st);
		SharedBuffer sb2=new SharedBuffer(st);
		SharedBuffer sb3=new SharedBuffer(st);
		sb1.start();
		sb2.start();
		sb3.start();

		

	}

}
