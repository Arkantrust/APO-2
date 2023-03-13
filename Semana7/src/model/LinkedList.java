package model;

import exceptions.DuplicatedNumberException;

public class LinkedList<T, K extends Comparable<K>> {

	private Node<T, K> head; 
	private Node<T, K> tail;

	public LinkedList() { }

	public void addLast(Node<T, K> node) throws DuplicatedNumberException{
		if(head == null){
			this.head = node; 
			this.tail = node; 
		}
		else{
			if(search(node.getKey()) == null){
				tail.setNext(node);
				tail = node; 
			}
			else{
				throw new DuplicatedNumberException("Este valor ya ha sido agregado");
			}
		}
	}

	public void addFirst(Node<T, K> node){
		if(this.head == null){
			this.head = node; 
			this.tail = node; 
		}
		else {
			node.setNext(head);
			this.head = node; 
		}
	}

	//Método de activacion
	public void print(){
		print(head);
	}

	private void print(Node<T, K> current){
		//Caso base
		if(current == null){
			return;
		}
		//Llamado recursivo
		System.out.println(current.getValue());
		print(current.getNext());
	}

	public Node<T, K> search(K goal){
		return search(goal, head); 
	}

	private Node<T, K> search(K goal, Node<T, K> current){
		//caso base
		if(current == null){
			return null; 
		}
		if(current.getKey().compareTo(goal) == 0){
			return current; 
		}

		// llamado recursivo
		return search(goal, current.getNext()); 
	}

	public void delete(K goal){
		delete(goal, null, head);
	}

	private void delete(K goal, Node<T, K> previous, Node<T, K> current){
		// caso base 
		if(current == null){
			return; 
		}

		// Caso borde: eliminar la cabeza 
		if(head.getKey().compareTo(goal) == 0){
			head = current.getNext(); 
			return; 
		}
		if(tail.getKey().compareTo(goal) == 0 && tail == current){
			head = current.getNext(); 
			return; 
		}
		if(current.getKey().compareTo(goal) == 0){
			previous.setNext(current.getNext());
			return;
		}
		//Llamado recursivo
		delete(goal, current, current.getNext());
	}
}

