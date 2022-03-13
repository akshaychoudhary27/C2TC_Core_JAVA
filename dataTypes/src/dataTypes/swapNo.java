package dataTypes;
import java.util.Scanner;

public class swapNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swapped numbers are: " + a + " & " + b);
		//System.out.println(a);
	}
}
