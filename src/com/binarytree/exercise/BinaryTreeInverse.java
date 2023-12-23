package com.binarytree.exercise;

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		 data = item;
		left = right = null;
	}
}

public class BinaryTreeInverse {
	Node root;

	void mirror() {
		root = mirror(root);
	}

	Node mirror(Node node) {
		if (node == null) {
			return node;
		}

		Node leftN = mirror(node.left);
		Node rightN = mirror(node.right);

		node.left = rightN;
		node.right = leftN;
		return node;
	}

	void inOrder() {
		inOrder(root);
	}

	void inOrder(Node node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.println(node.data + "");
		inOrder(node.right);
	}

	public static void main(String[] args) {
		BinaryTreeInverse tree = new BinaryTreeInverse();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("after construced");
		tree.inOrder();
		System.out.println("=========");
		System.out.println("traverse");
		tree.mirror();
		tree.inOrder();
	}
}
