package com.javatpoints.singlelinkedlist.programs;

/*class Node {
	int data;
	Node next;

	public Node(int i) {
		data = i;
		next = null;
	}
}*/

public class DeleteANodeFromTheBeginningOfTheSinglyLinkedList_05 {
	 Node head = null;
	 Node tail = null;

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

	public void deleteNode() {

		if (head == null) {
			return;
		} else {
			if (head != tail) {
				head = head.next;
			} else {
				head = tail = null;
			}
		}
	}

	public void display() {
		Node rootNode = head;
		if (head == null) {
			return;
		} else {
			while (rootNode != null) {
				System.out.println(rootNode.data + " ");
				rootNode = rootNode.next;
			}
		}
	}

	public static void main(String[] args) {
		DeleteANodeFromTheBeginningOfTheSinglyLinkedList_05 dan = new DeleteANodeFromTheBeginningOfTheSinglyLinkedList_05();
		dan.addNode(100);
		dan.addNode(200);
		dan.addNode(300);
		dan.addNode(400);
		dan.addNode(500);
		dan.addNode(600);

		System.out.println("displaying");
		dan.display();

		while (dan.head != null) {
			dan.deleteNode();
			System.out.println("updated list");
			dan.display();
		}
	}
}
