package demo;

class Facebookv1
{
	void addFriend()
	{
		System.out.println("User is able to add friend ");
	}
}
class Facebookv2 extends Facebookv1
{
	void post()
	{
		System.out.println("User should be able to Upload post");
	}
}
class Facebookv3 extends Facebookv2
{
	void status()
	{
		System.out.println("User should be able to upload status");
	}
}
public class Multi_Level_Inheritance {
	public static void main(String[] args) {
	
	Facebookv3 fb = new Facebookv3();
	fb.addFriend();
	fb.post();
	fb.status();
	
}
}