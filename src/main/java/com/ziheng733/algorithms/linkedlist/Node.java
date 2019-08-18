package com.ziheng733.algorithms.linkedlist;

/**
 * 结点
 * @author wenziheng
 *
 * @param <E>
 */
public class Node<E> {

	private E e;
	private Node<E> next;

	public Node(E e, Node<E> next) {
		this.e = e;
		this.next = next;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [e=" + e + ", next=" + next + "]";
	}
	
}
