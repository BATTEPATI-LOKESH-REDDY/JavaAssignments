package multithreading.produceandconsume;

public class Consumer implements Runnable{
	Inventory in;
	Consumer(Inventory in){
		this.in=in;
	}
	@Override
	public void run() {
		in.consuming();
	}
	
	

}
