
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 t1 = new T1();
		Thread t = new Thread(t1);
		T2 t2 = new T2();
		
		t.start();
	
		t2.start();
		
	}

}
