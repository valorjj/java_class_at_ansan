package Day13;

import java.awt.Toolkit;

public class BeepThread extends Thread {
	
	
	public BeepThread() {
		
		setName("Thread A");
	}
	

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
