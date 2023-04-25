package ui; 
import java.util.*;

import model.*;

public class Main{

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>(); 

		people.add(new Person("p2", 10)); 
		people.add(new Person("p4", 30)); 
		people.add(new Person("p6", 50)); 
		people.add(new Person("p3", 20)); 
		people.add(new Person("p5", 40)); 

		AgeComparator ageComparator = new AgeComparator(); 

		Collections.sort(people, ageComparator); 

		for (Person p : people) {
			System.out.println(p.getName() + "-" + p.getAge());
		}

		System.out.println("*********************************************************");
 
		List<Person> people2 = new ArrayList<>(); 

		Person p3 = new Person("p3", 50);

		people2.add(new Person("p1", 10)); 
		people2.add(new Person("p4", 20)); 
		people2.add(new Person("p2", 30)); 
		people2.add(new Person("p5", 40)); 
		people2.add(p3); 
		
		Comparator<Person> nameComparator = (p1, p2) -> p1.getName().compareTo(p2.getName()); 
		Collections.sort(people, nameComparator); 

		for (Person p : people2) {
			System.out.println(p.getName() + "-" + p.getAge());
		}



	}
}
