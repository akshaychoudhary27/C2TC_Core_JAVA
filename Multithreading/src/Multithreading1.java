class Eclipse extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Eclipse thread ID is "+ Thread.currentThread().getId());			
		}
	}
}

class PPT extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("PPT thread ID is "+ Thread.currentThread().getId());
		}
	}
}

public class Multithreading1 {
	public static void main(String[] args) {
		Eclipse obj = new Eclipse();
		Thread t = new Thread(obj);
		t.start();
		PPT obj1 = new PPT();
		Thread t1= new Thread(obj1);
		t1.start();
	}
}
