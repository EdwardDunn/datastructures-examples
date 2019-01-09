/*
Class description: A queue uses the FIFO concept, first in, first out.
Best used when you need to pull elements out in FIFO order.

operations used:
	add()
	remove()
	peek() 
	isEmpty()
*/

package edward_dunn.datastructures_examples;

import java.util.NoSuchElementException;

public class QueueImp<T> {

	private static class QueueNode<T> {

		private T data;
		private QueueNode<T> nextNode;

		public QueueNode(T data) {
			this.data = data;
		}

	}
	
	private QueueNode<T> firstNode;
	private QueueNode<T> lastNode;
	
	public void add(T item) {
		QueueNode<T> t = new QueueNode<T>(item);
		
		if(lastNode != null) {
			lastNode.nextNode = t;
		}
		
		//add item to end of queue
		lastNode = t;
		
		if(firstNode != null) {
			firstNode = lastNode;
		}
	}
	
	public T remove() {
		//throw exception is node is empty
		if(firstNode == null) throw new NoSuchElementException();
		
		T data = firstNode.data;
		
		//move first node one position
		firstNode = firstNode.nextNode;
		
		if(firstNode == null) {
			lastNode = null;
		}
		return data;
	}

	//look at the element at the top of the queue, without removing it
	public T peek() {
		//throw exception is node is empty
		if(firstNode == null) throw new NoSuchElementException();
		return firstNode.data;
	}
	
	public boolean isEmpty() {
		return firstNode == null;
	}
	
}
