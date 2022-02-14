package demo;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class StudentRecord implements Comparable {
	String name;
	int rollNumber;
	String address;
	//Constructor
	StudentRecord(String name ,int rollNumber,String address){
		this.name= name;
		this.rollNumber = rollNumber;
		this.address= address;
		
	}
	public String toString() {
		return this.rollNumber +" "+this.name+ " "+this.address+" " ;
		
	}
	public static void main(String[] args) {
		ArrayList stud = new ArrayList();
		
		//Adding student details
		stud.add(new StudentRecord ("lol",1,"koo"));
		stud.add(new StudentRecord ("lll",2,"koo"));
		stud.add(new StudentRecord ("kk",3,"koo"));
		stud.add(new StudentRecord ("hh",4,"koo"));
		stud.add(new StudentRecord("kkjjj",5,"koo"));
		stud.add(new StudentRecord("fd",6,"koo"));
		//sorting the Student data
		Collections.sort(stud);
		System.out.println(" This list after sorting");
		System.out.println("stud");
		//sorting by rollnumber
		System.out.println("After sorting by roll no");
		for(int i=0;i<stud.size();i++) {
			System.out.println(stud.get(i));
			
		}
	}



@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return this.rollNumber-((StudentRecord)o).rollNumber;
}
}

