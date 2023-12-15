package demo;

class Account
{
	long accno;
	double bal;
	public void deposit(double amt)
	{
		bal=bal+amt;
	}
	public void withdraw(double amt)
	{
		bal=bal-amt;
	}
}
class Savings extends Account
{
	double roi=0.05;
	void roi()
	{
		bal=bal+bal*roi;
		System.out.println("Adding Roi " +bal);
	}
}
class Current extends Account
{
	double min_bal=5000.50;
	void showMinbal()
	{
		System.out.println(min_bal);
	}
	 
}
public class Hierarchical_Inheritance {
public static void main(String[] args) {
	Savings s=new Savings();
	s.accno=63711011l;
	s.deposit(500);
	System.out.println(s.bal);
	s.roi();
	
	System.out.println("==========");
	Current c=new Current();
	c.accno=67220113;
	c.deposit(5600);
	c.showMinbal();
	c.withdraw(2000);
	System.out.println(c.bal);
}
}
