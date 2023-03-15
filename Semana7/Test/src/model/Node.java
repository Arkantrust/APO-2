package model; 

public class Node<T, K extends Comparable<K>> {

	private T value;
	private K key;
	private Node<T, K> next; 

	public Node(T value, K key) {
		this.value = value;
		this.key = key;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public K getKey() {
		return key;
	}

	public Node<T,K> getNext() {
		return next;
	}

	public void setNext(Node<T,K> next) {
		this.next = next;
	}

	@Override
	public String toString(){
		return "My value is: " + value; 
	}

}

