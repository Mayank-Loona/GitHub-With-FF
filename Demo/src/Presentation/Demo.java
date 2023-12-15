

package Presentation;

import java.util.ArrayList;

public class Demo {
public static void main(String[] args) {
		//Seprate the string and int
		ArrayList a=new ArrayList();
		a.add(12);
		a.add(34);
		a.add("Mayank");
		a.add(234);
		a.add("Loona");
		a.add("Fire");
		a.add(34);
		a.add("Flink");
		
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();
		
		for(Object o : a)
		{
			if(o instanceof Integer)
			{
				a1.add(o);
			}
			else if(o instanceof String)
			{
				a2.add(o);
			}
		}
		System.out.println(a+" ");
		System.out.println(a1+ "");
		System.out.println(a2+ "");
}

	}

