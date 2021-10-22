package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListMain {
	@Test
	public void giveElementInsertNewNodeAfterKeyNodeShouldPassLinkedListResult() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		LinkedListTest myLinkedList = new LinkedListTest();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode getNode = myLinkedList.findNode();
		Node<Integer> newNode = new Node<>(40);
		myLinkedList.deleteInbetween(getNode,myFirstNode);
		myLinkedList.printMyNodes();
		myLinkedList.size();
		boolean result = myLinkedList.head.equals(myThirdNode) &&
				 myLinkedList.head.getNext().equals(mySecondNode)&&
				 myLinkedList.tail.equals(mySecondNode);	
		Assert.assertTrue(result); 
	}
}
