
public class TestThread {
	
	public static void main(String args[]) {
		PrintDemo PD = new PrintDemo();
		ThreadDemo T1 = new ThreadDemo("Thread - 1", PD);
		ThreadDemo T2 = new ThreadDemo("Thread - 2", PD);
		
		//ThreadDemoNoSync T1 = new ThreadDemoNoSync("Thread - 1", PD);
		//ThreadDemoNoSync T2 = new ThreadDemoNoSync("Thread - 2", PD);
		
		T1.start();
		T2.start();
	}
}
