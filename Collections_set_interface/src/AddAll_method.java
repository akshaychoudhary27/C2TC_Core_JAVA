import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;

public class AddAll_method {
	public static void main(String args[])
	{
	Set<Integer> data = new LinkedHashSet<Integer>();
	data.add(31);
	data.add(21);
	data.add(41);
	System.out.println("Set: " + data);
	ArrayList<Integer> newData = new ArrayList<Integer>();
	newData.add(91);
	newData.add(71);
	newData.add(81);
	data.addAll(newData);
	System.out.println("Set: " + data);
	}

}
