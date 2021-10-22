package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class LinkedListMain {
	@Test
	public void giveElementFindKeyNodeShouldPassLinkedListResult() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		LinkedListTest myLinkedList = new LinkedListTest();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode getNode = myLinkedList.findNode();
		System.out.println("find key is "+getNode.getKey());
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) &&
				 myLinkedList.head.getNext().equals(mySecondNode);
				 myLinkedList.tail.equals(mySecondNode);	
		Assert.assertTrue(result);
	}
}
