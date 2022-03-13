import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSet_Vs_SortedSet {
	public static void main(String args[])
	{
		//HashSet
		HashSet obj=new HashSet();
		obj.add(1);
		obj.add("QUEUE");
		obj.add("Fine");
		obj.add(86.78);
		System.out.println("HashSet : " +obj);
		
		//SortedSet
		SortedSet obj1=new TreeSet();
		obj1.add(13);
		obj1.add(34.67);
		obj1.add(6);
		obj1.add(21);
		obj1.add("STRING");
		obj1.add('c');
		System.out.println("SortedSet : " +obj1);
		 

		
	}

}
