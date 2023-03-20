package multithreading.produceandconsume;

public class Producer implements Runnable{
	Inventory in;
	Producer(Inventory in){
		this.in=in;
		
	}
	@Override
	public void run() {
		in.producing();
	}
	

}
