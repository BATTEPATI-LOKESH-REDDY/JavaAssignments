package multithreading.threadwithbuffer;

public class SharedBuffer extends Thread{
	SharedThread st;
	SharedBuffer(SharedThread st){
		this.st=st;
		
	}
	public void run() {
		st.alphaIncrement();
	}

}
