package multithreading.digitalclock;

public class DigitalClock {
	int seconds = 0;
	int minutes = 0;
	int hours = 0;

	synchronized public void updateseconds() {
		if (seconds < 60) {
			seconds = seconds + 1;
			if (seconds == 60) {
				notifyAll();
			} else {
				DisplayTime();

			}
		}
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	synchronized public void updateminutes() {
		if(seconds==60 && minutes<60) {
			minutes++;
			seconds=0;
			if(minutes==60) {
				notifyAll();
			}
			else {
				DisplayTime();
			}
		}
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	synchronized public void updatehours() {
		if(seconds==60&&minutes==60) {
			seconds=0;
			minutes=0;
			hours=hours%24;
			notifyAll();
			DisplayTime();
		}
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public void DisplayTime() {
		System.out.print("\033[H\033[2J");
        System.out.flush();
		System.out.printf("%02d:%02d:%02d",hours,minutes,seconds);
	}

}
