package demo;

import java.util.Scanner;

public class Assign_Even_Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=s.nextInt();
		int ar[]=new int [size];
		System.out.println("Enter the Number into an array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		even(ar);
		
	}
	public static void even(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		}
	}
}
