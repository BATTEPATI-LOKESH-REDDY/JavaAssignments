package multithreading.messageDisplay.copy;

public class DisplayMessage {

	public synchronized void sayHello(String name) {

		System.out.println(name);

	}

}
