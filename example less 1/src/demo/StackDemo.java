package demo;
import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Stack <String> stack =new Stack<String>();
		//ADD element to Stack By Push Operation
		
	
		
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		stack.push("Fourth");
		stack.push("Fifth");
		stack.push("Sixth");
		stack.push("Seventh");
		
		System.out.println("initial Stack");
		System.out.println(stack);
		
		System.out.println("Enter a strig to check : ");
		String usr_string  = sc.next();
		
		//Check if element exist in stack
		
		if(stack.search(usr_string) !=-1) {
			System.out.println("Given string "+usr_string +"Exist in stack");
			
		}
		else {
			System.out.println("Given string"+usr_string +"Does'nt exist in stack ");
			
		}
		System.out.println("Getting top element of the stack by using PEEK :"+ stack.peek());
		
		//Removing element for Stack Using pop
		
		stack.pop();
		stack.pop();
		
		System.out.println("Stack after popping two elements: ");
		System.out.println(stack);
		
		while(! stack.empty()) {
			 stack.pop();
			 System.out.println("Stack after poping one element  "+stack);
		}
		

	}

}
