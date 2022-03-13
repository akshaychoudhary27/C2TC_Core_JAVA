import java.util.ArrayList;

public class For_each_loop {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Lekha");
		obj.add("leema");
		obj.add("pooja");
		obj.add("hema");
		for(String a: obj) {
			System.out.println(a);
		}
		//using lambda expr
		obj.forEach(temp -> System.out.println("Using Lambda Expression : " +temp));
	}
}
