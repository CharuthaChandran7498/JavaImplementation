package Javapkg;
class super1
{
	int age=10;
}
class super2 extends super1
{
	int age=20;
	void display()
	{
		System.out.println(age);
		System.out.println(super.age);
	}
}
public class Super_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   super2 s=new super2();
   s.display();
	}

}
