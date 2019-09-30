package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.Scanner;

class Node3 {

	@Override
	public String toString() {
		return "Node3 [data=" + data + ", next=" + next + "]";
	}

	int data;
	Node3 next;

	Node3(int d) {
		data = d;
		next = null;
	}

}

class TwentyFour {

	public static Node3 removeDuplicates(Node3 head) {
		Node3 current = head;
		while (null != current && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
		return head;
	}

	public static Node3 insert(Node3 head, int data) {
		Node3 p = new Node3(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node3 start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node3 head) {
		Node3 start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node3 head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}
}