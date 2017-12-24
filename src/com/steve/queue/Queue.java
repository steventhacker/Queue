package com.steve.queue;

import java.util.EmptyStackException;

/**
 * Simple Queue class that allows for creation, put, pop, clear, and size check
 */
public class Queue<E extends Comparable> {
	private Node rootNode;

	public Queue() {
		// Empty default constructor
	}

	@SuppressWarnings("unchecked")
	public void put(E value) {
		put(new Node(value));
	}

	public void put(Node node) {
		if (rootNode == null) {
			rootNode = node;
		} else {
			Node iterNode = rootNode;

			while (iterNode.getNextNode() != null) {
				iterNode = iterNode.getNextNode();
			}

			iterNode.setNextNode(node);
		}
	}

	public Node pop() {
		if (rootNode == null) {
			throw new EmptyStackException();
		}

		Node returnedNode = rootNode;
		rootNode = rootNode.getNextNode();

		return returnedNode;
	}

	public void clear() {
		rootNode = null;
	}

	public int getSize() {
		int size = 0;

		Node iterNode = rootNode;

		while (iterNode != null) {
			size++;
			iterNode = iterNode.getNextNode();
		}

		return size;
	}

	public void print() {
		Node iterNode = rootNode;

		while (iterNode != null) {
			System.out.println(iterNode.getValue());
			iterNode = iterNode.getNextNode();
		}
	}
}
