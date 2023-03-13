package ui; 

import exceptions.EmptyFieldException;
import model.Contact;
import model.LinkedList;
import model.Node;

public class Main {

	public static void main(String[] args) {

		LinkedList<Contact, String> linkedList = new LinkedList<>(); 

		try{
			Contact c1 = new Contact("Nayeli",    "50", "Nayeli.email@gmail.com"  );
			Contact c2 = new Contact("Sergio",    "40", "Sergio.email@gmail.com" );
			Contact c3 = new Contact("Isabella",  "60", "Isabella.email@gmail.com");
			Contact c4 = new Contact("Yeison",    "45", "Yeison.email@gmail.com"  );
			Contact c5 = new Contact("Valentina", "55", "Valentina.email@gmail.com");
			Contact c6 = new Contact("Danna",     "30", "Danna.email@gmail.com"   );
			Contact c7 = new Contact("Sebastian", "70", "Sebastian.email@gmail.com");

			linkedList.addLast(new Node<Contact, String>(c1, c1.getPhone()));
			linkedList.addLast(new Node<Contact, String>(c2, c2.getPhone()));
			linkedList.addLast(new Node<Contact, String>(c3, c3.getPhone()));
			linkedList.addLast(new Node<Contact, String>(c4, c4.getPhone()));
			linkedList.addLast(new Node<Contact, String>(c5, c5.getPhone()));
			linkedList.addLast(new Node<Contact, String>(c6, c6.getPhone()));
			linkedList.addLast(new Node<Contact, String>(c7, c7.getPhone()));

		}catch (EmptyFieldException e){

		}


		linkedList.print();



		
	}

}
