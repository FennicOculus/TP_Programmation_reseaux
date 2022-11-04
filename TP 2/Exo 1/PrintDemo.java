
public class PrintDemo {
	public synchronized void printCount() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Counter   ---- "+i);
				//Thread.sleep(1000);
				
			}
		}catch(Exception e) {
			System.out.println("Thread interrupted");
		}
	}
}
