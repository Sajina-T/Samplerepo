package aggregation;

public class Aggregationchild {
	
	String city;
	String state;
	Aggregationparent ref;
	
	public Aggregationchild(String city,String state,Aggregationparent ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println("My city is "+city + "and My state is"+state );
		System.out.println("NAme"+ref.name+"rollno"+ref.rollno+"Address"+ref.address);
		
	}
	
	public static void main(String args[])
	{
		Aggregationparent obj1=new Aggregationparent("Abhay",1,"Kannanteveedu,Tirur");
		Aggregationchild obj2=new Aggregationchild("Malapurram","Kerala",obj1);
		obj2.display();
		
	}
	

}
