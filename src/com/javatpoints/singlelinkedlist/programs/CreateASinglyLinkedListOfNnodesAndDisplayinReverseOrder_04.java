package com.javatpoints.singlelinkedlist.programs;

//class Node {
//	int data;
//	Node next;
//
//	public Node(int item) {
//		data = item;
//		next = null;
//	}
//}

public class CreateASinglyLinkedListOfNnodesAndDisplayinReverseOrder_04 {
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

	public void reverseOrder(Node node) {
		if (node == null) {
			return;
		} else {
			if (node.next == null) {
				System.out.println(node.data + "");
				return;
			}
		}
		reverseOrder(node.next);
		System.out.println(node.data + "");

	}

	public void display() {
		Node root = head;
		if (head == null) {
			return;
		} else {
			while (root != null) {
				System.out.println(root.data + " ");
				root = root.next;
			}
		}
	}

	public static void main(String[] args) {
		CreateASinglyLinkedListOfNnodesAndDisplayinReverseOrder_04 casr = new CreateASinglyLinkedListOfNnodesAndDisplayinReverseOrder_04();
		casr.addNode(100);
		casr.addNode(200);
		casr.addNode(300);
		casr.addNode(400);
		casr.addNode(500);
		System.out.println("displaying");
		casr.display();

		System.out.println("reverse order is :");
		casr.reverseOrder(casr.head);
	}
}
