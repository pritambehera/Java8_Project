package com.binarytree.exercise;

//class Node {
//	int data;
//	Node left, right;
//
//	public Node(int item) {
//		data = item;
//		left = right = null;
//	}
//}

public class FindMinimumOfBinaryTree {
	Node root;

	public static void main(String[] args) {
		FindMinimumOfBinaryTree tree = new FindMinimumOfBinaryTree();
		tree.root = new Node(2);
		tree.root.left = new Node(7);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(1);
		tree.root.left.right.right = new Node(11);
		tree.root.right.right = new Node(9);
		tree.root.right.right.left = new Node(4);

		System.out.println(tree.findMin(tree.root));
	}

	private int findMin(Node node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int resMin = node.data;
		int lres = findMin(node.left);
		int rres = findMin(node.right);

		if (lres < resMin) {
			resMin = lres;
		}
		if (rres < resMin) {
			resMin = rres;
		}

		return resMin;
	}
}
