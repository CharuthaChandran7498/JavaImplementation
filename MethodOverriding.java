package Javapkg;
class methodoverriding1
{
	void display()
	{
		System.out.println("Parent class display");
	}
}
class methodoverriding2 extends methodoverriding1
{
	void display()
	{
		System.out.println("Child class display");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverriding1 a=new methodoverriding1();
         a.display();
         methodoverriding1 a1=new methodoverriding2();
         a1.display();
	}

}
