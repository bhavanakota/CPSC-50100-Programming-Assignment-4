/* CPSC 50100 - Programming Fundamentals 
 * Bhavana Kota
 * Summer II 2020
 * Programming Assignment 4
 */
public class Set {
	LinkedNode head;

	public void add(int data) {
		if (!exists(data)) {
			LinkedNode new_node = new LinkedNode(data);
			new_node.next = head;
			head = new_node;
		}
	}

	public void del(int dataInt) {
		if (!exists(dataInt)) {
			return;
		}
		LinkedNode del = head;
		LinkedNode keep = null;

		if (del.data == dataInt) {
			if (head.next == null) {
				head = null;
				return;
			}
			head = head.next;
			return;
		}

		while (del.data != dataInt) {
			keep = del;
			del = keep.next;
		}

		if (del.next == null) {
			keep.next = null;
			return;
		}

		keep.next = del.next;
		return;
	}

	public boolean exists(int dataInt) {
		if (head == null) {
			return false;
		}
		LinkedNode keep = head;

		while (keep != null) {
			if (keep.data == dataInt) {
				return true;
			}
			keep = keep.next;
		}
		return false;
	}

	public String toString() {

		if (head == null) {
			return (" ");
		}
		StringBuilder newString = new StringBuilder();
		LinkedNode keep = head;
		while (keep != null) {
			newString.append(keep.data + " ");
			keep = keep.next;
		}
		return (newString.toString());
	}
}