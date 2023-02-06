package model; 

public class LinkedList {

	private Node head; 
	private Node tail; 

	public LinkedList() {

	}

	public void addLast(Node node){
		if(this.head == null && this.tail == null){
			this.tail = node; 
			this.head = node; 
		}
		else{
			this.tail.setNext(node);
			this.tail = node; 
		}
	}

	// Método de activación
	public void print(){
		print(this.head); 
	}

	private void print(Node current){

		// Casos base
		if(this.head == null && this.tail == null){
			System.out.println("La lista esta vacia");
			return; 
		}
		if(current == this.tail){
			System.out.println(current.getValue());
			return; 
		}
		System.out.println(current.getValue());
		print(current.getNext());

	}



}
