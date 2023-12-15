package Presentation;

import java.util.ArrayList;
import java.util.Scanner;

class Laptop
{
	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(12);
	a.add(true);
	a.add(12.32);
	a.add('A');
	a.add('0');
	a.add("ma");
	a.add(12);
	System.out.println(a);
	
	boolean b=a.contains(12);
	System.out.println(b);
	
	ArrayList a1=new ArrayList();
	a1.add(a);
	a1.add(12);
	System.out.println(a1);
	
	if(a1.containsAll(a1))
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	a1.add(a);
	System.out.println(a1);
	
	a.remove(3);
	System.out.println(a);
	
	a1.retainAll(a);
	System.out.println(a1);
	
	
	
	}
	
	
	
}