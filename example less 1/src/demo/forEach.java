package demo;

public class forEach {
	public static void main(String args[]) {
		int a[]= { 13,14,14,15,45,79 };
		int sum =0;
		for(int x:a) {
			sum =sum+x;
		}
		System.out.println(sum);
	}

}
