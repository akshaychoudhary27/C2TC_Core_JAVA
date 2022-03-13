package dataTypes;

import java.util.Scanner;

public class NoOfOccuranceArray {
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
		int flag=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==s) {
				flag++;
			}
		}
		System.out.println(flag);
		}
}
