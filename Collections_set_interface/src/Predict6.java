
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Predict6 {
	public static void main(String[] args) {
		TreeSet<String> tr=new TreeSet<>(Arrays.asList("red","orange","blue","green","white","brown","yellow","black"));
		System.out.println("set: "+tr);
		NavigableSet<String> subSet = tr.subSet("green",false, "white",true);
		System.out.println("Subset: " + subSet);
		subSet =tr.subSet("green",true, "white",true);
		System.out.println("Subset: " + subSet);
		subSet =tr.subSet("green",false, "white",false);
		System.out.println("Subset: " + subSet);



	}


}
