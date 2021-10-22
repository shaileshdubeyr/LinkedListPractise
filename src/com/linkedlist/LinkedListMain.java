package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListMain {	
	@Test
	public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		LinkedListTest myLinkedList = new LinkedListTest();
		myLinkedList.add(myFirstNode);
		myLinkedList.appendNodes(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && 
				 myLinkedList.head.getNext().equals(mySecondNode)&& 
				 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
}
