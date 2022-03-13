package dataTypes;
import java.util.*;
public class typeCasting {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr;
	arr=new int[n];
	for(int i=0; i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int s=sc.nextInt();
	sc.close();
	String flag="";
	for(int i=0;i<n;i++) {
		if(arr[i]==s) {
			flag="Found";
			break;
		}
		else {
			flag="Not Found";
		}
	}
	System.out.println(flag);
	}
}
