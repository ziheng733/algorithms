package com.ziheng733.algorithms.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * 单链表
 * @author wenziheng
 *
 * @param <E>
 */
public class SingleLinkedList<E> {

	private Node<E> head;
	private int size;

	/**
	 * 空链表，首结点为哨兵，空结点，面对边界条件操作方便
	 */
	public SingleLinkedList(){
		this.head = new Node<E>(null, null);
		this.size = 0;
	}

	/**
	 * 获取结点数据
	 * @param index
	 * @return
	 * @throws Exception
	 */
	public E get(int index) throws Exception{
		return getNode(index).getE();
	}

	private Node<E> getNode(int index) throws Exception{
		if(index < -1 || index > size - 1) {
			throw new Exception("param index: " + index + " error");
		}
		// 哨兵头结点
		if(index == -1) {
			return this.head;
		}
		Node<E> currentNode = head.getNext();
		for(int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}

	/**
	 * 插入结点
	 * @param index
	 * @param e
	 * @throws Exception 
	 */
	public void insert(int index, E e) throws Exception {
		if(index < 0 || index > size) {
			throw new Exception("param index: " + index + " error");
		}
		Node<E> prevNode = getNode(index - 1);
		Node<E> insertNode = new Node<E>(e, prevNode.getNext());
		prevNode.setNext(insertNode);
		size++;
	}

	/**
	 * 删除结点
	 * @param index
	 * @throws Exception
	 */
	public void delete(int index) throws Exception{
		if(index < 0 || index > size) {
			throw new Exception("param index: " + index + " error");
		}
		Node<E> prevNode = getNode(index - 1);
		Node<E> deleteNode = prevNode.getNext();
		prevNode.setNext(deleteNode.getNext());
		deleteNode.setNext(null);
		size--;
	}

	public List<E> getAll() throws Exception {
		List<E> l = new ArrayList<>();
		for(int i = 0; i < size; i++) {
			l.add(get(i));
		}
		return l;
	}

	public static void main(String[] args) throws Exception {
		SingleLinkedList<String> singleLinkedList = new SingleLinkedList<>();
		System.out.println("empty list: " + singleLinkedList.getAll());
		singleLinkedList.insert(0, "a");
		System.out.println("a list: " + singleLinkedList.getAll());
		singleLinkedList.insert(1, "b");
		System.out.println("a b list: " + singleLinkedList.getAll());
		singleLinkedList.insert(1, "&");
		System.out.println("a & b list: " + singleLinkedList.getAll());
		singleLinkedList.delete(0);
		System.out.println("& b list: " + singleLinkedList.getAll());
		singleLinkedList.delete(1);
		System.out.println("& list: " + singleLinkedList.getAll());
		singleLinkedList.delete(0);
		System.out.println("empty list: " + singleLinkedList.getAll());
	}

}
