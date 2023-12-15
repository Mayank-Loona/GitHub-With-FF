package Presentation;

class Checking 
{
	public int hashCode()
	{
		return 10;
	}
	public String toString()
	{
		return "ok";
	}
	public static void main(String[] args)
    {
         String s1 = "Hello";
         s1 = s1.concat("hi");
         String s2 = new String("Hellohi");
         System.out.println(s1==s2);
    }

}