package model; 

public class BST {

	private Node root; 

	public BST() { }	
	
	public void insert(Node node){
		if(root == null){
			root = node; 
		}
		else{
			insert(node, root); 
		}
	}

	private void insert(Node node, Node current){
		// Izquierda 
		if(node.getValue() < current.getValue()){
			if(current.getLeft() == null){
				current.setLeft(node); 
			}
			else{
				insert(node, current.getLeft()); 
			}
		}
		// Derecha 
		else if(node.getValue() > current.getValue()){
			if(current.getRight() == null){
				current.setRight(node); 
			}
			else{
				insert(node, current.getRight()); 
			}
		}
		else{
			// los nodos son iguales 
		}
	}

	public void inOrder(){
		inOrder(root); 
	}

	private void inOrder(Node current){
		if(current == null){
			return; 
		}
		inOrder(current.getLeft()); 
		System.out.print(current.getValue()+"\t");
		inOrder(current.getRight());
	}

	public String inOrderString(){
		return "[" + inOrderString(root) + "]"; 
	}

	private String inOrderString(Node current){
		if(current == null){
			return ""; 
		}

		return inOrderString(current.getLeft()) + " " + current.getValue() + " " + inOrderString(current.getRight()); 
	}

}
