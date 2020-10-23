package hashtable;

public class MylinkedList {

	public INode<K> head;
	public INode<K> tail;

	public MyLinkedList() {
		this.head = head;
		this.tail = tail;
	}

	public void add(INode<K> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode<K> myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	@Override
	public String toString() {
		return "MyLinkedListNodes{" + head + '}';
	}

	public void printMyNodes() {
		System.out.println("My Nodes:" + head);
	}

	public INode search(K key) {
		INode temp = head;
		while (temp != null && temp.getNext() != null) {
			if (temp.getKey().equals(key)) {
				return temp;
			} else
				temp = temp.getNext();
		}
		return null;
	}
}

