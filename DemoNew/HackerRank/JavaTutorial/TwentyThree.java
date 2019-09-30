package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Scanner;

class Node2 {

	@Override
	public String toString() {
		return "Node2 [left=" + left + ", right=" + right + ", data=" + data + "]";
	}

	Node2 left, right;
	int data;

	Node2(int data) {
		this.data = data;
		left = right = null;
	}
}

class TwentyThree {

	static void levelOrder(Node2 root) {
		int height = getHeight(root);
		for (int level = 1; level <= height+1; level++) {
			printGivenLevel(root, level);
		}
	}
	private static int getHeight(Node2 root) {
		int heightLeft = 0;
		int heightRight = 0;

		if (root.left != null) {
			heightLeft = getHeight(root.left) + 1;
		}
		if (root.right != null) {
			heightRight = getHeight(root.right) + 1;
		}
		return (heightLeft > heightRight ? heightLeft : heightRight);
	}
	static void printGivenLevel(Node2 root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
    } 

	public static Node2 insert(Node2 root, int data) {
		if (root == null) {
			return new Node2(data);
		} else {
			Node2 cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node2 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}
