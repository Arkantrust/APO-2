package ui; 
import model.*; 

public class Main{

	public static void main(String[] args) {
		
		LinkedList listL = new LinkedList(); 

		listL.addLast(new Node(0));
		listL.addLast(new Node(1));
		listL.addLast(new Node(2));
		listL.addLast(new Node(3));
		listL.addLast(new Node(4));
		listL.addLast(new Node(5));
		listL.addLast(new Node(6));

		listL.print();
	}
}
