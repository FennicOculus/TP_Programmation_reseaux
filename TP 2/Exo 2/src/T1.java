
public class T1 implements Runnable {

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			try {
				wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
