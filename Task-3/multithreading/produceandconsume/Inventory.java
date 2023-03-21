package multithreading.produceandconsume;

public class Inventory {
	boolean flag = false;

	public synchronized void producing() {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag = true;
		System.out.println("Product added to the inventory");
		notify();

	}

	public synchronized void consuming() {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag = false;
		System.out.println("customer consuming the product from the inventory");
		notify();

	}

}
