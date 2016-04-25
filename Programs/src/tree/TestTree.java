package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestTree {

	public static void main(String[] args) {
		// int max1;
		BinaryTreeNode n1 = new BinaryTreeNode(1);
		BinaryTreeNode n2 = new BinaryTreeNode(2);
		BinaryTreeNode n3 = new BinaryTreeNode(3);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n6 = new BinaryTreeNode(6);
		BinaryTreeNode n7 = new BinaryTreeNode(7);
		n1.setLeft(n2);
		n1.setRight(n3);
		n2.setLeft(n4);
		n2.setRight(n5);
		n3.setLeft(n6);
		n3.setRight(n7);

		// preTraversal(n1);

		ArrayList<Integer> res1;
		res1 = preOrderTraversal(n1);
		System.out.println(res1);

	}

	public static void preTraversal(BinaryTreeNode root) {
		if (root != null) {
			System.out.print(root.getData());
			preTraversal(root.getLeft());
			preTraversal(root.getRight());

		}

	}

	public static ArrayList<Integer> preOrderTraversal(BinaryTreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		if (root == null)
			return res;
		s.push(root);
		while (!s.isEmpty()) {
			root = s.pop();
			res.add(root.getData());

			if (root.getRight() != null)
				s.push(root.getRight());

			if (root.getLeft() != null)
				s.push(root.getLeft());

		}
		return res;

	}

	public static ArrayList<Integer> inOrderTraversal(BinaryTreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		// BinaryTreeNode a;
		do {
			while (root != null) {
				s.push(root);
				root = root.left;
			}

			if (root == null && !s.empty()) {
				root = s.pop();
				res.add(root.data);
				root = root.right;
			}

		} while (root != null || !s.empty());

		return res;

	}

	public static ArrayList<Integer> levelOrderTraversal(BinaryTreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			if (root.left != null)
				q.add(root.left);
			if (root.right != null)
				q.add(root.right);

			res.add(q.remove().data);
			root = q.peek();
		}
		return res;
	}

	public static int maxintree(BinaryTreeNode root) {
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);
		int max = 0, a;
		while (!q.isEmpty()) {
			if (root.left != null)
				q.add(root.left);
			if (root.right != null)
				q.add(root.right);

			a = q.remove().data;
			if (a > max)
				max = a;

			root = q.peek();
		}
		return max;
	}
}
