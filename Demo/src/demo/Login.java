package demo;

public class Login {

	String email;
	String password;
	long phoneno;
	
	public Login(String email,String password)
	{
		this.email=email;
		this.password=password;
		
	}
	public Login(long phoneno,String password)
	{
		this.phoneno=phoneno;
		this.password=password;
	}
	public static void main(String[] args) {
		Login l=new Login(9872343934l, "Password@123");
		System.out.println(l.phoneno);
		System.out.println(l.password);
		System.out.println("====================");
		
		Login l1=new Login("raj@gmail.com", "Password@321");
		System.out.println(l1.password);
		System.out.println(l1.email);
		
	}
	}
