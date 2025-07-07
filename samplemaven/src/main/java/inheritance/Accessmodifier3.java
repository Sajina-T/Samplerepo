package inheritance;

import accessmodifiers.Accessmodifier1;

public class Accessmodifier3 extends Accessmodifier1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accessmodifier1 obj=new Accessmodifier1();
		Accessmodifier3 obj1=new Accessmodifier3();
		
		obj.display1();
		obj1.display1();
		obj1.display3();

	}

}
