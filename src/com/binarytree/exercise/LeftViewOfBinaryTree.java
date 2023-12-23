package com.binarytree.exercise;

import java.util.TreeMap;
import java.util.Vector;

//class Node {
//	int data;
//	Node left, right;
//
//	public Node(int item) {
//		data = item;
//		left = right = null;
//	}
//}

class Min_level {
	int min_Level;
}

public class LeftViewOfBinaryTree {
	Node root;
	Min_level min = new Min_level();

	public static void main(String[] args) {
		LeftViewOfBinaryTree tree = new LeftViewOfBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.right = new Node(6);
		tree.root.right.left = new Node(7);
		tree.root.right.left.right = new Node(8);
		tree.root.left.right.left = new Node(9);

		tree.leftView();
	}

	void leftView() {
		leftView(root);
	}

	void leftView(Node node) {
		leftViewUtil(node, 0, min);
	}

	void leftViewUtil(Node node, int level, Min_level min_level) {
		if (node == null) {
			return;
		}
		if (min_level.min_Level < level) {
			System.out.println(node.data);
			min_level.min_Level = level;
		}

		leftViewUtil(node.left, level + 1, min);
		leftViewUtil(node.right, level + 1, min);
	}
}
