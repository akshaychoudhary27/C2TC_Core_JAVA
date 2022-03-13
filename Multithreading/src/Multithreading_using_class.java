class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse thread ID is "+ Thread.currentThread().getId());
	}
}

class PPT extends Thread{
	public void run() {
		System.out.println("PPT thread ID is "+ Thread.currentThread().getId());
	}
}
public class Multithreading_using_class {
	public static void main(String[] args) {
		Eclipse obj = new Eclipse();
		obj.start();
		PPT obj1 = new PPT();
		obj1.start();
	}
}
