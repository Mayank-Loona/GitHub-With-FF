package demo;

public class NSM {
	static int m=10;
	
	public void m1()
			{
				System.out.println("M1 is executing");
			}
			public static void main(String[] args) {
				m=20;
				new NSM().m1();
				new NSM().m1();
				System.out.println(new NSM().m=102);
			}
	
}
