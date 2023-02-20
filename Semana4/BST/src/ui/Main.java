package ui;

import model.*;

public class Main{

	public static void main(String[] args) {
		BST tree = new BST(); 

		tree.insert(new Node(50)); 
		tree.insert(new Node(40)); 
		tree.insert(new Node(60)); 
		tree.insert(new Node(45)); 
		tree.insert(new Node(55)); 
		tree.insert(new Node(30)); 

		tree.inOrder(); 
		System.out.println("");
		System.out.print(tree.inOrderString());

		
	}
}
