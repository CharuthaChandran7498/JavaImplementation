package Javapkg;
interface Area
{
	void area(double r);
}
class Circle implements Area
{
	public void area(double r)
	{
		System.out.println("Area is :"+(3.14*r*r));
	}
}

public class Interface_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Circle c=new Circle();
      c.area(6.7);
	}

}
