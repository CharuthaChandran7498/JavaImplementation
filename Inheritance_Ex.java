package Javapkg;
class Numbers{
	int a=10,b=20;
}

public class Inheritance_Ex extends Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
         Inheritance_Ex ie=new Inheritance_Ex();
         sum=ie.a+ie.b;
         System.out.println(sum);
         
	}

}
