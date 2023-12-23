package com.javatpoints.singlelinkedlist.programs;

//class Node {
//	int data;
//	Node next;
//
//	public Node(int i) {
//		data = i;
//		next = null;
//	}
//}

public class CreateASinglyLinkedListOfNNodesAndCountTheNumberOfNodes_03 {
	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

	}

	public int countNodes() {
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;

	}

	public void display() {

		Node node = head;
		if (head == null) {
			return;
		} else {
			while (node != null) {
				System.out.println(node.data + " ");
				node = node.next;
			}
		}
	}

	public static void main(String[] args) {
		CreateASinglyLinkedListOfNNodesAndCountTheNumberOfNodes_03 cas = new CreateASinglyLinkedListOfNNodesAndCountTheNumberOfNodes_03();
		cas.addNode(100);
		cas.addNode(200);
		cas.addNode(300);

		cas.display();

		System.out.println("Counted nodes :" + cas.countNodes());
	}
}
