package ui;

import model.*;

public class Main{

	public static void main(String[] args) {
		BST tree = new BST(); 

		tree.insert(new Node(50)); 
		tree.insert(null);
		tree.insert(new Node(40)); 
		tree.insert(new Node(40)); 
		tree.insert(new Node(60)); 
		tree.insert(new Node(45)); 
		tree.insert(new Node(55)); 
		tree.insert(new Node(30)); 
		tree.insert(new Node(70)); 

		tree.inOrder(); 
		System.out.println("");
		System.out.print(tree.inOrderString());

		tree.delete(30);

		System.out.println("");
		System.out.print(tree.inOrderString());


		tree.delete(60);

		System.out.println("");
		System.out.print(tree.inOrderString());

		tree.delete(50);

		System.out.println("");
		System.out.print(tree.inOrderString());

		
	}
}
