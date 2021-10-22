package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListMain {
	@Test
	public void given3NumberWhenAppendedShouldBeAddedToLast() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		LinkedListTest myLinkedList = new LinkedListTest();
		myLinkedList.add(myFirstNode);
		myLinkedList.appendNodes(mySecondNode);
		myLinkedList.appendNodes(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) &&
				 myLinkedList.head.getNext().equals(mySecondNode)&& 
				 myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}
}
