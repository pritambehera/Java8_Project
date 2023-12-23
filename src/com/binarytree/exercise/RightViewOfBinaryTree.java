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

class Max_Level {
	int max_level;
}

public class RightViewOfBinaryTree {
	Node root;
	Max_Level max = new Max_Level();

	void rightView() {
		rightView(root);
	}

	void rightView(Node node) {
		rightViewUtil(node, 0, max);

	}

	void rightViewUtil(Node node, int level, Max_Level max_Level) {
		if (node == null) {
			return;
		}

		if (max_Level.max_level < level) {
			System.out.println(node.data + "");
			max_Level.max_level = level;
		}

		rightViewUtil(node.right, level + 1, max_Level);
		rightViewUtil(node.left, level + 1, max_Level);
		
		
	}

//	private void rightViewUtil(Node right, int level, Max_Level max_Level) {
//		// TODO Auto-generated method stub
//		
//	}

	public static void main(String[] args) {
		RightViewOfBinaryTree tree = new RightViewOfBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.left.right = new Node(8);

		tree.rightView();
	}
}
