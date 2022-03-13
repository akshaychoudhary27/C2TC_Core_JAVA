class Eclipse implements Runnable{
	public void run() {
		System.out.println("Eclipse thread ID is "+ Thread.currentThread().getId());
	}
}

class PPT implements Runnable{
	public void run() {
		System.out.println("PPT thread ID is "+ Thread.currentThread().getId());
	}
}

public class Multithreading_using_interface {
	public static void main(String [] args) {
		Eclipse obj = new Eclipse();
		Thread t = new Thread(obj);
		t.start();
		PPT obj1 = new PPT();
		Thread t1 = new Thread(obj1);
		t1.start();
	}
}
