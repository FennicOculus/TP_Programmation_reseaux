
public class T1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			synchronized (System.out) {
				System.out.println(i + " ligne du thread "+Thread.currentThread().getId());
			  }
		}
	}
	
}
