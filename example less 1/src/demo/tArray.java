package demo;

public class tArray {
static void min(int a[]) {
 
	
		int value = a[0];
		for(int m=1;m<a.length;m++) {
			if (value >a[m])
				value =a[m];
		
			System.out.print( value);
			
		}
		
			

	}
public static void main(String args[]) {
	int x[]= {93,3,9,2};
	min(x);
}

}
