package demo;

public class Static_non_static_block {

	public Static_non_static_block()
	{
		System.out.println("constreuctor");
	}
	static {
		System.out.println("static block");
	}
	{
	System.out.println("NSB");		
	}
	
	public static void main(String[] args) {
		Static_non_static_block s=new Static_non_static_block();
		System.out.println("Main");
	}
	
}
