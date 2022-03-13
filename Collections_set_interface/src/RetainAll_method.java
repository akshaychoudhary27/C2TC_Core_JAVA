import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RetainAll_method {
//	public static void main(String args[]) {
//		LinkedHashSet<Integer> list1 = new LinkedHashSet<Integer>();
//		list1.add(1);
//		list1.add(2);
//		list1.add(3);
//		list1.add(4);
//		list1.add(5);
//		System.out.println(list1);
//		LinkedHashSet<Integer> list2 = new LinkedHashSet<Integer>();
//		list2.add(1);
//		list2.add(2);
//		 
//		list2.add(3);
//		System.out.println(list2);
//		list1.retainAll(list2);
//		System.out.println(list1);
//		}

	public static void main(String[] args) {
		LinkedHashSet <Integer> data =new LinkedHashSet<Integer>();
		data.add(20);
		data.add(30);
		data.add(40);
		data.add(56);
		data.add(45);
		data.add(60);
		System.out.println("Set: "+data);
		ArrayList <Integer> data2 =new ArrayList<Integer>();
		data2.add(50);
		data2.add(70);
		data2.add(49);
		System.out.println("NewSet: "+data2);
		data.removeAll(data2);
		System.out.println("Removing data :"+data);
	}

}
