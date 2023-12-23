package com.binarytree.exercise;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;
// class Node {
//	int data;
//	Node left, right;
//	
//	public Node(int item) {
//		data = item;
//		left = right = null;
//		
//	}
//	
//}

public class DiagonalTraversalBinaryTree {

	static void diagonalPrintUtil(Node node, int d, TreeMap<Integer, Vector<Integer>> diagonalPrint) {
		if (node == null) {
			return;
		}
		Vector<Integer> k = diagonalPrint.get(d);

		if (k == null) {
			k = new Vector<Integer>();
			k.add(node.data);
		} else {
			k.add(node.data);
		}

		diagonalPrint.put(d, k);

		diagonalPrintUtil(node.left, d + 1, diagonalPrint);
		diagonalPrintUtil(node.right, d, diagonalPrint);
	}

	static void diagonalPrint(Node node) {
		TreeMap<Integer, Vector<Integer>> diagonalprint = new TreeMap<Integer, Vector<Integer>>();
		diagonalPrintUtil(node, 0, diagonalprint);

		for (Entry<Integer, Vector<Integer>> entry : diagonalprint.entrySet()) {

			Vector<Integer> val = entry.getValue();
			System.out.println(val);

		}
	}

	public static void main(String[] args) {

		Node root = new Node(8);
		root.left = new Node(3);
		root.left.left = new Node(1);
		root.left.right = new Node(6);
		root.left.right.left = new Node(4);
		root.left.right.right = new Node(7);
		root.right = new Node(10);
		root.right.right = new Node(14);
		root.right.right.left = new Node(13);

		
//		Node root = new Node(1);
//		root.right = new Node(3);
//		root.left = new Node(2);
//		root.left.left = new Node(4);
//		root.left.right = new Node(5);
//		root.right.left = new Node(6);
//		root.right.right = new Node(7);
//		root.right.left.right = new Node(8);
		
		diagonalPrint(root);
	}
}
