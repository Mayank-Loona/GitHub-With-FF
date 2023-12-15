package demo;

public class Object_Methods {
	String name;
	int i;
	//====================toString with override======================================
//	public String toString()
//	{
//		return name;
//	}
public Object_Methods(String name) {

	this.name=name;
}
public Object_Methods(int i) {
	this.i=i;
}
	public boolean equals(Object o)
	{
		Object_Methods om=(Object_Methods) o;
		if(this.name.equals(om.name))
		return true;
		else {
			return false;
		}
	}
	public boolean equals1(Object o)
	{
		Object_Methods om=(Object_Methods) o;
		return this.i==om.i;
	}

	public static void main(String[] args) {
		Object_Methods om=new Object_Methods("Loona");
		Object_Methods om1=new Object_Methods("ji");
		Object_Methods om3=new Object_Methods(98);
		Object_Methods om2=om;
		Object_Methods om4=om3;
		Object_Methods om5=new Object_Methods(98);
		System.out.println(om3.equals1(om5));//
		System.out.println(om1.equals(om));//false
		System.out.println(om==om1);//false
		System.out.println(om==om2);//true
		System.out.println(om.equals(om2));//true

		
		
		
	
		
		
		
		
		
		
		
		
		
		//equals without override=======================================
//		Object_Methods om=new Object_Methods("MayNK");
//		System.out.println(om.toString());
//		
//		Object_Methods om1=new Object_Methods("MayNK");
//		System.out.println(om1.equals(om));
//		System.out.println(om1==om);
//		
//		Object_Methods om2 = om;
//		System.out.println(om2.equals(om1));
//		System.out.println(om2.equals(om));
//		System.out.println(om2==om);
//		System.out.println(om2==om1);
		
		
	
	}

	
}
