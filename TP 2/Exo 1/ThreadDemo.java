
public class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	private PrintDemo PD;
	
	private boolean transfer = false;
	
	public ThreadDemo(String threadName, PrintDemo pD) {
		super();
		this.threadName = threadName;
		PD = pD;
	}
	
	public synchronized void run() {
		try {
			while(transfer) {
				wait();
			}
			transfer = true;
			System.out.println("executing rn : "+threadName);
			PD.printCount();
			
			transfer = false;
			notify();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
