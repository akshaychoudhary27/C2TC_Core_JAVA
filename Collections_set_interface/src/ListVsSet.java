import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSet {
	public	static void main(String args[])
	{	
		//list
		List obj= new ArrayList ();
		obj.add("object");
		obj.add("Method");
		obj.add("Method");
		obj.add(10.0);
		obj.add(100);
		System.out.println("List : " +obj);
		
		//set
		Set obj1= new HashSet();
		obj1.add("object");
		obj1.add("Method");
		obj1.add("Method");
		obj1.add(10.0);
		obj1.add(100);
		System.out.println("Set : " +obj1);

	} 

}
