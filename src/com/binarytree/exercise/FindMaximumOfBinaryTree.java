package com.binarytree.exercise;

public class FindMaximumOfBinaryTree {

	Node root;

	public static void main(String[] args) {
		FindMaximumOfBinaryTree tree = new FindMaximumOfBinaryTree();
		tree.root = new Node(2);
		tree.root.left = new Node(7);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(1);
		tree.root.left.right.right = new Node(11);
		tree.root.right.right = new Node(9);
		tree.root.right.right.left = new Node(4);

		System.out.println(tree.findMax(tree.root));
		
	}

	static int findMax(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int resMax = node.data;
		int lres = findMax(node.left);
		int rres = findMax(node.right);

		if (lres > resMax) {
			resMax = lres;
		}
		if (rres > resMax) {
			resMax = rres;
		}
		return resMax;
	}
	
}
