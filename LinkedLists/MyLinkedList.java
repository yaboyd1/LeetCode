class MyLinkedList {
	// Basic Node class with simple constructors
	private class Node {
		int data;  // Data
		Node next; // Link
		public Node(int data) {
			this.data = data;
		}
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head; // First element of Linked List
	private Node tail; // Last element of Linked List
	private int size;  // Length of Linked List
	
	// Linked List Class (including a tail)
	// ====================================
	// * O(1) : Head and Tail Insertion
	// * O(n) : Add and Delete at Index
	// ====================================
	public MyLinkedList() {
		head = tail = null;
		size = 0;
	}

	// Get the value of the index-th node in the linked list. 
	// If the index is invalid, return -1.
	public int get(int index) {
		if (!isValid(index)) 
			return -1;
		return getNode(index).data;
	}
	
	// Add a node of value val before the first element of the linked list. 
	// After the insertion, the new node will be the first node of the linked list.
	public void addAtHead(int val) {
		Node insert = new Node(val, head);
		head = insert;
		if (size == 0)
			tail = insert;
		++size;
	}
	
	// Append an element after the last element of the linked list.
	public void addAtTail(int val) {
		Node insert = new Node(val);
		tail.next = insert;
		tail = insert;
		if (size == 0)
			head = insert;
		++size;
	}
	
	// Add a node of value val before the index-th node in the linked list. 
	// If index equals to the length of linked list, the node will be appended to the end of linked list. 
	// If index is greater than the length, the node will not be inserted.
	public void addAtIndex(int index, int val) {
		if (index < 0 || index > size)
			return;
		if (index == 0) 
			addAtHead(val);
		else if (index == size) 
			addAtTail(val);
		else {
			Node prev = getNode(index - 1);
			Node insert = new Node(val, prev.next);
			prev.next = insert;
			++size;
		}
	}
	
	// Delete node if the index is valid.
	public void deleteAtIndex(int index) {
		if (!isValid(index)) 
			return;
		if (size == 1)
			head = tail = null;
		else if (index == 0)
			head = head.next;
		else {
			Node prev = getNode(index - 1);
			prev.next = prev.next.next;
			if (index == size - 1)
				tail = prev;
		}
		--size;
	}

	// Is index in a valid range
	private boolean isValid(int index) {
		return index >= 0 && index < size;
	}
	
	// Returns node at specific index
	private Node getNode(int index) {
		if (!isValid(index)) return null;
		Node i = head;
		while (index-- > 0) 
			i = i.next;
		return i;
	}
}