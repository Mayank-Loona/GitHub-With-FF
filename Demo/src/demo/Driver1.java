package demo;
class Sim1
{
	private String serPro;
	private int bal;
	private int validity;
	
	Sim1(String serPro, int bal,int validity)
	{
		this.serPro=serPro;
		this.bal=bal;
		this.validity=validity;
	}
	
	public String getPro()
	{
		return serPro;
	}
	public int getBal()
	{
		return bal;
	}
	public int getVal()
	{
		return validity;
	}
	
	public void setPro(String serPro)
	{
		if(this.serPro.equals(serPro))
		{
			System.out.println("You are using sim");
		}
		else
		{
			this.serPro=serPro;
			System.out.println("It is changed");
		}
	}
	
	public void setBal(int bal)
	{
		if(bal>0)
		{
			this.bal=bal;
			System.out.println("No need to recharge");
		}
		else
		{
			
			System.out.println("Succ recharged");
			System.out.println();
		}
		
	}
	public void setVal(int validity)
	{
		if(this.validity==validity)
		{
			System.out.println("No need extend");
		}
		else {
			this.validity=validity;
			System.out.println("Extended");
		}
	}
}
	public class Driver1 {
	public static void main(String[] args) {
		Sim1 s1=new Sim1("Jio", 500, 5);
		System.out.println(s1.getBal());
		
		
	}
	}