package multithreading.produceandconsume;

public class Main {
	public static void main(String[] args) {
		Inventory in =new Inventory();
		Thread producers=new Thread(new Producer(in));
		Thread consumers=new Thread(new Consumer(in));
		producers.start();
		consumers.start();
		try {
			producers.start();

		}
		catch(IllegalThreadStateException e){
			System.out.println("thread cannot  be start again");
			
		}
	}

}
