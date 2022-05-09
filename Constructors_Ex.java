package Javapkg;
class Values
{
	int a;
	int b;
	//Default constructor
	Values()
	{
		a=10;
		b=20;	
	}
	//Parameterised constructors
	Values(int c,int d)
	{
		a=c;
		b=d;
	}
}
public class Constructors_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Values v1=new Values();
System.out.println(v1.a);
System.out.println(v1.b);
Values v2=new Values(5,6);
System.out.println(v2.a);
System.out.println(v2.b);

	}

}
