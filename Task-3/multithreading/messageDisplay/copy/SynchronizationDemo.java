package multithreading.messageDisplay.copy;

public class SynchronizationDemo {

	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();

		MyThread t1 = new MyThread(dm, "[----hi lokesh---]");
		MyThread t2 = new MyThread(dm, "[----hi bhuvan---]");

		t1.start();
		t2.start();

	}

}
