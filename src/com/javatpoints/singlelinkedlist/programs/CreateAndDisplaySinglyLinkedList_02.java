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

public class CreateAndDisplaySinglyLinkedList_02 {
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

	public void display() {
		Node root = head;
		if (head == null) {
			return;
		} else {
			while(root!=null) {
			System.out.println(root.data + " ");
			root = root.next;
			}
//			System.out.println(root + "printing root");
		}
	}

	public static void main(String[] args) {

		CreateAndDisplaySinglyLinkedList_02 cad = new CreateAndDisplaySinglyLinkedList_02();
		cad.addNode(100);
		cad.addNode(200);
		cad.addNode(300);
		cad.addNode(400);
		cad.addNode(500);

		cad.display();
	}
}
