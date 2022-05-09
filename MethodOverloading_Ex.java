package Javapkg;
class sum
{
	static int sum1(int a,int b)
	{
		return a+b;
	}
	static double sum1(double a,double b)
	{
		return a+b;
	}
}

public class MethodOverloading_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(sum.sum1(5, 6));
        System.out.println(sum.sum1(5.5, 6.0));
        
	}

}
