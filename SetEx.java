package Javapkg;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Set<String> hashset=new HashSet<>();
   hashset.add("One");
   hashset.add("five");
   hashset.add("Two");
   hashset.add("Four");
   hashset.add("Three");
   for(String s:hashset)
   {
	   System.out.println(s);
   }
   
   System.out.println();
   Set<String> treeset=new TreeSet<>();
   treeset.add("One");
   treeset.add("Five");
   treeset.add("Two");
   treeset.add("Four");
   treeset.add("Three");
   for(String s:treeset)
   {
	   System.out.println(s);
   }
  System.out.println(treeset.isEmpty());
  System.out.println(treeset.contains("One"));
   

	}
	

}
