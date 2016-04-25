package tree;

public class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;

	public BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int value) {
		data = value;
	}

	public void setLeft(BinaryTreeNode node) {
		left = node;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setRight(BinaryTreeNode node) {
		right = node;
	}

	public BinaryTreeNode getRight() {
		return right;
	}
}
