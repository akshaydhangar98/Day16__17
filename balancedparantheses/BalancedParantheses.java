package balancedparantheses;

public class BalancedParantheses<T> {

	private T t;
	static int size;
	Node head;

	public BalancedParantheses(T t) {
		this.t = t;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public void push(String data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void pop() {
		// System.out.println(head.element);
		deleteFirst();
	}

	private void deleteFirst() {
		if (isEmpty()) {
			return;
		}
		head = head.next;
		size--;
	}

	public void peek() {
		if (isEmpty()) {
			return;
		}
		System.out.println(head.element);
	}

	public int getSize() {
		System.out.println();
		return size;
	}

	public boolean checkParanthesis() {
		String expression = (String) t;
		String[] s = expression.split("(?!^)");
		for (String element : s) {
			if (element.hashCode() == "(".hashCode()) {
				push(element);
			} else if (element.hashCode() == ")".hashCode()) {
				pop();
			}
		}
		if (isEmpty()) {
			return true;
		}
		return false;
	}
}

