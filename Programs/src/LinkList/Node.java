package LinkList;

public class Node {
	int info;
	Node next;

	public Node(int info) {
		this.info = info;
	}

	public void setinfo(int info) {
		this.info = info;
	}

	public int getinfo() {
		return info;
	}

	public void setnext(Node next) {
		this.next = next;
	}

	public Node getnext() {
		return next;
	}

}