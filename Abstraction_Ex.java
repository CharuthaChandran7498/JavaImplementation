package Javapkg;
abstract class abstractA
{
	public abstract void display1();
	public void display()
	{
		System.out.println("Hello world");
	}
	
}
class abstractB extends abstractA
{
	
	public void display1()
	{
		
		System.out.println("Abstraction Example");
	}
}

public class Abstraction_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       abstractB b=new abstractB();
       b.display1();
       b.display();
	}

}
