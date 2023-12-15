package demo;

public class StaticWithNonStatic {

	String eName="Mayank";
	String eId="TYC8203065";
	int sal=2000;
	static String cName;
	
	public void updateSal(int newSal)
	{
		newSal+=sal;
		System.out.println(newSal);
	}
	public static void main(String[] args) {
		new StaticWithNonStatic().updateSal(300);
	}
}
