package Presentation;
import java.util.ArrayList;
public class Working_With_Wrapper_Class {
public static void main(String[] args) {
//	//AutoBoxing
//	int i=5;
//	Integer a=i;
//	System.out.println(a.toString());
//	System.out.println(i);
//	//Unboxing
//	Integer b=80;
//	System.out.println(b.hashCode());
//	int c=b;
//	System.out.println(c);
//	
	 ArrayList<Integer> a =new ArrayList();
	 a.add(12);
	 a.add(14);
	 a.add(15);
	 a.add(16);
	 System.out.println(a);
	 
	 ArrayList b=new ArrayList();
	 b.add(12);
	 
	 System.out.println(a.contains(b));
	 
}
}
