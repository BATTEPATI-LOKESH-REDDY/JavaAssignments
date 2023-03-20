package multithreading.messageDisplay;

public class DisplayMessage {

	public synchronized void sayHello(String name) {

		System.out.println(name);

	}

}
