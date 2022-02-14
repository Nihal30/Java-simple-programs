package demo;

public class ExceptionHendling {

	 public static void main(String arg[]) {
		 try {
			 int num = 9/0 ;
		 }
		 catch(ArithmeticException e) {System.out.println("denominato should not equal to zero");
		 System.out.println("Error " + e);
			 
		 }
		 finally {
			 System.out.println("This block Always Exeute");
		 }
		 System.out.println("Exception handling  end here...");
		 
	 }
}
