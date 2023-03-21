package multithreading;

public class CountingThread {

	public static void main(String[] args) {
		Counting c=new Counting();
		c.start();

	}

}
class Counting extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
			if(i%10==0) {
				System.out.println("upto counting "+i);
			}
			else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	
}
