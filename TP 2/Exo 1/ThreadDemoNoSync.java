
public class ThreadDemoNoSync extends Thread {
	private Thread t;
	private String threadName;
	private PrintDemo PD;
		
	public ThreadDemoNoSync(String threadName, PrintDemo pD) {
		super();
		this.threadName = threadName;
		PD = pD;
	}
	
	public void run() {
		PD.printCount();
	}

}
