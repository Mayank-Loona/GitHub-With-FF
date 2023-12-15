package demo;
class Sim
{
	private String dataProvider;
	private String colour;
	
	public String getDataProvider()
	{
		return dataProvider;
	}
	
	public void setDataProvider(String dataProvider)
	{
		this.dataProvider=dataProvider;
	}
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	Sim(String dataProvider,String colour)
	{
		this.dataProvider=dataProvider;
		this.setColour(colour);
	}
}

class Mobile
{
	private String brand;
	private String colour;
	
	private	Sim s = new Sim("Jio","Red");

		public String getBrand() {
			return brand;
		}
		
		public void setBrand(String brand) {
			this.brand = brand;
		}
		
		public String getColour() {
			return colour;
		}
		
		public void setColour(String colour) {
			this.colour = colour;
		}
		
		Mobile(String brand,String colour)
		{
			this.brand=brand;
			this.colour=colour;
		}

		public Sim getS() {
			return s;
		}

		public void setS(Sim s) {
			this.s = s;
		}
	
}
		public class Driver {
		public static void main(String[] args)
		{
			Mobile m=new Mobile("MI","MoonLight");
			System.out.println(m.getBrand());
			System.out.println(m.getColour());
			m.setBrand("Samsung");
			System.out.println(m.getBrand());
			System.out.println(m.getS().getColour());;
		}
		}
