package demo;
import java.util.StringTokenizer;
import java.util.Scanner;


public class demoutility2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String userString = sc.nextLine();
		
		System .out.println("Enter any sentence? ");
		
		StringTokenizer st = new StringTokenizer(userString, "");
		System.out.println("\n Vowel count for each word in given string ar");
		
		while(st.hasMoreTokens()) {
			String Words = st.nextToken();
			System.out.println("Processing words "+ Words);
			int vowelCount =0;
			for(char c:Words.toCharArray()) {
				c=Character.toLowerCase(c);
				if(c == 'a'||c =='i' || c =='o'|| c =='e'|| c=='u') {
				vowelCount++;}
			}
		
		System.out.println(" the wors "+ Words +"has" +vowelCount+ "vowels");
				}
	}
			
	
		
		

	}


