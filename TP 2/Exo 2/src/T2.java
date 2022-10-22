
public class T2 extends Thread{
	
	synchronized public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			System.err.println(i + " ligne du thread "+Thread.currentThread().getId());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
}
