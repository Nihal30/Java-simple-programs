package demo;
import java.util.Scanner;

public class cal {
	public static void main (String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two no :  ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(  " arthemetic operations : ");
		System.out.println(  " add : "+ ( a+b) );
		System.out.println(  " sub : "+ (a-b));
		System.out.println(  " mul : "+ (a*b));
		System.out.println(  " div : "+(a/b));
		
		
		
		
		
	}

}
