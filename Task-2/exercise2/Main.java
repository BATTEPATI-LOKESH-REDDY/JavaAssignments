package exercise2;

public class Main{
    
    public static void main(String[] args) {
        
        // Create two threads
    	Main m=new Main();
        Thread t1 = new Thread(m.new OddThread());
        Thread t2 = new Thread(m.new EvenThread());
        
        // Start the threads
        t1.start();
        try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        t2.start();
    }
    
    // Public thread to display odd numbers
    public class OddThread implements Runnable {
        @Override
        public void run() {
        	System.out.println("Odd numbers are: ");
            for (int i = 1; i <= 100; i += 2) {
                System.out.println("Odd Thread: " + i);
              
            }
            System.out.println("\n");
        }
    }
    
    // Public thread to display even numbers
    public class EvenThread implements Runnable {
        @Override
        public void run() {
        	System.out.println("Even numbers are: ");
            for (int i = 2; i <= 100; i += 2) {
                System.out.println("Even Thread: " + i);
            }
        }
    }
}
