package demo;

public class Construc {

	int cc;
	String brand;
	String model;
	{
		System.out.println("Non Static block");
	}
	public Construc(int cc,String brand,String model)
	{
		this.cc=cc;
		this.brand=brand;
		this.model=model;
		
	}
	public static void main(String[] args) {
		System.out.println("Maina");
		Construc c=new Construc(2300,"Honda","City");
		System.out.println(c.cc);
		System.out.println(c.brand);
		System.out.println(c.model);
	}
}
