package multithreading.digitalclock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		DigitalClock dc=new DigitalClock();
		ExecutorService ex= Executors.newFixedThreadPool(3);
		ex.execute(()->{
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				dc.updateseconds();
			}
			
		});
		ex.execute(()->{
			while(true) {
				dc.updateminutes();
			}
		});
		ex.execute(()->{
			while(true) {
				dc.updatehours();
			}
		});
	}

}
