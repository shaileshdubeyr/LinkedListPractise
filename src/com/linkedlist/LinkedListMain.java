package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class LinkedListMain {
	@Test
	public void From3NumbersDeletingFirstNumberFromArryList() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		LinkedListTest myLinkedList = new LinkedListTest();
		INode value = myLinkedList.pop();
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && 
				 myLinkedList.head.getNext().equals(mySecondNode)&& 
				 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);	
	}
}
