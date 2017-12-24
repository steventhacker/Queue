package com.steve.queue;

/**
 * Node for a queue
 */
public class Node<E> {
	private E value;
	private Node nextNode;
	private Node prevNode;

	public Node(E value) {
		this.value = value;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public Node getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}
}
