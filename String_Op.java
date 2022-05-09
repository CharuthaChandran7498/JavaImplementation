
package Javapkg;
import java.util.Scanner;
public class String_Op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 strings");
a=sc.nextLine();
b=sc.nextLine();
//length of strings
System.out.println("The length os string 1 is: "+a.length());
System.out.println("The length os string 2 is: "+b.length());
//Concatination of strings
c=a+b;
System.out.println("Concat of 2 string is: "+c);
//Uppercase
System.out.println("The first string in uppercase : "+a.toUpperCase());
//Lowercase
System.out.println("The second string in uppercase : "+a.toLowerCase());
	}

}