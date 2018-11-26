package edward_dunn.datastructures_examples;

import java.util.EmptyStackException;

public class StackImp<T> {

	private static class StackNode<T> {
		private T data;
		private StackNode<T> next;

		public StackNode(T data) {
			this.data = data;
		}
	}

	private StackNode<T> top;

	// remove top item from stack
	public T pop() {
		if (top == null)
			throw new EmptyStackException();

		T item = top.data;
		top = top.next;

		return item;
	}

	// add item to top of stack
	public void push(T item) {
		StackNode<T> t = new StackNode<T>(item);

		t.next = top;
		top = t;
	}

	// return the top of the stack
	public T peek() {
		if (top == null)
			throw new EmptyStackException();

		return top.data;
	}

	// return true if stack is empty
	public boolean isEmpty() {
		return top == null;
	}

}
