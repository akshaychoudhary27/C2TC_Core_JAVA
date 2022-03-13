import java.util.SortedSet;
import java.util.TreeSet;

public class Predict13 {
	public static void main(String args[])
	{
	SortedSet<String> set	= new TreeSet<String>();
	set.add("Welcome");
	set.add("To");
	set.add("C2TC"); 
	set.add("Technical");
	set.add("Webinar");
	 
	System.out.println("SortedSet: " + set);
	Object[] arr = set.toArray();
	System.out.println("The array is :");
	
	for (int j = 0; j < arr.length; j++)
		System.out.println(arr[j]);
	}

}
