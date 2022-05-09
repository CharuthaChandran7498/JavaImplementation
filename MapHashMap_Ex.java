package Javapkg;

import java.util.HashMap;
import java.util.Map;

public class MapHashMap_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> number=new HashMap<>();
number.put("one",1);
number.put("two",2);
number.put("three",3);
number.put("four",4);
for(Map.Entry pairEntry:number.entrySet())
{
	System.out.println(pairEntry.getKey()+":"+pairEntry.getValue());
}
System.out.println(number.containsKey("one"));
System.out.println(number.containsValue(2));
System.out.println(number.size());
	}

}
