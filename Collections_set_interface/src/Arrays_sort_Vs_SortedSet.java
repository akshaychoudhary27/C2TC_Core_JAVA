import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Arrays_sort_Vs_SortedSet {
	public static void main(String[] args)
	{
		//Arrays.sort
		int[] arr = {13,7,6,45,6,21,9};
		Arrays.sort(arr);
		System.out.println("Arrays.sort : " +Arrays.toString(arr));
	
		//SortedSet
		SortedSet obj=new TreeSet(); obj.add(13);
		obj.add(7);
		obj.add(6);
		obj.add(45);
		obj.add(6);
		obj.add(21);
		obj.add(9);
		System.out.println("SortedSet : " +obj);

		
	}

}
