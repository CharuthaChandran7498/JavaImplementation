package Javapkg;
class Student
{
	private int id;
	private String name;
	private int age;
	public int getID()
	{
		return id;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public String getName()
	{
	return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
	return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
		
	
}

public class Encapsulation_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s=new Student();
        s.setID(1);
        s.setName("Riyon");
        s.setAge(15);
        System.out.println(s.getID()+"\n"+s.getName()+"\n"+s.getAge());
        
	}

}
