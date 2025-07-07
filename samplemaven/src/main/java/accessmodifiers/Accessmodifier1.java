package accessmodifiers;

public class Accessmodifier1 {
	
	public void display1()
	{
		System.out.println("Public");
	}
	
	private void display2()
	{
		System.out.println("Private");
	}
	
	protected void display3()
	{
		System.out.println("Protected");
	}
	
	void display4()
	{
		System.out.println("Default");
	}
	
	public static void main(String args[])
			{
		            
		Accessmodifier1 obj=new Accessmodifier1();
		   obj.display1();
		   obj.display2();
		   obj.display3();
		   obj.display4();
		
			}

}
