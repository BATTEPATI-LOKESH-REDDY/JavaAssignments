package multithreading.threadwithbuffer;

public class SharedThread {
	char character='A';
	StringBuffer sb=new StringBuffer(character);
	public void alphaIncrement() {
		synchronized(this) {
			for(int i=0;i<100;i++) {
				sb.append(character);
			}
			System.out.println(sb);
			sb.delete(0, 100);
			++character;
		}
	}

}
