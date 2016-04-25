package LinkList;

public class StLinkList {

	Node head;
	int info;
	int length;

	public void insertBeg(Node node) {
		node.setnext(head);
		head = node;
		length++;
	}

	public void insertEnd(Node node) {
		if (head == null)
			head = node;
		else {
			Node p;
			for (p = head; p.getnext() != null; p = p.getnext())
				;
			p.setnext(node);
			length++;
		}
	}

	public void insert(int data, int position) {
		Node temp = head;

		for (int i = 1; i < position; i++)
			temp = temp.getnext();

		Node newnode = new Node(data);
		newnode.setnext(temp.getnext());
		temp.setnext(newnode);
	}

	public void dispList() {
		while (head != null) {
			System.out.print(head.getinfo() + "->");
			head = head.getnext();
		}
	}

}