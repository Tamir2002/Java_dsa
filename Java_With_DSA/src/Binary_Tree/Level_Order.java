package Binary_Tree;

import java.util.*;
import java.util.Scanner;

public class Level_Order {
Scanner sc1=new Scanner(System.in);
	
public class Node {
	int data;
	Node left;
	Node right;

}

private Node root;

public Level_Order() {
	// TODO Auto-generated constructor stub
	root = CreateTree();
}

Scanner sc = new Scanner(System.in);

private Node CreateTree() {
	// TODO Auto-generated method stub
	int item = sc1.nextInt();
	Node nn = new Node();
	nn.data = item;
	boolean hlc = sc1.nextBoolean();
	if (hlc == true) {
		nn.left = CreateTree();
	}
	boolean hrc = sc1.nextBoolean();
	if (hrc == true) {
		nn.right = CreateTree();
	}
	return nn;
}

public void levelorder() {
//	LinkedList<Node> q1 = new LinkedList<>();
	Queue<Node> q = new LinkedList<>();
	q.add(root);
	while (!q.isEmpty()) {
		Node rv = q.remove();
		System.out.print(rv.data + " ");
		if (rv.left != null) {
			q.add(rv.left);
		}
		if (rv.right != null) {
			q.add(rv.right);
		}

	}
	System.out.println();
}
}