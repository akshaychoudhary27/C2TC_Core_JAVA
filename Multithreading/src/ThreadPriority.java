class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse thread ID is "+ Thread.currentThread().getId());
		System.out.println("Eclipse thread ID is "+ Thread.currentThread().getPriority());
	}
}

class PPT extends Thread{
	public void run() {
		System.out.println("PPT thread ID is "+ Thread.currentThread().getId());
		System.out.println("PPT thread ID is "+ Thread.currentThread().getPriority());
	}
}
public class ThreadPriority {
	public static void main(String[] args) {
		Eclipse obj = new Eclipse();
		obj.start();
		obj.setPriority(7);
		PPT obj1 = new PPT();
		obj1.start();
		obj1.setPriority(3);
		
	}
}
