package com.javatpoints.singlelinkedlist.programs;

class Node {
	int data;
	Node next;

	public Node(int item) {
		data = item;
		next = null;
	}

}

public class LinkedListExample_01 {
	Node head;

	public void display() {
		Node n = head;
		while (n != null) {
			
			System.out.println(n.data + "print data of node");
			
			n = n.next;
		}
	}
	public static void main(String[] args) {
		LinkedListExample_01 llist = new LinkedListExample_01();
		
		llist.head = new Node(100);
		
		Node sec = new Node(200);
		
		Node thi = new Node(300);

		llist.head.next = sec;
		
		sec.next = thi;
		
		llist.display();
	}

}
