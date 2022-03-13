//Multithreading widout lambda expression

//class Eclipse implements Runnable{
//	public void run() {
//		System.out.println("I am run method");
//	}
//}
//public class Multithreading {
//	public static void main(String [] args) {
//		Eclipse obj = new Eclipse();
//		Thread t =new Thread(obj);
//		t.start();
//	}
//}

// Multithreading usinglambda expression

interface Lambda{
	public void demo();
}

public class Multithreading {
	public static void main(String [] args) {
		new Thread(() -> { System.out.println("I am run method"); }).start();
	}
}