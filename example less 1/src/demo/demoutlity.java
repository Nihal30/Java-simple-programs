package demo;
import java.util.*;
import java.util.function.*;
import java.util.*;


class MyConsumer<T> implements Consumer<T>{
	public void accept(T ctask) {
		System.out.println("Working on the numbers "+ ctask);
		System.out.println(" Result afer adding 5 to given number is : "+((int)ctask +5) );
	}
	
}

public class demoutlity {
	public static void main(String[] args){
		ArrayList myList;
		MyConsumer mcos;
		myList = new ArrayList(5);
		mcos = new MyConsumer();
		
		myList.add(100);
		myList.add(200);
		myList.add(300);
		myList.add(400);
		myList.add(500);
		
		myList.forEach(mcos);
		
	}

}
