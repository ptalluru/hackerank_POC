package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class Fifteen {

	public static Node insert(Node head, int data) {

		if (head == null)
			return new Node(data);

		if (head.next == null) {
			head.next = new Node(data);
		} else {
			insert(head.next, data);
		}

		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int N = sc.nextInt();
		Node head = null;
		while (N-- > 0) {
			System.out.println("Enter the element");
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}
}