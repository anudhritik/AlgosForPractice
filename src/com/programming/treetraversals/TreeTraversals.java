package com.programming.treetraversals;

public class TreeTraversals {
	static Node root;

	static class Node {
		int data;
		Node rChild;
		Node lChild;

		Node(int d) {
			data = d;
			rChild = null;
			lChild = null;
		}
	}
	
	TreeTraversals() {
		root = null;
	}

	void printInorder(Node node) {
		if (node == null) {
			return;
		}

		printInorder(node.lChild);
		System.out.println(node.data + "");
		printInorder(node.rChild);
	}
	
	void printPreorder(Node node){
		if(node == null){
			return;
		} 
		System.out.println(node.data + "");
		printPreorder(node.lChild);
		printPreorder(node.rChild);
	}
	
	void printPostorder(Node node){
		if(node==null){
			return;
		}
		printPostorder(node.lChild);
		printPostorder(node.rChild);
		System.out.println(node.data + "");
	}
	
	public static void main(String[] args) {
		TreeTraversals obj = new TreeTraversals();
		obj.root = new Node(1);
		obj.root.lChild = new Node(2);
		obj.root.rChild = new Node(3);
		obj.root.lChild.lChild = new Node(4);
		obj.root.lChild.rChild = new Node(5);
		obj.root.rChild.rChild = new Node(6);
		System.out.println("Inorder Tarversal: ");
		obj.printInorder(root);
		System.out.println("Preorder Traversal: ");
		obj.printPreorder(root);
		System.out.println("Postorder Traversal: ");
		obj.printPostorder(root);
		
	}

}