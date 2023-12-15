package demo;

//Assesment try catch throws 
import java.util.Scanner;
class WQ extends Exception
{
	public  WQ(String msg){
		super(msg);
}
}
public class Working_With_Try_Catch extends Exception {
 
	static Scanner sc=new Scanner(System.in);
	
	
	
	public static void main(String[] args) throws WQ {
	
	System.out.println("Enter the Option");
	char c=	sc.next().charAt(0);
	switch(c) {
	case 'A':
	case 'B' :
	default :	
			{
		if(c>='A'&& c<'E')
		{
			System.out.println("Win with quiz");
		}
		else
		{
			System.out.println("wRONG ");
			throw new WQ("Wrong Option");
		}
	}
		
	}
	
	}
}

