package Javapkg;
import java.util.ArrayList;
public class ArrayList_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> al=new ArrayList<>();
        al.add("one");
        al.add("Two");
        al.add("Three");
        al.add("Four");
        al.add("Five");
        for(String s : al)
        {
        	System.out.println(s);
        }
        System.out.println("Value of index 2:"+al.get(2));
	}

}
